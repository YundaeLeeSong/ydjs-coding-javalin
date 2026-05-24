package assessment.sql.a;


import javaz.util.ConnectionUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DropATableTest {
    private DropATable dropATable = new DropATable();

    /**
     * The before annotation runs before every test so that way we drop the tables to avoid conflicts in future tests
     */
    @BeforeEach
    public void beforeTest(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/droptable_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/droptable_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * The after annotation runs after every test so that way we drop the tables to avoid conflicts in future tests
     */
    @AfterEach
    public void afterEach(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/droptable_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *  In programming we utilize try / catch constructs to catch when there are potential for errors / exceptions.
     *  For this test, if I am able to insert a song into the songs table, then the songs table was never dropped and the test should fail.
     */
    @Test
    public void dropTableTest(){
        try {
            dropATable.problem1();
            Connection connection = ConnectionUtil.getConnection();
            String sql = "INSERT INTO song (Title, Artist) VALUES ('Let it be', 'Beatles');";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("problem1: Table 'song' was not dropped.");
            Assertions.fail();
        } catch (SQLException e) {}
    }
}
