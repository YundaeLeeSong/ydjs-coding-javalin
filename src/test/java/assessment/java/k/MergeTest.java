package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MergeTest {
    /**
     * < Q18 >
     * Tests the merge method.
     */
    @Test
    public void testMerge() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Merge.merge(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Merge.merge(new int[]{2, 4}, new int[]{1, 3, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, Merge.merge(new int[]{1, 3, 5}, new int[]{2, 4}));
        assertArrayEquals(new int[]{1, 2, 3}, Merge.merge(new int[]{}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, Merge.merge(new int[]{1, 2, 3}, new int[]{}));
        assertArrayEquals(new int[]{}, Merge.merge(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{1, 2}, Merge.merge(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2}, Merge.merge(new int[]{2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, Merge.merge(new int[]{1}, new int[]{}));
        assertArrayEquals(new int[]{1}, Merge.merge(new int[]{}, new int[]{1}));
        assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2}, Merge.merge(new int[]{1, 1, 2}, new int[]{1, 2, 2}));
        assertArrayEquals(new int[]{1, 1, 2, 2}, Merge.merge(new int[]{2, 2}, new int[]{1, 1}));
        assertArrayEquals(new int[]{-3, -2, -1, 0}, Merge.merge(new int[]{-3, -1}, new int[]{-2, 0}));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, Merge.merge(new int[]{-1, 1}, new int[]{-2, 0, 2}));
    }
}
