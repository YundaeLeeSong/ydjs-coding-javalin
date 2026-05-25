package practice.java.i;

/**
 * Unchecked Exception Challenge
 * 
 * Java provides a class "RuntimeException" which functions like "Exception",
 * but will not require you add either a "throws" declaration or a "try/catch"
 * statement. Because "RuntimeException" is just a type of "Exception", you can
 * throw a "RuntimeException" using the line throw new RuntimeException();
 * 
 * Unchecked exceptions will typically occur as a result of program errors that
 * the program should not realistically encounter as they refer more so to
 * logical mistakes rather than unpredictable events.
 */
public class UncheckedException {
    /**
     * @throws RuntimeException a runtime exception
     */
    public void throwUncheckedException() {
        throw new RuntimeException();
    }
    
    /**
     * @throws NumberFormatException by doing an invalid parse
     */
    public void causeNumberFormatException() {
        Integer.parseInt("str1");
    }

    /**
     * Java will also inherently throw RuntimeException in many scenarios related
     * to basic coding errors, such as dividing by zero.
     */
    public void causeUncheckedException() {
        int i = 2 / 0;
    }
}
