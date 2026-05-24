package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MergeTwoTest {
    /**
     * < Q10 >
     * Tests the mergeTwo method.
     */
    @Test
    public void testMergeTwo() {
        assertArrayEquals(new String[]{"a", "b", "c"}, MergeTwo.mergeTwo(
            new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3));
        assertArrayEquals(new String[]{"a", "c", "f"}, MergeTwo.mergeTwo(
            new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3));
        assertArrayEquals(new String[]{"c", "f", "g"}, MergeTwo.mergeTwo(
            new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3));
        assertArrayEquals(new String[]{"a", "c", "z"}, MergeTwo.mergeTwo(
            new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 3));
        assertArrayEquals(new String[]{"a", "b", "c"}, MergeTwo.mergeTwo(
            new String[]{"a", "b", "c", "z"}, new String[]{"a", "c", "z"}, 3));
        assertArrayEquals(new String[]{"a", "b", "c"}, MergeTwo.mergeTwo(
            new String[]{"a", "c", "z"}, new String[]{"a", "b", "c", "z"}, 3));
        assertArrayEquals(new String[]{"a", "c"}, MergeTwo.mergeTwo(
            new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 2));
        assertArrayEquals(new String[]{"a", "c", "y"}, MergeTwo.mergeTwo(
            new String[]{"a", "c", "z"}, new String[]{"a", "c", "y", "z"}, 3));
        assertArrayEquals(new String[]{"a", "b", "x"}, MergeTwo.mergeTwo(
            new String[]{"x", "y", "z"}, new String[]{"a", "b", "z"}, 3));
    }
}
