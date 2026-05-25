package practice.java.g;

/**
 * Return Longest String Challenge
 */
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no
     *         ties for the longest string.
     */
    public String longest(String[] arr) {
        int lsIndex = 0;
        int lsLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (lsLength < arr[i].length()) {
                lsIndex = i;
                lsLength = arr[i].length();
            }
        }
        return arr[lsIndex];
    }
}
