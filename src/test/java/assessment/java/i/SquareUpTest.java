package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class SquareUpTest {
    /**
     * < Q3 >
     * Tests the squareUp method.
     */
    @Test
    public void testSquareUp() {
        assertArrayEquals(new int[]{0, 0, 1, 0, 2, 1, 3, 2, 1}, 
            SquareUp.squareUp(3));
        assertArrayEquals(new int[]{0, 1, 2, 1}, SquareUp.squareUp(2));
        assertArrayEquals(
            new int[]{0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}, 
            SquareUp.squareUp(4));
        assertArrayEquals(new int[]{1}, SquareUp.squareUp(1));
        assertArrayEquals(new int[]{}, SquareUp.squareUp(0));
        assertArrayEquals(new int[]{
            0, 0, 0, 0, 0, 1,
            0, 0, 0, 0, 2, 1,
            0, 0, 0, 3, 2, 1,
            0, 0, 4, 3, 2, 1,
            0, 5, 4, 3, 2, 1,
            6, 5, 4, 3, 2, 1
        }, SquareUp.squareUp(6));
    }
}


