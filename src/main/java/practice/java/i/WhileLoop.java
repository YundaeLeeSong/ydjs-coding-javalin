package practice.java.i;

/**
 * While Loop Challenge
 * 
 * A while loop uses a conditional statement (within parentheses) and runs the
 * code {within curly braces} as long as the conditional is true.
 *
 * Usually while loops are used for I/O, like waiting for input from the user or
 * waiting for data from the web, which are situations where the code has no
 * capability of knowing how many times it should do something (like how many
 * times the program should check if it's received user input yet).
 */
public class WhileLoop {
    /**
     * @param end a number representing the number to which the sum of all
     *            numbers starting from 0 should be calculated (exclusive - for
     *            example, when end is 5, we calculate 0+1+2+3+4)
     * @return the sum of all numbers between 0 and end.
     */
    public int whileExample(int end) {
        int sum = 0;
        int i = 0;

        while(i < end) sum += i++;

        return sum;
    }
}
