package exam.sql.a;

/**
 * Given the following tables:
 * Employee
 * ID    Name      Salary         Location_id
 * 1     Sophie    $67,890.00     1
 * 2     Ava       $176,345.00    1
 * 3     Kieran    $124,563.00    3
 * 4     Landon    $53,465.00     2
 * 5     Xander    $67,893.00     2
 * 
 * Location
 * ID    City
 * 1     Reston
 * 2     Arlington
 * 3     Los Angeles
 * 
 * Write an SQL query that returns the name and city of all employees in Reston.
 */
public class EmployeeReston {
    public static final String SQL_FILE_PATH = "src/main/resources/exam/sql/a/employee_reston.sql";
}
