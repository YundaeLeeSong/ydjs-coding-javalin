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

public class FilterColumnsTest {
    FilterColumns filterColumns = new FilterColumns();

    /**
     * This test compares the result of the problem1 method to the hardcoded
     * values below which ensures that only the
     * firstname column is retrieved.
     */
    @Test
    public void problem1Test(){
        //arrange
        User user1 = new User(0, "Steve", null, null);
        User user2 = new User(0,"Alexa", null, null);
        User user3 = new User(0,"Steve",null, null);
        User user4 = new User(0, "Brandon", null, null);
        User user5 = new User(0,"Adam",null, null);
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(user1);
        expectedResult.add(user2);
        expectedResult.add(user3);
        expectedResult.add(user4);
        expectedResult.add(user5);

        //act
        List<User> actualResult = filterColumns.problem1();

        //assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**
     * The @BeforeEach annotation runs before every test so that way we create
     * the tables required prior to running the test
     */
    @BeforeEach
    public void beforeTest(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/selectcolumns_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/selectcolumns_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * The @AfterEach annotation runs after every test so that way we drop the
     * tables to avoid conflicts in future tests
     */
    @AfterEach
    public void cleanup(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/selectcolumns_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
