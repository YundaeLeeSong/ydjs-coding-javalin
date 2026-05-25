import java.util.Arrays;

public class Application {
    /**
     * This class contains a main method that allows you to manually test the UncheckedException challenge functionality.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * The Lab.throwUncheckedException method should throw an unchecked exception.
     */
    public static void main(String[] args) {
        Lab thrower = new Lab();
        try{
            System.out.println("The lab code should throw an unchecked exception, " +
                    "causing a stack trace to be printed to console here:");
            thrower.throwUncheckedException();
            System.out.println("\nIf this line was printed to console, " +
                    "then throwing an exception was unsuccessful.");
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        try{
            System.out.println("The lab code should throw NumberFormatException, " +
                    "causing a stack trace to be printed to console here:");
            thrower.causeNumberFormatException();
            System.out.println("\nIf this line was printed to console, " +
                    "then throwing an exception was unsuccessful.");
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        try{
            System.out.println("The lab code should throw some other unchecked exception, " +
                    "causing a stack trace to be printed to console here:");
            thrower.causeUncheckedException();
            System.out.println("\nIf this line was printed to console, " +
                    "then throwing an exception was unsuccessful.");
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}