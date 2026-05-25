package assessment.sql.a;


import javaz.io.FileManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AggregateFunctionsTest {
    private final AggregateFunctionsActivity aggregateFunctionsActivity = new AggregateFunctionsActivity();

    @Test
    public void testActivityCalculatePayroll() {
        Double expectedValue = 67400.00 + 42500.00 + 99890.99 + 120000 + 55050.50;
        Double resultValue = aggregateFunctionsActivity.problem1();

        Assertions.assertEquals(expectedValue, resultValue);

    }

    @Test
    public void testActivityCountTheSmiths() {
        int expectedValue = 2;
        int resultValue = aggregateFunctionsActivity.problem2();

        Assertions.assertEquals(expectedValue, resultValue);

    }

    @Test
    public void testActivityFindMinSalary() {
        Double expected = 42500.00;
        Double result = aggregateFunctionsActivity.problem3();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testActivityFindMaxSalary() {
        Double expected = 120000.00;
        Double result = aggregateFunctionsActivity.problem4();

        Assertions.assertEquals(expected, result);
    }



















    @BeforeEach
    public void beforeEach() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : FileManager.parseSqlFile("assessment/sql/a/aggregatefunctions_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : FileManager.parseSqlFile("assessment/sql/a/aggregatefunctions_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    public void afterEach() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : FileManager.parseSqlFile("assessment/sql/a/aggregatefunctions_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


