package practice.java.f;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {
    Parrot parrot = new Parrot();

    /**
     * Tests the copy() method of the Parrot class.
     * 
     * This test verifies that, if copy() receives the text "hello" as input,
     * it returns the expected string "hello".
     */
    @Test
    public void parrotTestHello() {
        String input = "hello";
        String expected = "hello";
        String actual = parrot.copy(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * Tests the copy() method of the Parrot class.
     * 
     * This test verifies that, if copy() receives the text "polly" as input,
     * it returns the expected string "polly".
     */
    @Test
    public void parrotTestPolly() {
        String input = "polly";
        String expected = "polly";
        String actual = parrot.copy(input);
        Assert.assertEquals(expected, actual);
    }
}
