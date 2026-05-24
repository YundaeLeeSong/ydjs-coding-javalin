package assessment.java.l;

/**
 * Your task is to create a program that prints a left-aligned staircase to the
 * console, where the staircase has n steps.
 * 
 * The input will be a single positive integer n (1 <= n <= 100), representing
 * the number of steps in the staircase. Each step is represented by the
 * character #.
 * 
 * For example, if the input is 4, the output should be:
 * #
 * ##
 * ###
 * ####
 * 
 * Input    Output
 * 2        #
 *          ##
 * 3        #
 *          ##
 *          ###
 */
public class PrintStaircase {
    public static void printStaircase(int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
