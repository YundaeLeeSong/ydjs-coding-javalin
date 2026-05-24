package assessment.sql.b;


import javaz.util.ConnectionUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilterRecordsTest {
    FilterRecords filterRecords = new FilterRecords();

    /**
     * This test calls the problem1 method and then compares it to the hardcoded list here, if they are the same then
     * the test passes.
     */
    @Test
    public void problem1GetAllSmiths(){
        //arrange
        User user1 = new User(2,"Alexa", "Smith", 42500.00);
        User user2 = new User(4, "Brandon", "Smith", 120000.00);
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(user1);
        expectedResult.add(user2);

        //act
        List<User> actualResult = filterRecords.problem1();

        //assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**
     * This test calls the problem2 method and then compares it to the hardcoded list here, if they are the same then
     * the test passes.
     */
    @Test
    public void problem2SalaryGreaterThan(){
        //arrange
        User user1 = new User(3,"Steve", "Jones", 99890.99);
        User user2 = new User(4, "Brandon", "Smith", 120000.00);
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(user1);
        expectedResult.add(user2);

        //act
        List<User> actualResult = filterRecords.problem2();

        //assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**
     * The @BeforeEach annotation runs before every test so that way we create the tables required prior to running the test
     */
    @BeforeEach
    public void beforeTest(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/selectwhere_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/selectwhere_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
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
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/selectwhere_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
