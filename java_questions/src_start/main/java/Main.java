/* 
This file is optional to edit and can be used for manual testing. 

Please be aware that manual testing does not affect the completion of your lab.
To ensure your lab is complete, you are required to run and pass the tests in the Testing tab.
*/

public class Main {
    /**
     * The entry point of the application.
     * 
     * This method calls each of the "question" methods, saves the results into variables, and prints out the variable values.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        // save the returned values of each "question" into a variable
        Questions questions = new Questions();
        int result1 = questions.question1();
        int result2 = questions.question2();
        String result3 = questions.question3();

        // print the variable's value to the console
        System.out.println("Question1 returns: " + result1);
        System.out.println("Question2 returns: " + result2);
        System.out.println("Question3 returns: " + result3);
    }
}
