package assessment.java.l;

/**
 * You are tasked to write a function that takes an integer as input and returns
 * true if the number is prime and false otherwise.
 * 
 * The isPrime() function takes in 1 argument:
 * - n - the integer to check if it is a prime number
 * 
 * Your function should determine whether the input integer is prime or not. A
 * prime number is a positive integer greater than 1 that has no positive
 * integer divisors other than 1 and itself. If the input integer is prime, the
 * function should return true. Otherwise, it should return false.
 * 
 * Example Input:    Example Output:
 * 7                 true
 * 10                false
 */
public class IsPrime {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
