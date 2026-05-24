package veeva.sql.a;

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

public class OverlappingDatesTest {

    private Connection conn;

    @BeforeEach
    public void setup() throws Exception {
        conn = ConnectionUtil.getConnection();
        Statement stmt = conn.createStatement();
        for (String setupSql : javaz.util.FileManager.parseSqlFile("src/test/resources/veeva/sql/a/overlapping_dates_reset.sql")) {
            stmt.execute(setupSql);
        }
    }

    @AfterEach
    public void teardown() throws Exception {
        if (conn != null) {
            Statement stmt = conn.createStatement();
            for (String setupSql : javaz.util.FileManager.parseSqlFile("src/test/resources/veeva/sql/a/overlapping_dates_reset.sql")) {
                stmt.execute(setupSql);
            }
        }
    }

    @Test
    public void testOverlappingDates() throws Exception {
        Statement stmt = conn.createStatement();
        for (String setupSql : javaz.util.FileManager.parseSqlFile("src/test/resources/veeva/sql/a/overlapping_dates_setup.sql")) {
            stmt.execute(setupSql);
        }

        String sql = new String(Files.readAllBytes(Paths.get(OverlappingDates.SQL_FILE_PATH)));
        ResultSet rs = stmt.executeQuery(sql);

        assertTrue(rs.next());
        assertEquals(1, rs.getInt("sub_id_1"));
        assertEquals(2, rs.getInt("sub_id_2"));

        assertFalse(rs.next());
    }
}
