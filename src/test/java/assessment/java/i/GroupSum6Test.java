package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class GroupSum6Test {
    /**
     * < Q14 >
     * Tests the groupSum6 method.
     */
    @Test
    public void testGroupSum6() {
        assertTrue(GroupSum6.groupSum6(0, new int[]{5, 6, 2}, 8));
        assertFalse(GroupSum6.groupSum6(0, new int[]{5, 6, 2}, 9));
        assertFalse(GroupSum6.groupSum6(0, new int[]{5, 6, 2}, 7));
        assertTrue(GroupSum6.groupSum6(0, new int[]{1}, 1));
        assertFalse(GroupSum6.groupSum6(0, new int[]{9}, 1));
        assertTrue(GroupSum6.groupSum6(0, new int[]{}, 0));
        assertTrue(GroupSum6.groupSum6(0, new int[]{3, 2, 4, 6}, 8));
        assertTrue(GroupSum6.groupSum6(0, new int[]{6, 2, 4, 3}, 8));
        assertFalse(GroupSum6.groupSum6(0, new int[]{5, 2, 4, 6}, 9));
        assertFalse(GroupSum6.groupSum6(0, new int[]{6, 2, 4, 5}, 9));
        assertFalse(GroupSum6.groupSum6(0, new int[]{3, 2, 4, 6}, 3));
        assertTrue(GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 12));
        assertTrue(GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 13));
        assertFalse(GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 4));
        assertFalse(GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 9));
        assertTrue(GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 14));
        assertTrue(GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 15));
        assertFalse(GroupSum6.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 16));
    }
}
