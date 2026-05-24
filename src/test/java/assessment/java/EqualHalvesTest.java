package assessment.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EqualHalvesTest {

    @Test
    public void test1() {
        assertTrue(EqualHalves.equalHalves(new Integer[]{1, 1}));
    }

    @Test
    public void test2() {
        assertTrue(EqualHalves.equalHalves(new Integer[]{5, 5, 5, 0, 15, 0}));
    }

    @Test
    public void test3() {
        assertFalse(EqualHalves.equalHalves(new Integer[]{2, 3, 2}));
    }

    @Test
    public void test4() {
        assertFalse(EqualHalves.equalHalves(new Integer[]{17, 0, 1, 9}));
    }

    @Test
    public void test5() {
        assertTrue(EqualHalves.equalHalves(new Integer[]{8, 2, 5, 1, 9, 5}));
    }
}
