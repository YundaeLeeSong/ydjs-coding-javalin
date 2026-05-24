package assessment.sql.b;


import javaz.util.ConnectionUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class OrderResultSetTest {
    private final OrderResultSetActivity orderResultSetActivity = new OrderResultSetActivity();
    private Connection conn;

    @Test
    public void problem1AlphabeticalOrder() {
        try {
            List<Character> expectedList = new LinkedList<>();
            expectedList.add(new Character(3, "Jessica", "Atreides"));
            expectedList.add(new Character(1, "Leto", "Atreides"));
            expectedList.add(new Character(4, "Paul", "Atreides"));
            expectedList.add(new Character(5, "Feyd-Rautha", "Harkonnen"));
            expectedList.add(new Character(2, "Vladimir", "Harkonnen"));


            List<Character> resultList = orderResultSetActivity.problem1();

            Assertions.assertEquals(expectedList, resultList);
        }catch(Exception e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
            fail();
        }
    }




    @BeforeEach
    public void beforeEach() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/orderby_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/orderby_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    public void afterEach() {
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : javaz.util.FileManager.parseSqlFile("src/test/resources/assessment/sql/b/orderby_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}