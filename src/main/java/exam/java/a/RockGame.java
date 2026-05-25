package exam.java.a;

/**
 * Steve and Tommy are playing a game where they take rocks out of a bag. The
 * bag has a certain number of rocks, and each child can take a certain number
 * of rocks out of the bag. Steve will always go first and then the two children
 * take turns taking rocks out of the bag. It is your job to figure out which
 * child will empty the bag (reduce the number of rocks in the bag to 0), and
 * how many rocks that same child has taken total.
 * 
 * The rockGame() method takes in 3 arguments in this order:
 * - b - the total number of rocks in the bag, this will be between 0-1000
 * - s - the number of rocks Steve will take out every turn, between 0-1000
 * - t - the number of rocks Tommy will take out every turn, between 0-1000
 * 
 * After figuring out who empties the bag, you are required to return the total
 * number of rocks that the child who emptied the bag has in total.
 * 
 * -------------------------------------------------------------------------
 * 
 * Example Input:    Example Output:
 * 9
 * 2
 * 3                 5
 * 
 * Explanation:
 * - First turn Steve takes out 2 rocks and Tommy takes out 3 rocks, leaving
 *   4 left in the bag.
 * - Second turn Steve takes out 2 rocks and Tommy goes to take out 3 rocks,
 *   but since there are only 2 left he only takes 2, emptying the bag.
 * 
 * Since Tommy emptied the bag to 0 rocks, the resulting number of rocks he
 * has total is 5.
 */
public class RockGame {
    public static int rockGame(int b, int s, int t) {
        int steveTotal = 0;
        int tommyTotal = 0;
        while (b > 0) {
            if (b >= s) {
                b -= s;
                steveTotal += s;
                if (b == 0) return steveTotal;
            } else {
                steveTotal += b;
                return steveTotal;
            }
            if (b >= t) {
                b -= t;
                tommyTotal += t;
                if (b == 0) return tommyTotal;
            } else {
                tommyTotal += b;
                return tommyTotal;
            }
        }
        return 0;
    }
}


