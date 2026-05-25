package veeva.sql.a;

import javaz.io.FileManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javaz.util.ConnectionUtil;

import static org.junit.jupiter.api.Assertions.*;

public class SecondHighestSalaryTest {

    private Connection conn;

    @BeforeEach
    public void setup() throws Exception {
        conn = ConnectionUtil.getConnection();
        Statement stmt = conn.createStatement();
        for (String setupSql : FileManager.parseSqlFile("veeva/sql/a/second_highest_salary_reset.sql")) {
            stmt.execute(setupSql);
        }
    }

    @AfterEach
    public void teardown() throws Exception {
        if (conn != null) {
            Statement stmt = conn.createStatement();
            for (String setupSql : FileManager.parseSqlFile("veeva/sql/a/second_highest_salary_reset.sql")) {
                stmt.execute(setupSql);
            }
        }
    }

    @Test
    public void testSecondHighestSalary() throws Exception {
        Statement stmt = conn.createStatement();
        for (String setupSql : FileManager.parseSqlFile("veeva/sql/a/second_highest_salary_setup.sql")) {
            stmt.execute(setupSql);
        }

        String sql = FileManager.readFile(SecondHighestSalary.SQL_FILE_PATH);
        ResultSet rs = stmt.executeQuery(sql);

        assertTrue(rs.next());
        assertEquals(200, rs.getInt(1)); // The second highest salary
    }
}


