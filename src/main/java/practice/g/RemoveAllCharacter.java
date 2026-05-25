package practice.g;

/**
 * Remove All Character Challenge
 */
public class RemoveAllCharacter {
    /**
     * Return a String that has all the character of a String removed.
     * You could either use a for loop to build a new String that excludes a
     * character, or you could cleverly use the replaceAll method of String to
     * replace a character with a blank space.
     *
     * @param str A string.
     * @param ch A string containing a single character which should be removed
     *        from str.
     * @return str, without any characters of type ch.
     */
    public String removeAll(String str, String ch) {
        char actualCh = ch.charAt(0);
        StringBuilder strMod = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != actualCh) strMod.append(str.charAt(i));
        }
        return strMod.toString();
    }
}
