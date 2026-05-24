package assessment.java.h;

public class CloseFar {
    /**
     * <h3>Q10</h3>
     * <p>
     * Description:
     *     Given three integers a, b, c, return True if one of b or c is "close"
     *     to a
     *     (differing from a by at most 1), while the other is "far" from both
     *     of the others
     *     (differing by 2 or more from each).
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>closeFar(1, 2, 10) -> true   # b is close to a, c is far from
     *   both</li>
     *   <li>closeFar(8, 9, 10) -> false  # both b and c are close</li>
     *   <li>closeFar(8, 9, 7) -> false   # b is close but c is not far from
     *   b</li>
     *   <li>closeFar(8, 6, 9) -> true    # c is far, b is far from c but close
     *   to a? actually b=6 is 2 away from a=8 -> far, c=9 is 1 away ->
     *   close</li>
     * </ul>
     * </p>
     *
     * @param a The reference integer
     * @param b The first integer to compare
     * @param c The second integer to compare
     * @return true if exactly one of b or c is within 1 of a and the other
     * differs by at least 2 from both, false otherwise
     */
    public static boolean closeFar(int a, int b, int c) {
        // TODO: Implement your solution here
        return false;
    }
}
