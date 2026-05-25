package practice.java.g;

/**
 * Return Array Contents Challenge
 */
public class ReturnArrayContents {
    /**
     * Return a string with an array's contents, formatted with spaces.
     * For example, given the array {3,4,5,6} the string should look like this:
     * 3 4 5 6
     *
     * Spaces at the end of the string will not affect test results.
     *
     * @param nums the array to be manipulated.
     * @return a string representation of all values of nums, with the values
     *         separated by spaces.
     */
    public String arrayToString(int[] nums) {
        String ans = "";
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i];
            if (i < nums.length - 1) ans += " ";
        }
        return ans;
    }
}
