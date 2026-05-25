package assessment.java.c;

public class UserCompare {
    /**
     * <h3>Q9</h3>
     * <p>
     * Description:
     *     We have data for two users, A and B, each with a string 
     *     `name` and an integer `id`.
     *     The goal is to order the users for sorting. Return:
     *       - -1 if A comes before B
     *       -  1 if A comes after B
     *       -  0 if they are the same.
     *     Order first by name (lexicographically), and if the names 
     *     are equal, order by id.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>userCompare("bb", 1, "zz", 2) -> -1</li>
     *   <li>userCompare("bb", 1, "aa", 2) -> 1</li>
     *   <li>userCompare("bb", 1, "bb", 1) -> 0</li>
     *   <li>userCompare("bb", 5, "bb", 1) -> 1</li>
     *   <li>userCompare("bb", 5, "bb", 10) -> -1</li>
     *   <li>userCompare("adam", 1, "bob", 2) -> -1</li>
     *   <li>userCompare("bob", 1, "bob", 2) -> -1</li>
     *   <li>userCompare("bzb", 1, "bob", 2) -> 1</li>
     * </ul>
     * </p>
     *
     * @param aName Name of user A
     * @param aId ID of user A
     * @param bName Name of user B
     * @param bId ID of user B
     * @return -1 if A < B, 1 if A > B, 0 if they are equal
     */
    public static int userCompare(String aName, int aId, String bName, int bId) {
        // TODO: Implement your solution here
        return 0;
    }
}


