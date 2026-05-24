package assessment.sql.a;


import javaz.util.ConnectionUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterATableTest {
    AlterATable alterATable = new AlterATable();


    @Test
    public void problem1Test(){
        alterATable.problem1();

        try {

            Connection connection = ConnectionUtil.getConnection();
            String sql = "select lastname from site_user;";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeQuery();

        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
            Assertions.fail();
        }
    }
    /**
     * The @BeforeEach annotation runs before every test so that way we create
     * the tables required prior to running the test
     */
    @BeforeEach
    public void beforeTest(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/altertable_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/altertable_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * The @AfterEach annotation runs after every test so that way we drop the
     * tables to avoid conflicts in future tests
     */
    @AfterEach
    public void cleanup(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/altertable_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
