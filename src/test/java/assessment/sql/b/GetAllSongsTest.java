package assessment.sql.b;


import javaz.io.FileManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GetAllSongsTest {

    GetAllSongs getAllSongs = new GetAllSongs();

    /**
     * The @BeforeEach annotation runs before every test so that way we create
     * the tables required prior to running the test
     */
    @BeforeEach
    public void beforeTest(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : FileManager.parseSqlFile("assessment/sql/b/selectall_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : FileManager.parseSqlFile("assessment/sql/b/selectall_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
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
            for (String statement : FileManager.parseSqlFile("assessment/sql/b/selectall_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * In this test we have a hardcoded version of that same list in java.
     * This test calls the method with the SQL syntax that you wrote and then
     * compares it to the hardcoded list here, if they are the same then the
     * test passes.
     */
    @Test
    public void getAllSongsTest(){
        //arrange
        Song song1 = new Song("Let it be", "Beatles");
        Song song2 = new Song("Hotel California", "Eagles");
        Song song3 = new Song("Kashmir", "Led Zeppelin");
        List<Song> expectedResult = new ArrayList<>();
        expectedResult.add(song1);
        expectedResult.add(song2);
        expectedResult.add(song3);

        //act
        List<Song> actualResult = getAllSongs.problem1();

        //assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
}


