package assessment.sql.c;


import javaz.util.ConnectionUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UpdateARecordTest {
    UpdateARecord updateARecord = new UpdateARecord();

    /**
     * In this test we are querying everything in the users table to ensure that Alexa was successfully updated to "Rush".
     */
    @Test
    public void problem1Test(){
        //arrange
        User user1 = new User(1,"Steve","Garcia");
        User user2 = new User(2,"Alexa", "Rush");
        User user3 = new User(3,"Steve","Jones");
        User user4 = new User(4, "Brandon", "Smith");
        User user5 = new User(5,"Adam","Jones");
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(user1);
        expectedResult.add(user2);
        expectedResult.add(user3);
        expectedResult.add(user4);
        expectedResult.add(user5);


        //act
        updateARecord.problem1();

        List<User> actualResult = new ArrayList<>();

        try {
            Connection connection = ConnectionUtil.getConnection();

            String sql = "SELECT * FROM site_user;";

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                actualResult.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }

        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
        }

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
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/update_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/update_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
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
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/c/update_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
