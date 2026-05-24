package visa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumUniqueSubarraySumTest {

    @Test
    public void testExample1() {
        MaximumUniqueSubarraySum solver = new MaximumUniqueSubarraySum();
        int[] nums = {4, 2, 4, 5, 6};
        assertEquals(17, solver.maximumUniqueSubarray(nums));
    }

    @Test
    public void testExample2() {
        MaximumUniqueSubarraySum solver = new MaximumUniqueSubarraySum();
        int[] nums = {5, 2, 1, 2, 5, 2, 1, 2, 5};
        assertEquals(8, solver.maximumUniqueSubarray(nums));
    }

    @Test
    public void testNullOrEmptyInput() {
        MaximumUniqueSubarraySum solver = new MaximumUniqueSubarraySum();
        assertEquals(0, solver.maximumUniqueSubarray(null));
        assertEquals(0, solver.maximumUniqueSubarray(new int[0]));
    }
}
