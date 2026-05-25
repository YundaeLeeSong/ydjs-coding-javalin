package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class GroupNoAdjTest {
    /**
     * < Q11 >
     * Tests the groupNoAdj method.
     */
    @Test
    public void testGroupNoAdj() {
        assertTrue(GroupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 12));
        assertFalse(GroupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 14));
        assertFalse(GroupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 7));
        assertTrue(GroupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4, 2}, 7));
        assertTrue(GroupNoAdj.groupNoAdj(0, new int[]{2, 5, 10, 4}, 9));
        assertTrue(GroupNoAdj.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 15));
        assertFalse(GroupNoAdj.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 7));
        assertTrue(GroupNoAdj.groupNoAdj(0, new int[]{}, 0));
        assertTrue(GroupNoAdj.groupNoAdj(0, new int[]{1}, 1));
        assertFalse(GroupNoAdj.groupNoAdj(0, new int[]{9}, 1));
        assertTrue(GroupNoAdj.groupNoAdj(0, new int[]{9}, 0));
        assertTrue(GroupNoAdj.groupNoAdj(0, new int[]{5, 10, 4, 1}, 11));
    }
}


