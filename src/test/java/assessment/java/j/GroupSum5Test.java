package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class GroupSum5Test {
    /**
     * < Q12 >
     * Tests the groupSum5 method.
     */
    @Test
    public void testGroupSum5() {
        assertTrue(GroupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 19));
        assertTrue(GroupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 17));
        assertFalse(GroupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 12));
        assertFalse(GroupSum5.groupSum5(0, new int[]{2, 5, 4, 10}, 12));
        assertFalse(GroupSum5.groupSum5(0, new int[]{3, 5, 1}, 4));
        assertTrue(GroupSum5.groupSum5(0, new int[]{3, 5, 1}, 5));
        assertTrue(GroupSum5.groupSum5(0, new int[]{1, 3, 5}, 5));
        assertFalse(GroupSum5.groupSum5(0, new int[]{3, 5, 1}, 9));
        assertFalse(GroupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 7));
        assertTrue(GroupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 15));
        assertFalse(GroupSum5.groupSum5(0, new int[]{2, 5, 10, 4}, 11));
        assertTrue(GroupSum5.groupSum5(0, new int[]{1}, 1));
        assertFalse(GroupSum5.groupSum5(0, new int[]{9}, 1));
        assertTrue(GroupSum5.groupSum5(0, new int[]{9}, 0));
        assertTrue(GroupSum5.groupSum5(0, new int[]{}, 0));
    }
}


