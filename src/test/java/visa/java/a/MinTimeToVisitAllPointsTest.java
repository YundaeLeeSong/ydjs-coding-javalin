package visa.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinTimeToVisitAllPointsTest {

    @Test
    public void testExample1() {
        MinTimeToVisitAllPoints solver = new MinTimeToVisitAllPoints();
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        assertEquals(7, solver.minTimeToVisitAllPoints(points));
    }

    @Test
    public void testExample2() {
        MinTimeToVisitAllPoints solver = new MinTimeToVisitAllPoints();
        int[][] points = {{3, 2}, {-2, 2}};
        assertEquals(5, solver.minTimeToVisitAllPoints(points));
    }

    @Test
    public void testNullOrEmptyInput() {
        MinTimeToVisitAllPoints solver = new MinTimeToVisitAllPoints();
        assertEquals(0, solver.minTimeToVisitAllPoints(null));
        assertEquals(0, solver.minTimeToVisitAllPoints(new int[0][0]));
    }
}
