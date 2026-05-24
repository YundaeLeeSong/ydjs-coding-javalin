package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MergeSortTest {
    /**
     * < Q17 >
     * Tests the mergeSort method.
     */
    @Test
    public void testMergeSort() {
        assertArrayEquals(new int[]{3, 9, 10, 27, 38, 43, 82}, 
            MergeSort.mergeSort(new int[]{38, 27, 43, 3, 9, 82, 10}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 6, 8, 10}, 
            MergeSort.mergeSort(new int[]{3, 6, 8, 10, 1, 2, 1}));
        assertArrayEquals(new int[]{1, 2, 5, 8, 9}, 
            MergeSort.mergeSort(new int[]{5, 2, 8, 1, 9}));
        assertArrayEquals(new int[]{}, MergeSort.mergeSort(new int[]{}));
        assertArrayEquals(new int[]{1}, MergeSort.mergeSort(new int[]{1}));
        assertArrayEquals(new int[]{5, 5, 5, 5}, 
            MergeSort.mergeSort(new int[]{5, 5, 5, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, 
            MergeSort.mergeSort(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3}, 
            MergeSort.mergeSort(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, 
            MergeSort.mergeSort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{7, 8, 9, 10}, 
            MergeSort.mergeSort(new int[]{10, 9, 8, 7}));
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1}, 
            MergeSort.mergeSort(new int[]{-3, -1, -2, 0, 1}));
        assertArrayEquals(new int[]{-3, -1, 0, 2, 5}, 
            MergeSort.mergeSort(new int[]{5, -3, 2, -1, 0}));
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = 100 - i;
        }
        int[] expected = new int[100];
        for (int i = 0; i < 100; i++) {
            expected[i] = i + 1;
        }
        assertArrayEquals(expected, MergeSort.mergeSort(arr));
    }
}
