package visa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CircularArrayDefuseTest {

    @Test
    public void testExample1() {
        CircularArrayDefuse solver = new CircularArrayDefuse();
        int[] code = {5, 7, 1, 4};
        int k = 3;
        int[] expected = {12, 10, 16, 13};
        assertArrayEquals(expected, solver.decrypt(code, k));
    }

    @Test
    public void testExample2() {
        CircularArrayDefuse solver = new CircularArrayDefuse();
        int[] code = {1, 2, 3, 4};
        int k = 0;
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, solver.decrypt(code, k));
    }

    @Test
    public void testExample3() {
        CircularArrayDefuse solver = new CircularArrayDefuse();
        int[] code = {2, 4, 9, 3};
        int k = -2;
        int[] expected = {12, 5, 6, 13};
        assertArrayEquals(expected, solver.decrypt(code, k));
    }

    @Test
    public void testNullOrEmptyInput() {
        CircularArrayDefuse solver = new CircularArrayDefuse();
        assertArrayEquals(new int[0], solver.decrypt(null, 3));
        assertArrayEquals(new int[0], solver.decrypt(new int[0], 3));
    }
}
