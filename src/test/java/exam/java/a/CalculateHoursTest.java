package exam.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateHoursTest {
    @Test
    public void test1() {
        assertEquals("12 hours 30 minutes", 
            CalculateHours.calculateHours(
                new Integer[]{180, 90, 120, 120, 90, 150}));
    }

    @Test
    public void test2() {
        assertEquals("1 hour 25 minutes", 
            CalculateHours.calculateHours(new Integer[]{15, 20, 35, 10, 5}));
    }

    @Test
    public void test3() {
        assertEquals("9 hours", 
            CalculateHours.calculateHours(
                new Integer[]{60, 60, 60, 60, 60, 60, 60, 60, 60}));
    }

    @Test
    public void test4() {
        assertEquals("30 minutes", 
            CalculateHours.calculateHours(new Integer[]{30}));
    }

    @Test
    public void test5() {
        assertEquals("1 hour 1 minute", 
            CalculateHours.calculateHours(new Integer[]{60, 1}));
    }
}


