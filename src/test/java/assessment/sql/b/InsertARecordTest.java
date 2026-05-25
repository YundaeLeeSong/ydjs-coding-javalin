package assessment.sql.b;


import javaz.io.FileManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InsertARecordTest {

    private InsertARecord insertARecord = new InsertARecord();

    /**
     * The @AfterEach annotation runs after every test so that way we drop the
     * tables to avoid conflicts in future tests
     */
    @BeforeEach
    public void beforeEach(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : FileManager.parseSqlFile("assessment/sql/b/insert_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
            for (String statement : FileManager.parseSqlFile("assessment/sql/b/insert_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : FileManager.parseSqlFile("assessment/sql/b/insert_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * The after annotation runs after every test so that way we drop the tables
     * to avoid conflicts in future tests
     */
    @AfterEach
    public void afterEach(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : FileManager.parseSqlFile("assessment/sql/b/insert_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * DML statements return the number of rows affected. The problem1 method
     * will return true if the number of rows affected is greater than 0 and
     * false if it's 0.
     * If the test returns true then the insert statement was successful and if
     * it is false then it was unsuccessful.
     */
    @Test
    public void addSongTest(){
        Assertions.assertTrue(insertARecord.problem1());
    }
}


