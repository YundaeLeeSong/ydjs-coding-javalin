package assessment.sql.c;


import javaz.io.FileManager;
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

public class LabTest {

    Lab jdbc = new Lab();


    @BeforeEach
    public void beforeEach(){
        try {
            java.sql.Connection conn = javaz.util.ConnectionUtil.getConnection();
            for (String statement : FileManager.parseSqlFile("assessment/sql/c/jdbc_reset.sql")) { conn.prepareStatement(statement).executeUpdate(); } for (String statement : FileManager.parseSqlFile("assessment/sql/c/jdbc_setup.sql")) { conn.prepareStatement(statement).executeUpdate(); }
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
            for (String statement : FileManager.parseSqlFile("assessment/sql/c/jdbc_reset.sql")) {
                conn.prepareStatement(statement).executeUpdate();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createSongTest(){
        int counter = 0;
        Song song = new Song("song1", "artist1");
        jdbc.createSong(song);

        try {
            Connection connection = ConnectionUtil.getConnection();

            String sql = "select * from songs;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                counter++;
            }

        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }

        Assertions.assertEquals(4,counter);

    }

    @Test
    public void selectAllSongsTest(){
        List<Song> expectedResult = new ArrayList<>();

        try {
            Connection connection = ConnectionUtil.getConnection();

            String sql = "select * from songs;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                expectedResult.add(new Song(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }

        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }

        List<Song> actualResult = jdbc.getAllSongs();

        Assertions.assertEquals(expectedResult,actualResult);

    }
}


