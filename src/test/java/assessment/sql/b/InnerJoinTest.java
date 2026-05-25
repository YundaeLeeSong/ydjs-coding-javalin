package assessment.sql.b;

import javaz.io.FileManager;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.util.HashSet;
import java.util.Set;

public class InnerJoinTest {
    private final InnerJoinActivity innerJoinActivity = new InnerJoinActivity();
    private static Connection conn;

    @Test
    public void testActivityInnerJoin1() {
        Set<Pair<Integer, String>> expected = new HashSet<>();
        expected.add(new Pair<Integer, String>(2, "Stephen Colbert"));
        expected.add(new Pair<Integer, String>(3, "Samantha Bee"));
        expected.add(new Pair<Integer, String>(5, "Robert Riggle"));


        Set<Pair<Integer, String>> result = innerJoinActivity.problem1();

        Assertions.assertEquals(expected, result);

    }

    @BeforeAll
    public static void beforeAll() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : FileManager.parseSqlFile("assessment/sql/b/innerjoin_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : FileManager.parseSqlFile("assessment/sql/b/innerjoin_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    @BeforeEach
    public void beforeEach() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : FileManager.parseSqlFile("assessment/sql/b/innerjoin_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : FileManager.parseSqlFile("assessment/sql/b/innerjoin_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    public void afterEach() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : FileManager.parseSqlFile("assessment/sql/b/innerjoin_reset.sql")) {
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
            for (String statement : FileManager.parseSqlFile("assessment/sql/b/innerjoin_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

