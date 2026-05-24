package assessment.sql.c;


import javaz.util.ConnectionUtil;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilteringLogicTest {
    private final FilteringLogicActivity filteringLogicActivity = new FilteringLogicActivity();
    private static Connection conn;



    @Test
    public void testActivityFindEmployeesAnd() {
        Set<Employee> expectedList = new HashSet<>();
        expectedList.add(new Employee(3, "Steve", "Jones", 99890.99));

        Set<Employee> resultList = filteringLogicActivity.problem1();

        assertEquals(expectedList, resultList);
    }

    @Test
    public void testActivityFindEmployeesOr() {
        Set<Employee> expectedList = new HashSet<>();
        expectedList.add(new Employee(2, "Alexa", "Smith", 42500));
        expectedList.add(new Employee(4, "Brandon", "Smith", 120000));

        Set<Employee> resultList = filteringLogicActivity.problem2();

        assertEquals(expectedList, resultList);
    }

    @Test
    public void testActivityFindEmployeesNotIn() {
        Set<Employee> expectedList = new HashSet<>();
        expectedList.add(new Employee(5, "Adam", "Jones", 55050.50));
        expectedList.add(new Employee(4, "Brandon", "Smith", 120000));

        Set<Employee> resultList = filteringLogicActivity.problem3();

        assertEquals(expectedList, resultList);
    }

    @BeforeAll
    public static void beforeAll() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/selectwhereandor_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/selectwhereandor_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @BeforeEach
    public void beforeEach() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/selectwhereandor_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/selectwhereandor_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    public void afterEach() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/selectwhereandor_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    public static void afterAll() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/selectwhereandor_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
