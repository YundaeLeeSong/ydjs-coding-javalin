package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Array11Test {
    /**
     * < Q14 >
     * Tests the array11 method.
     */
    @Test
    public void testArray11() {
        assertEquals(1, Array11.array11(new int[]{1, 2, 11}, 0));
        assertEquals(2, Array11.array11(new int[]{11, 11}, 0));
        assertEquals(0, Array11.array11(new int[]{1, 2, 3, 4}, 0));
        assertEquals(3, Array11.array11(new int[]{1, 11, 3, 11, 11}, 0));
        assertEquals(1, Array11.array11(new int[]{11}, 0));
        assertEquals(0, Array11.array11(new int[]{1}, 0));
        assertEquals(0, Array11.array11(new int[]{}, 0));
        assertEquals(2, Array11.array11(new int[]{11, 2, 3, 4, 11, 5}, 0));
        assertEquals(2, Array11.array11(new int[]{11, 5, 11}, 0));
    }
}


