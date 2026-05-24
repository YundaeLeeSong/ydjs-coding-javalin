package visa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FurthestDistanceFromOriginTest {

    @Test
    public void testExample1() {
        FurthestDistanceFromOrigin solver = new FurthestDistanceFromOrigin();
        assertEquals(3, solver.furthestDistanceFromOrigin("L_RL__R"));
    }

    @Test
    public void testExample2() {
        FurthestDistanceFromOrigin solver = new FurthestDistanceFromOrigin();
        assertEquals(5, solver.furthestDistanceFromOrigin("_R__LL_"));
    }

    @Test
    public void testExample3() {
        FurthestDistanceFromOrigin solver = new FurthestDistanceFromOrigin();
        assertEquals(7, solver.furthestDistanceFromOrigin("_______"));
    }

    @Test
    public void testNullOrEmptyInput() {
        FurthestDistanceFromOrigin solver = new FurthestDistanceFromOrigin();
        assertEquals(0, solver.furthestDistanceFromOrigin(null));
        assertEquals(0, solver.furthestDistanceFromOrigin(""));
    }
}
