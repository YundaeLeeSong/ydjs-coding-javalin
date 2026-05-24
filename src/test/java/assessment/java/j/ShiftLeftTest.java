package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ShiftLeftTest {
    /**
     * < Q1 >
     * Tests the shiftLeft method.
     */
    @Test
    public void testShiftLeft() {
        assertArrayEquals(new int[]{2, 5, 3, 6}, 
            ShiftLeft.shiftLeft(new int[]{6, 2, 5, 3}));
        assertArrayEquals(new int[]{2, 1}, 
            ShiftLeft.shiftLeft(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, 
            ShiftLeft.shiftLeft(new int[]{1}));
        assertArrayEquals(new int[]{}, 
            ShiftLeft.shiftLeft(new int[]{}));
        assertArrayEquals(new int[]{1, 2, 2, 4, 1}, 
            ShiftLeft.shiftLeft(new int[]{1, 1, 2, 2, 4}));
        assertArrayEquals(new int[]{1, 1, 1}, 
            ShiftLeft.shiftLeft(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{2, 3, 1}, 
            ShiftLeft.shiftLeft(new int[]{1, 2, 3}));
    }
}
