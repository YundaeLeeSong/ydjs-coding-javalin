package assessment.sql.s;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.nio.file.Files;
import java.nio.file.Paths;

import javaz.util.ConnectionUtil;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeRestonTest {

    private Connection conn;

    @BeforeEach
    public void setup() throws Exception {
        conn = ConnectionUtil.getConnection();
        Statement stmt = conn.createStatement();
        // Drop tables if exist
        for (String setupSql : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/s/employee_reston_reset.sql")) {
            stmt.execute(setupSql);
        }
    }

    @AfterEach
    public void teardown() throws Exception {
        // Do not close connection since it's a singleton without a re-init mechanism.
        // We just clear the tables so it's fresh for next run.
        if (conn != null) {
            Statement stmt = conn.createStatement();
            for (String setupSql : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/s/employee_reston_reset.sql")) {
                stmt.execute(setupSql);
            }
        }
    }

    @Test
    public void testEmployeeReston() throws Exception {
        Statement stmt = conn.createStatement();
        for (String setupSql : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/s/employee_reston_setup.sql")) {
            stmt.execute(setupSql);
        }

        String sql = new String(Files.readAllBytes(Paths.get(EmployeeReston.SQL_FILE_PATH)));
        ResultSet rs = stmt.executeQuery(sql);

        assertTrue(rs.next());
        assertEquals("Sophie", rs.getString("name"));
        assertEquals("Reston", rs.getString("city"));

        assertTrue(rs.next());
        assertEquals("Ava", rs.getString("name"));
        assertEquals("Reston", rs.getString("city"));
        
        assertFalse(rs.next());
    }
}
