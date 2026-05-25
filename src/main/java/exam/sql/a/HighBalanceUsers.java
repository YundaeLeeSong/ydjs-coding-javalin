package exam.sql.a;

/**
 * You are given 2 tables from a database, and it's your job to find the users
 * that currently have both a checking and savings account with a balance of
 * more than $1000 in at least one of the two accounts.
 * 
 * The database schema looks like this:
 * 
 * users
 * id    first_name    last_name
 * 1     Carl          Smith
 * 2     Stacy         Jenkins
 * 3     Greg          Marco
 * 4     Barbara       Stanley
 * 
 * *id is the primary key
 * 
 * accounts
 * id    user_id       account_type    balance
 * 1     1             Checking        1050
 * 2     1             Savings         900
 * 3     2             Checking        200
 * 4     2             Savings         300
 * 5     3             Checking        12500
 * 6     3             Savings         900
 * 7     4             Checking        20
 * 8     4             Savings         500
 * 
 * *id is the primary key
 * *user_id is the foreign key relating to the id of the users table
 * 
 * You will need to write a query that will display the first_name and last_name
 * for the records in the users table that have more than $1000 in either their
 * checking and savings account found in the accounts table.
 */
public class HighBalanceUsers {
    public static final String SQL_FILE_PATH = "exam/sql/a/high_balance_users.sql";
}


