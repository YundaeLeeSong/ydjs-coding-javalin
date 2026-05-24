
import org.junit.Assert;
import org.junit.Test;

public class GreetingTest {
    
    Greeting greetingObject = new Greeting();

    /**
     * Tests the sayHello() method of the Greeting class.
     * 
     * This test verifies that the method returns the expected string "Hello,
     * world!". The trim() method is used to remove any whitespace at the beginning and end of the string, if there is any.
     */
    @Test
    public void helloTest() {
        String expected = "Hello, world!";
        String actual = greetingObject.sayHello().trim();
        Assert.assertEquals(expected, actual);
    }
}
