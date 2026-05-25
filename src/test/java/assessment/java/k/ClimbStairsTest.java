package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ClimbStairsTest {
    /**
     * < Q15 >
     * Tests the climbStairs method.
     */
    @Test
    public void testClimbStairs() {
        assertEquals(1, ClimbStairs.climbStairs(1));
        assertEquals(2, ClimbStairs.climbStairs(2));
        assertEquals(3, ClimbStairs.climbStairs(3));
        assertEquals(5, ClimbStairs.climbStairs(4));
        assertEquals(8, ClimbStairs.climbStairs(5));
        assertEquals(13, ClimbStairs.climbStairs(6));
        assertEquals(21, ClimbStairs.climbStairs(7));
        assertEquals(34, ClimbStairs.climbStairs(8));
        assertEquals(89, ClimbStairs.climbStairs(10));
        assertEquals(0, ClimbStairs.climbStairs(0));
        assertEquals(10946, ClimbStairs.climbStairs(20));
    }
}


