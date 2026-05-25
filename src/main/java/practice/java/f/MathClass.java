package practice.java.f;

/**
 * Math Class Challenge
 * 
 * The Math class contains utility methods that can be used for calculations
 * like exponents, rounding, random number generation, etc. The point of this
 * challenge, however, is not strictly to use the Math class - there are many
 * "Utility Classes" which follow a curious pattern - where we usually
 * instantiate an object before using it, classes such as Math, Arrays, System
 * are used without instantiating the object - we would skip directly to using a
 * method such as Math.pow() immediately.
 */
public class MathClass {
    /**
     * @param a the base
     * @param b the exponent
     * @return return a^b using the pow() method of the Math class.
     */
    public double mathPow(double a, double b) {
        return Math.pow(a,b);
    }
}
