package practice.java.i;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubtractTest {
    Subtract s;
    
    @Before
    public void setUp() {
        s = new Subtract();
    }

    /**
     * 1.1 minus 0.1 is 1.0.
     */
    @Test
    public void subTest1() {
        double inputA = 1.1;
        double inputB = 0.1;
        double expected = 1.0;
        double actual = s.sub(inputA, inputB);
        Assert.assertEquals(expected, actual, .01);
    }
    
    /**
     * 0.7 minus 0.5 is 0.2.
     */
    @Test
    public void subTest2() {
        double inputA = 0.7;
        double inputB = 0.5;
        double expected = 0.2;
        double actual = s.sub(inputA, inputB);
        Assert.assertEquals(expected, actual, .01);
    }
    
    /**
     * 100.2 minus 50.1 is 50.1.
     */
    @Test
    public void subTest3() {
        double inputA = 100.2;
        double inputB = 50.1;
        double expected = 50.1;
        double actual = s.sub(inputA, inputB);
        Assert.assertEquals(expected, actual, .01);
    }
}
