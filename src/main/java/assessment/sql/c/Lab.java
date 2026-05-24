package assessment.sql.c;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaz.util.ConnectionUtil;

/**
 * JDBC stands for Java DataBase Connectivity.  It is utilized to connect our java code with a database.
 * JDBC will allow us to execute SQL statements from java and retrieve the result set of that query to be utilized in java
 *
 * JDBC datatypes to know:
 *  - Connection: Creates an active connection to the database.
 *  - Statement: An object that represents a SQL statement to be executed.
 *  - ResultSet: An object that represents the virtual table return from a query (Only needed for executing DQL statements)
 *
 * Background:
 * Assume we have the following table:
 *      songs table
 *      |   id  |      title        |        artist         |
 *      -----------------------------------------------------
 *      |1      |'Let it be'        |'Beatles'              |
 *      |2      |'Hotel California' |'Eagles'               |
 *      |3      |'Kashmir'          |'Led Zeppelin'         |
 *
 * Assignment: Write JDBC logic in the methods below to achieve the following
 *                  - create a new song in our songs database table
 *                  - retrieve all songs from our database table
 *
 * If this is your first time working with JDBC, I recommend reading through the JDBCWalkthrough file that displays how to use JDBC for a similar scenario.
 *
 * NOTE: Please write the SQL statement on a single line (do not use multi-line formatting).
 */
public class Lab {

    public void createSong(Song song)  {
        try {
            Connection conn = ConnectionUtil.getConnection();
            String sql = "INSERT INTO songs (title, artist) VALUES ('" + song.getTitle() + "', '" + song.getArtist() + "');";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public List<Song> getAllSongs() {
        List<Song> songs = new ArrayList<>();
        
        try {
            Connection conn = ConnectionUtil.getConnection();
            String sql = "SELECT * FROM songs;";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                Song curr = new Song(result.getInt(1), result.getString(2), result.getString(3));
                songs.add(curr);
            }
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
 
        return songs;
    }
}
