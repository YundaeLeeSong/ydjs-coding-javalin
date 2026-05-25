package assessment.sql.a;


import javaz.io.FileManager;
import javaz.util.ConnectionUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.fail;

public class CreateATableTest {

    private CreateATable createATable = new CreateATable();

    /**
     * The @AfterEach annotation runs after every test so that way we drop the
     * tables to avoid conflicts in future tests
     */
    @AfterEach
    public void afterEach(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : FileManager.parseSqlFile("assessment/sql/a/createtable_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }   

    /**
     * To test that the table exists, we are attempting to insert a row into the
     * table and if table does not exist,
     * the test will fail.
     */
    @Test
    public void problem1Test(){
        try {
            createATable.problem1();
            Connection connection = ConnectionUtil.getConnection();
            String sql = "INSERT into song (Title, Artist) VALUES ('Let it Be', 'Beatles')";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
            fail();
        }
    }

}


