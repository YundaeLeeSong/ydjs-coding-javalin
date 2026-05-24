package assessment.sql.c;


import javaz.util.ConnectionUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TruncateTest {

    private Truncate truncate = new Truncate();


    @Test
    public void problem1Test(){
        truncate.problem1();

        //Write SQL statement here
        String sql = "SELECT * FROM song;";
        int counter = 0;

        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                counter++;
            }

        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
            Assertions.fail();
        }
        Assertions.assertEquals(0, counter);
    }

    /**
     * The @BeforeEach annotation runs before every test so that way we create the tables required prior to running the test
     */
    @BeforeEach
    public void beforeTest(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/truncate_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/truncate_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * The @AfterEach annotation runs after every test so that way we drop the tables to avoid conflicts in future tests
     */
    @AfterEach
    public void cleanup(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/truncate_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
