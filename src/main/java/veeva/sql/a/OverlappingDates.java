package veeva.sql.a;

/**
 * Question 4: SQL Querying (Relational Data) - Overlapping Dates
 * 
 * Write a query to find overlapping date ranges for user subscriptions.
 * Return the pairs of subscription IDs (sub_id_1, sub_id_2) that overlap 
 * for the same user, where sub_id_1 < sub_id_2.
 * 
 * The database schema looks like this:
 * 
 * Subscriptions
 * sub_id  user_id  start_date   end_date
 * 1       1        2023-01-01   2023-01-31
 * 2       1        2023-01-15   2023-02-15
 * 3       2        2023-01-01   2023-01-31
 * 4       2        2023-02-01   2023-02-28
 * 
 * *sub_id is the primary key
 */
public class OverlappingDates {
    public static final String SQL_FILE_PATH = "veeva/sql/a/overlapping_dates.sql";
}


