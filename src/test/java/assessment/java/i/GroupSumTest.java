package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class GroupSumTest {
    /**
     * < Q13 >
     * Tests the groupSum method.
     */
    @Test
    public void testGroupSum() {
        assertTrue(GroupSum.groupSum(0, new int[]{2, 4, 8}, 10));
        assertTrue(GroupSum.groupSum(0, new int[]{2, 4, 8}, 14));
        assertFalse(GroupSum.groupSum(0, new int[]{2, 4, 8}, 9));
        assertTrue(GroupSum.groupSum(0, new int[]{2, 4, 8}, 8));
        assertTrue(GroupSum.groupSum(1, new int[]{2, 4, 8}, 8));
        assertFalse(GroupSum.groupSum(1, new int[]{2, 4, 8}, 2));
        assertTrue(GroupSum.groupSum(0, new int[]{1}, 1));
        assertFalse(GroupSum.groupSum(0, new int[]{9}, 1));
        assertTrue(GroupSum.groupSum(1, new int[]{9}, 0));
        assertTrue(GroupSum.groupSum(0, new int[]{}, 0));
        assertTrue(GroupSum.groupSum(0, new int[]{10, 2, 2, 5}, 17));
        assertTrue(GroupSum.groupSum(0, new int[]{10, 2, 2, 5}, 15));
        assertTrue(GroupSum.groupSum(0, new int[]{10, 2, 2, 5}, 9));
    }
}
