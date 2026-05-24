package visa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimizeMaximumPairSumTest {

    @Test
    public void testExample1() {
        MinimizeMaximumPairSum solver = new MinimizeMaximumPairSum();
        int[] nums = {3, 5, 2, 3};
        assertEquals(7, solver.minPairSum(nums));
    }

    @Test
    public void testExample2() {
        MinimizeMaximumPairSum solver = new MinimizeMaximumPairSum();
        int[] nums = {3, 5, 4, 2, 4, 6};
        assertEquals(8, solver.minPairSum(nums));
    }

    @Test
    public void testNullOrEmptyInput() {
        MinimizeMaximumPairSum solver = new MinimizeMaximumPairSum();
        assertEquals(0, solver.minPairSum(null));
        assertEquals(0, solver.minPairSum(new int[0]));
    }
}
