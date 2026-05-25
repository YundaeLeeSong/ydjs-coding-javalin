package assessment.sql.a;


import javaz.util.ConnectionUtil;
import javaz.io.FileManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * SQL sublanguage: DDL (Data Definition Language)
 *
 * In the last activity we learned how to create tables in SQL. In this activity
 * we are going to learn how to drop a table from our database.
 *
 * The syntax for dropping a table is as follows:
 * DROP TABLE table_name;
 */
public class DropATable {

    /**
     *      Task: Drop the table "song"
     *      song Table Diagram:
     *      |      title        |        artist         |
     *      ---------------------------------------------
     *      |'Let it be'        |'Beatles'              |
     *      |'Hotel California' |'Eagles'               |
     *      |'Kashmir'          |'Led Zeppelin'         |
     *
     * NOTE: Do not change anything in this code. You should write your sql
     * statement on a single line (do not use multi-line formatting) in the
     * problem1.sql file.
     *
     */
    public void problem1(){
        String sql = FileManager.parseSqlFile("assessment/sql/a/droptable_problem1.sql").get(0);

        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement s = connection.createStatement();
            s.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
        }
    }

}


