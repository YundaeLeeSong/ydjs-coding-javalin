package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class GroupSumClumpTest {
    /**
     * < Q13 >
     * Tests the groupSumClump method.
     */
    @Test
    public void testGroupSumClump() {
        assertTrue(GroupSumClump.groupSumClump(0, new int[]{2, 4, 8}, 10));
        assertTrue(GroupSumClump.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
        assertFalse(GroupSumClump.groupSumClump(0, new int[]{2, 4, 4, 8}, 14));
        assertTrue(GroupSumClump.groupSumClump(0, new int[]{8, 2, 2, 1}, 9));
        assertFalse(GroupSumClump.groupSumClump(0, new int[]{8, 2, 2, 1}, 11));
        assertTrue(GroupSumClump.groupSumClump(0, new int[]{1}, 1));
        assertFalse(GroupSumClump.groupSumClump(0, new int[]{9}, 1));
    }
}


