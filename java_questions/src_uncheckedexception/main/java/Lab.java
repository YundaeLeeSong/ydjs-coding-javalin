public class Lab {
    /**
     * Java provides a class "RuntimeException" which functions like "Exception", but will not
     * require you add either a "throws" declaration or a "try/catch" statement. Because
     * "RuntimeException" is just a type of "Exception", you can throw a "RuntimeException"
     * using the line
     *      throw new RuntimeException();
     * We can refer to an "Unchecked Exception" as a "RuntimeException" and a "Checked Exception" as
     * just "Exception" - the terms here are interchangeable, where "Checked" refers to the
     * mandatory handling of an exception by the compiler. When you throw a "RuntimeException"
     * in the method below, you can notice that you can run the program without the need for the
     * "throws" or "try/catch" statement.
     *
     * TODO: throw a RuntimeException.
     */
    public void throwUncheckedException(){
        throw new RuntimeException();
    }
    /**
     * Unchecked exceptions will typically occur as a result of program errors that the program
     * should not realistically encounter as they refer more so to logical mistakes
     * rather than unpredictable events. For instance, let's say that we have Strings `str1`
     * and `str2`:
     *      String str1 = "123";
     *      String str2 = "hello";
     * We can then attempt to parse these Strings as numbers using the lines
     *      int a = Integer.parseInt(str1);
     *      int b = Integer.parseInt(str2);
     * The second of these lines will cause a RuntimeException (more specifically, a
     * NumberFormatException), as the authors of the Integer.parseInt method expect you,
     * the programmer, to have avoided situations such as these by first ensuring that the String
     * is in a numeric format. That makes the NumberFormatException a logical mistake.
     *
     * For servers written in Java, an unchecked exception like this may result in a "500 error" or
     * other type of "unexpected issue" notification for the user.
     *
     * TODO: cause a situation where a NumberFormatException is thrown.
     */
    public void causeNumberFormatException(){
        Integer.parseInt("str1");
        return;
    }

    /**
     * Java will also inherently throw RuntimeException in many scenarios related to basic coding
     * errors, such as
     *
     *      - creating numbers that are too large for their containing primitive type (eg an
     *      int over 2.147 billion)
     *      - accessing a non-existent index of an array
     *      - dividing by zero
     *      - invoking a method on an Object that is a null value
     *
     * TODO: cause an unchecked exception that isn't a plain RuntimeException or a
     * NumberFormatException.
     */
    public void causeUncheckedException(){
        int i = 2 / 0;
        return;
    }
}
