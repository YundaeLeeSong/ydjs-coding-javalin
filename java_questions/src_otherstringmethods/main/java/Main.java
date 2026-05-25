// This file is optional to edit and can be used for manual testing.

public class Main {

    /**
     * The entry point of the application.
     * 
     * This method creates an OtherStringMethods object and manually tests its
     * methods by calling them and printing out the results.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        OtherStringMethods osm = new OtherStringMethods();
        String str = "Revature";

        // Substrings
        System.out.println("\nSubstrings...");
        System.out.println("Given the string value '" + str + "'...");
        System.out.println(
                "The substring between index 2 (inclusive) and 5 (exclusive) should return 'vat', Actual output: "
                        + osm.partOfString(str, 2, 5));

        // Comparisons
        System.out.println("\nComparisons...");
        System.out.println(
                "Comparing the string 'revature' to 'Revature', Expected Output: a positive number,  Actual output: "
                        + osm.compareLexigraphically("revature", "Revature"));
        System.out.println(
                "Comparing the string 'Revature' to 'revature', Expected Output: a negative number,  Actual output: "
                        + osm.compareLexigraphically("Revature", "revature"));
        System.out.println("Comparing the string 'Revature' to 'Revature', Expected Output: 0,  Actual output: "
                + osm.compareLexigraphically(str, str));

        // Splitting string
        System.out.println("\nString splitting...");
        System.out.println(
                "Splitting all the words in the sentence 'Software Development Lifecycle'\n\nExpected Output: ");
        System.out.println("Software\nDevelopment\nLifecycle\n\nActual Output: ");

        String words[] = osm.splitStringIntoMultipleStrings("Software Development Lifecycle", " ");
        if (words == null) {
            System.out.println("null");
        } else {
            for (String word : words) {
                System.out.println(word);
            }
        }

    }

}
