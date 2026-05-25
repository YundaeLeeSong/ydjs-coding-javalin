import Model.Album;

public class Application {
    /**
     * This class contains a main method that allows you to manually test the Instantiation lab functionality.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     */
    public static void main(String[] args) {
        Lab inst = new Lab();
        System.out.println("An uninstantiated Object is a 'null' value in Java.");
        System.out.println("If we try to use a null Object like an instantiated Object,");
        System.out.println("We would probably get a NullPointerException, which would crash this program.");
        System.out.println("For instance, attempting to use labPart1's toString() method:");
        Album obj1 = inst.labPart1();
        System.out.println(obj1.toString());
        System.out.println("Next, we'll try the labPart2's toString method:");
        Object obj2 = inst.labPart2();
        System.out.println(obj2.toString());
        System.out.println("Finally, we'll try the labPart3: ");
        String obj3 = inst.labPart3();
        System.out.println(obj3.toString());
    }
}
