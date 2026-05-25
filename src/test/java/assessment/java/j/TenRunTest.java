package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class TenRunTest {
    /**
     * < Q2 >
     * Tests the tenRun method.
     */
    @Test
    public void testTenRun() {
        assertArrayEquals(new int[]{2, 10, 10, 10, 20, 20}, 
            TenRun.tenRun(new int[]{2, 10, 3, 4, 20, 5}));
        assertArrayEquals(new int[]{10, 10, 20, 20}, 
            TenRun.tenRun(new int[]{10, 1, 20, 2}));
        assertArrayEquals(new int[]{10, 10, 10, 20}, 
            TenRun.tenRun(new int[]{10, 1, 9, 20}));
        assertArrayEquals(new int[]{1, 2, 50, 50}, 
            TenRun.tenRun(new int[]{1, 2, 50, 1}));
        assertArrayEquals(new int[]{1, 20, 50, 50}, 
            TenRun.tenRun(new int[]{1, 20, 50, 1}));
        assertArrayEquals(new int[]{10, 10}, TenRun.tenRun(new int[]{10, 10}));
        assertArrayEquals(new int[]{10, 10}, TenRun.tenRun(new int[]{10, 2}));
        assertArrayEquals(new int[]{0, 0}, TenRun.tenRun(new int[]{0, 2}));
        assertArrayEquals(new int[]{1, 2}, TenRun.tenRun(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, TenRun.tenRun(new int[]{1}));
        assertArrayEquals(new int[]{}, TenRun.tenRun(new int[]{}));
    }
}


