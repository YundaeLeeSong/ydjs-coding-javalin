
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class LabTest {
    Lab lab;
    @Before
    public void setUp(){
        lab = new Lab();
    }

    /**
     * Test case leverages a try/catch: the correct behavior of throwCustomException should cause the try block to
     * immediately stop due to the exception, and switch to executing the catch block.
     *
     * If either we run throwCustomException without causing an exception, or if an exception is thrown that is not
     * an instance of CustomException, the test will fail.
     */
    @Test
    public void throwUncheckedExceptionTest(){
        try{
            lab.throwUncheckedException();
            Assert.fail("throwUncheckedException must throw a RuntimeException.");
        }catch(Exception e){
            Assert.assertTrue("The exception thrown must be a NumberFormatException.",
                    e.getClass().equals(RuntimeException.class));
        }
    }
    @Test
    public void causeNumberFormatExceptionTest(){
        try{
            lab.causeNumberFormatException();
            Assert.fail("causeNumberFormatException() must cause a NumberFormatException. Try" +
                    " using the code provided.");
        }catch(Exception e){
            Assert.assertEquals("The exception thrown must be a NumberFormatException.",
                    NumberFormatException.class, e.getClass());
        }
    }
    @Test
    public void causeUncheckedExceptionTest(){
        try{
            lab.causeUncheckedException();
            Assert.fail("throwUncheckedException() must throw some unchecked exception. Try one" +
                    " of the examples provided.");
        }catch(Exception e){
            Assert.assertTrue("The exception thrown must not be a plain RuntimeException.",
                    !e.getClass().equals(RuntimeException.class));
            Assert.assertTrue("The exception thrown must not be a NumberFormatException.",
                    !e.getClass().equals(NumberFormatException.class));
        }
    }
}
