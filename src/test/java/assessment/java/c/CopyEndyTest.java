package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CopyEndyTest {
    /**
     * < Q1 >
     * Tests the copyEndy method.
     */
    @Test
    public void testCopyEndy() {
        assertArrayEquals(new int[]{9, 90}, 
            CopyEndy.copyEndy(new int[]{9, 11, 90, 22, 6}, 2));
        assertArrayEquals(new int[]{9, 90, 6}, 
            CopyEndy.copyEndy(new int[]{9, 11, 90, 22, 6}, 3));
        assertArrayEquals(new int[]{1, 1}, 
            CopyEndy.copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 2));
        assertArrayEquals(new int[]{1, 1, 0}, 
            CopyEndy.copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 3));
        assertArrayEquals(new int[]{0}, CopyEndy.copyEndy(new int[]{0}, 1));
        assertArrayEquals(new int[]{10, 90}, 
            CopyEndy.copyEndy(new int[]{10, 11, 90}, 2));
        assertArrayEquals(new int[]{90, 100}, 
            CopyEndy.copyEndy(new int[]{90, 22, 100}, 2));
        assertArrayEquals(new int[]{10}, 
            CopyEndy.copyEndy(new int[]{12, 11, 10, 89, 101, 4}, 1));
        assertArrayEquals(new int[]{2, 2}, 
            CopyEndy.copyEndy(new int[]{13, 2, 2, 0}, 2));
        assertArrayEquals(new int[]{2, 2, 0}, 
            CopyEndy.copyEndy(new int[]{13, 2, 2, 0}, 3));
        assertArrayEquals(new int[]{2, 2}, 
            CopyEndy.copyEndy(new int[]{13, 2, 13, 2, 0, 30}, 2));
        assertArrayEquals(new int[]{2, 2, 0}, 
            CopyEndy.copyEndy(new int[]{13, 2, 13, 2, 0, 30}, 3));
    }
}
