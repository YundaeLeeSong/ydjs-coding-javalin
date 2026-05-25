package practice.java.e;

/**
 * Intro to OOP
 * 
 * Let's say we're working on a birdwatching app.
 * Using OOP, we could maintain many bird objects which individually contain
 * their own age, and can generate their own sound. This concept of an object
 * controlling its own data can be referred to as encapsulation.
 *
 * In the app, an individual bird should be able to "Tweet" if ageMonths is
 * less than 3 and "Chirp" if ageMonths is greater than or equal to 3.
 */
public class Bird {
    /**
     * A variable (in this context, often referred to as a field), which
     * represents the age of the bird.
     */
    public int ageMonths;

    public Bird() {
    }

    /**
     * @return "Tweet" if ageMonths is less than 3 and "Chirp" if ageMonths is
     *         greater than or equal to 3.
     */
    public String sound() {
        if (this.ageMonths < 3) return "Tweet";
        return "Chirp";
    }
}
