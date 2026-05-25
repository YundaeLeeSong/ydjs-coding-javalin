package practice.java.i;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UncheckedExceptionTest {
    UncheckedException lab;
    
    @Before
    public void setUp() {
        lab = new UncheckedException();
    }

    @Test
    public void throwUncheckedExceptionTest() {
        try {
            lab.throwUncheckedException();
            Assert.fail("throwUncheckedException must throw a RuntimeException.");
        } catch(Exception e) {
            Assert.assertTrue("The exception thrown must be a RuntimeException.",
                    e.getClass().equals(RuntimeException.class));
        }
    }
    
    @Test
    public void causeNumberFormatExceptionTest() {
        try {
            lab.causeNumberFormatException();
            Assert.fail("causeNumberFormatException() must cause a NumberFormatException.");
        } catch(Exception e) {
            Assert.assertEquals("The exception thrown must be a NumberFormatException.",
                    NumberFormatException.class, e.getClass());
        }
    }
    
    @Test
    public void causeUncheckedExceptionTest() {
        try {
            lab.causeUncheckedException();
            Assert.fail("causeUncheckedException() must throw some unchecked exception.");
        } catch(Exception e) {
            Assert.assertTrue("The exception thrown must not be a plain RuntimeException.",
                    !e.getClass().equals(RuntimeException.class));
            Assert.assertTrue("The exception thrown must not be a NumberFormatException.",
                    !e.getClass().equals(NumberFormatException.class));
        }
    }
}
