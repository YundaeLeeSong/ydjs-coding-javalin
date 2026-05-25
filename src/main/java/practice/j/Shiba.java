package practice.j;

/**
 * Overriding Challenge - Shiba
 * 
 * Notice that the class Shiba extends Dog. This means that it inherits all the
 * behavior of Dog, which at the current moment is a single method called
 * sound() that returns "Woof".
 *
 * Your task here is to override the sound() method that Shiba inherits from
 * dog. It does not matter what you overwrite it to, so long as sound() returns
 * anything other than Woof, to make Shibas unique.
 *
 * The only requirement to pass the tests is to override the sound() method in
 * this class.
 */
public class Shiba extends Dog {

    @Override
    public String sound() {
      return "Woofeeeeee keke";
    }
}
