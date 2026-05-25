package assessment.java.k;

public class ClimbStairs {
    /**
     * <h3>Q15</h3>
     * <p>
     * Description:
     *     Find the number of distinct ways to climb a staircase with n steps,
     *     where you can take either 1 step or 2 steps at a time.
     *     
     *     This problem is similar to the Fibonacci sequence because:
     *     - To reach step n, you can come from step (n-1) or step (n-2)
     *     - Number of ways to reach n = ways to reach (n-1) + ways to reach
     *     (n-2)
     *     - Base cases: 1 way to reach step 1, 2 ways to reach step 2
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>climbStairs(1) -> 1   # [1]</li>
     *   <li>climbStairs(2) -> 2   # [1,1] or [2]</li>
     *   <li>climbStairs(3) -> 3   # [1,1,1], [1,2], or [2,1]</li>
     *   <li>climbStairs(4) -> 5   # [1,1,1,1], [1,1,2], [1,2,1], [2,1,1],
     *   [2,2]</li>
     *   <li>climbStairs(5) -> 8   # Similar pattern</li>
     * </ul>
     * </p>
     *
     * @param n The number of steps in the staircase (n >= 1)
     * @return The number of distinct ways to climb the staircase
     */
    public static int climbStairs(int n) {
        // TODO: Implement your solution here
        return 0;
    }
}


