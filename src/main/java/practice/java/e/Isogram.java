package practice.java.e;

import java.util.HashSet;
import java.util.Set;

/**
 * Isogram Challenge
 * 
 * An Isogram is a word where no letters are repeated. You may assume that there
 * will only be lowercase letters in the String.
 *
 * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg",
 * "java", "programming" are not. You could use a Set of characters or a Map of
 * characters to int or boolean to solve this problem.
 */
public class Isogram {
    /**
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str) {
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (letters.contains(ch)) return false;
            else letters.add(ch);
        }
        return true;
    }
}
