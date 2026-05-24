package assessment.sql.a;

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

public class CreateTableWithForeignKeyTest {
    CreateTableWithForeignKey createTableWithForeignKey = new CreateTableWithForeignKey();

    /**
     * This test calls the method with the SQL syntax that you wrote and then we are retrieving everything in the users table to ensure that Alexa was successfully updated.
     */
    @Test
    public void problem1Test(){
        //arrange
        User user1 = new User(1,"Steve","Garcia");
        User user2 = new User(2,"Alexa", "Smith");
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
        createTableWithForeignKey.problem1();

        try {
            Connection connection = ConnectionUtil.getConnection();
            String sql = "INSERT INTO post (post, user_fk) VALUES ('test post123', 1)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            afterEach();
            System.out.println("problem1: " + e.getMessage() + '\n');
            Assertions.fail();
        }
    }

    /**
     * This test checks if you can input a fk that doesn't exist in the users table.
     */
    @Test
    public void problem1TestRefIntegrity(){
        //arrange
        User user1 = new User(1,"Steve","Garcia");
        User user2 = new User(2,"Alexa", "Smith");
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
        createTableWithForeignKey.problem1();

        try {
            Connection connection = ConnectionUtil.getConnection();

            String sql = "INSERT INTO post (post, user_fk) VALUES ('test post123', 100)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
            //if executing the query doesn't throw an exception, then the test should fail.
            System.out.println("problem1: foreign key constraint not added. \n");
            Assertions.fail();
        } catch (SQLException e) {
            if(e.getMessage().contains("Table \"POST\" not found;")){
                Assertions.fail();
            }
        }
    }


















    /**
     * The @BeforeEach annotation runs before every test so that way we create the tables required prior to running the test
     */
    @BeforeEach
    public void beforeTest(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/foreignkey_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/foreignkey_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * The @AfterEach annotation runs after every test so that way we drop the tables to avoid conflicts in future tests
     */
    @AfterEach
    public void afterEach(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/foreignkey_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
