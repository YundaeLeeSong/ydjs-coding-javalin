package practice.java.f;

/**
 * Other String Methods Lab
 * 
 * In this exercise, you will practice looking at Java documentation to further
 * your understanding how to use Strings. Here's the link to Java's String
 * class documentation:
 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html 
 * 
 * While completing this lab, you can use it as a reference. Once you open the
 * website, scroll down to the "Method Summary" section to find the relevant
 * methods you'll need to use.
 */
public class OtherStringMethods {
    /**
     * This method returns a substring of a given string.
     * 
     * Using the String parameter's substring() method, return the correct
     * value.
     * 
     * @param s - the string to be manipulated.
     * @param start - the index of the start of the substring, inclusive.
     * @param end - the index of the end of the substring, exclusive.
     * @return - a substring of the parameter `s`.
     */
    public String partOfString(String s, int start, int end) {
        return s.substring(start, end);
    }

    /**
     * This method returns an integer that represents whether a string is
     * greater than, less than, or equal to another string. 
     * 
     * Using the String parameter's compareTo() method, return the correct
     * value.
     * 
     * @param s1 - the first String to be compared.
     * @param s2 - the second String to be compared.
     * @return - a number greater than 0 if s1 > s2 lexigraphically, 
     *           a number less than 0 is s1 < s2 lexigraphically, 
     *           or 0 if s1 is equivalent to s2.
     */
    public int compareLexigraphically(String s1, String s2) {
        return s1.compareTo(s2);
    }

    /**
     * This method splits a string into an array of strings based off of a given
     * expression.
     * 
     * Using the String parameter's split() method, return the correct value.
     * - The split() method is most commonly used to split a text sentence into
     *   an array of words.
     * 
     * @param s1 - the string to be manipulated.
     * @param splitAround - the string that will be the text that s1 is split
     *        around.
     * @return - an array of Strings that represent s1 split by splitAround.
     */
    public String[] splitStringIntoMultipleStrings(String s1, String splitAround) {
        return s1.split(splitAround);
    }
}
