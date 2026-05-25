
/* 
This file is optional to edit and can be used for manual testing. 

Please be aware that manual testing does not affect the completion of your lab.
To ensure your lab is complete, you are required to run and pass the tests in the Testing tab.
*/

public class Main {
    /**
     * The entry point of the application.
     * 
     * This method creates a Parrot object and manually tests its copy() method by calling it several times with varying arguments and printing out the results.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        System.out.println("The copy() method in the Parrot class should return the same value that was passed to it.");
        Parrot parrot = new Parrot();

        System.out.println("Here's what the copy() method returns when provided the value \"repeat after me\"");
        String val1 = "repeat after me";
        String output1 = parrot.copy(val1);
        System.out.println(output1);

        System.out.println("Here's what the copy() method returns when provided the value \"hello\"");
        String val2 = "hello";
        String output2 = parrot.copy(val2);
        System.out.println(output2);
    }
}
