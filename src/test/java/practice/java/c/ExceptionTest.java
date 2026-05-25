package practice.java.c;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExceptionTest {
    static Exceptions ec;
    
    @BeforeClass
    public static void setUp() {
        ec = new Exceptions();
    }

    /**
     * This test verifies that ec.mustThrow() throws an exception.
     */
    @Test
    public void exceptionMustThrowTest() {
        Assert.assertThrows(Exception.class, ()->ec.mustThrow());
    }
}
