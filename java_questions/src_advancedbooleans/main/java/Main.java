// This file is optional to edit and can be used for manual testing.

public class Main {

    /**
     * The entry point of the application.
     * 
     * This method creates an AdvancedBooleanLogic object and manually tests its
     * methods by calling them and printing out the results.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        AdvancedBooleanLogic abl = new AdvancedBooleanLogic();
        
        //NOTE: The values below will be incorrect until you update AdvancedBooleanLogic.java with the correct logic
        System.out.println("~~~~returnNotBoth()~~~~");
        System.out.println("Input: b1=true and b2=true   | Expected: false | Actual: " + abl.returnNotBoth(true, true));
        System.out.println("Input: b1=true and b2=false  | Expected: true  | Actual: " + abl.returnNotBoth(true, false));
        System.out.println("Input: b1=false and b2=true  | Expected: true  | Actual: " + abl.returnNotBoth(false, true));
        System.out.println("Input: b1=false and b2=false | Expected: true  | Actual: " + abl.returnNotBoth(false, false));

        System.out.println("\n~~~~returnExclusiveOr()~~~~");
        System.out.println("Input: b1=true and b2=true   | Expected: false | Actual: " + abl.returnExclusiveOr(true, true));
        System.out.println("Input: b1=true and b2=false  | Expected: true  | Actual: " + abl.returnExclusiveOr(true, false));
        System.out.println("Input: b1=false and b2=true  | Expected: true  | Actual: " + abl.returnExclusiveOr(false, true));
        System.out.println("Input: b1=false and b2=false | Expected: false | Actual: " + abl.returnExclusiveOr(false, false));

        System.out.println("\n~~~~returnNeitherNor()~~~~");
        System.out.println("Input: b1=true and b2=true   | Expected: false | Actual: " + abl.returnNeitherNor(true, true));
        System.out.println("Input: b1=true and b2=false  | Expected: false | Actual: " + abl.returnNeitherNor(true, false));
        System.out.println("Input: b1=false and b2=true  | Expected: false | Actual: " + abl.returnNeitherNor(false, true));
        System.out.println("Input: b1=false and b2=false | Expected: true  | Actual: " + abl.returnNeitherNor(false, false));
    }
}
