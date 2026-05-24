package assessment.sql.b;


import javaz.util.ConnectionUtil;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class OuterJoinTest {
    private final OuterJoinActivity outerJoinActivity = new OuterJoinActivity();
    private static Connection conn;



    @Test
    public void activityOuterJoin1() {
        Set<ExampleEntity> expected = new HashSet<>();
        expected.add(new ExampleEntity("Physics", "Ms. Lovelace", "Robert Riggle", ""));
        expected.add(new ExampleEntity("Physics", "Ms. Lovelace", "Stephen Colbert", ""));
        expected.add(new ExampleEntity("Math", "Ms. Lovelace", "Samantha Bee", ""));
        expected.add(new ExampleEntity("Writing", "Mr. McCarthy", "Aasif Mandvi", ""));
        expected.add(new ExampleEntity("Writing", "Mr. McCarthy", "John Stewart", ""));
        expected.add(new ExampleEntity("Biology", "Ms. Goodall", null, ""));

        Set<ExampleEntity> result = outerJoinActivity.problem1();

        Assertions.assertEquals(expected, result);


    }

    @Test
    public void activityOuterJoin2() {
        Set<ExampleEntity> expected = new HashSet<>();
        expected.add(new ExampleEntity("Physics", "Ms. Lovelace", "", "Motion 101"));
        expected.add(new ExampleEntity("Math", "Ms. Lovelace", "", "What even is modulus anyway?"));
        expected.add(new ExampleEntity("Biology", "Ms. Goodall", "", "Lions, Tigers, and Organs 5th ed"));
        expected.add(new ExampleEntity("Writing", "Mr. McCarthy", "", "The Story Circle Workbook"));
        expected.add(new ExampleEntity(null, null, "", "Teenage Mutant Ninja Turtles #10"));

        Set<ExampleEntity> result = outerJoinActivity.problem2();

        Assertions.assertEquals(expected, result);


    }
























    @BeforeAll
    public static void beforeAll() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/outerjoin_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/outerjoin_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    @BeforeEach
    public void beforeEach() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/outerjoin_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/outerjoin_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    public void afterEach() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/outerjoin_reset.sql")) {
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
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/outerjoin_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}