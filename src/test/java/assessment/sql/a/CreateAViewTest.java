package assessment.sql.a;


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

public class CreateAViewTest {

    CreateAView createAView = new CreateAView();


    @Test
    public void problemTest(){
        createAView.problem1();

        List<User> expectedResult = new ArrayList<>();
        List<User> actualResult = new ArrayList<>();

        try {

            Connection connection = ConnectionUtil.getConnection();
            String sql = "SELECT * FROM firstname_lastname;";

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                actualResult.add(new User(rs.getString(1), rs.getString(2)));
            }

            String sql2 = "SELECT firstname, lastname FROM site_user;";

            ps = connection.prepareStatement(sql2);

            rs = ps.executeQuery();

            while(rs.next()){
                expectedResult.add(new User(rs.getString(1), rs.getString(2)));
            }

        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
            Assertions.fail();
        }

        Assertions.assertEquals(expectedResult,actualResult);
    }


















    /**
     * The @BeforeEach annotation runs before every test so that way we create
     * the tables required prior to running the test
     */
    @BeforeEach
    public void beforeEach(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/createview_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/createview_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * The @AfterEach annotation runs after every test so that way we drop the
     * tables to avoid conflicts in future tests
     */
    @AfterEach
    public void afterEach(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/a/createview_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
