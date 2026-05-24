package visa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayDistancesTest {

    @Test
    public void testExample1() {
        ArrayDistances solver = new ArrayDistances();
        int[] nums = {1, 3, 1, 1, 2};
        long[] expected = {5, 0, 3, 4, 0};
        assertArrayEquals(expected, solver.distance(nums));
    }

    @Test
    public void testExample2() {
        ArrayDistances solver = new ArrayDistances();
        int[] nums = {0, 5, 3};
        long[] expected = {0, 0, 0};
        assertArrayEquals(expected, solver.distance(nums));
    }

    @Test
    public void testNullOrEmptyInput() {
        ArrayDistances solver = new ArrayDistances();
        assertArrayEquals(new long[0], solver.distance(null));
        assertArrayEquals(new long[0], solver.distance(new int[0]));
    }
}
