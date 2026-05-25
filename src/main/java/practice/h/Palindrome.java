package practice.h;

/**
 * String Is Palindrome Challenge
 * 
 * Palindromes are words that are the same forwards as they are backwards - eg,
 * 'bob', 'racecar'.
 */
public class Palindrome {
    /**
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str) {
        int length = str.length();
        int halfLength = str.length() / 2;
        for (int i = 0; i < halfLength; i++) {
            int j = length - 1 - i;
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }
}
