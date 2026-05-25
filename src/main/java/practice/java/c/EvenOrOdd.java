package practice.java.c;

/**
 * Even Or Odd Challenge
 * 
 * Your challenge is to implement a method to determine if an int is even or
 * odd. The method should return the String "Even" if the number is even, and
 * "Odd" if it is odd.
 *
 * There is a special operator in programming languages called modulus, which
 * provides the remainder after a division, represented by %.
 * For instance, 7%4=3, 7%3=1, 4%2=0, 5%2=1, etc.
 *
 * That operator, could be used to tell if a number is even or odd - a number
 * that has a remainder of 0 when divided by 2 is naturally even.
 */
public class EvenOrOdd {
    /**
     * @param n a number.
     * @return a String "Even" if n is even, and "Odd" if n is odd. The test
     *         cases are case-sensitive.
     */
    public String decide(int n) {
        return (n % 2 == 0) ? ("Even") : ("Odd");
    }
}
