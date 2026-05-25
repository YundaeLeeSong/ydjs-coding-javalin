package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MakeChocolateTest {
    /**
     * < Q2 >
     * Tests the makeChocolate method.
     */
    @Test
    public void testMakeChocolate() {
        assertEquals(4, MakeChocolate.makeChocolate(4, 1, 9));
        assertEquals(-1, MakeChocolate.makeChocolate(4, 1, 10));
        assertEquals(2, MakeChocolate.makeChocolate(4, 1, 7));
        assertEquals(2, MakeChocolate.makeChocolate(6, 2, 7));
        assertEquals(0, MakeChocolate.makeChocolate(4, 1, 5));
        assertEquals(4, MakeChocolate.makeChocolate(4, 1, 4));
        assertEquals(4, MakeChocolate.makeChocolate(5, 4, 9));
        assertEquals(3, MakeChocolate.makeChocolate(9, 3, 18));
        assertEquals(-1, MakeChocolate.makeChocolate(3, 1, 9));
        assertEquals(-1, MakeChocolate.makeChocolate(1, 2, 7));
        assertEquals(1, MakeChocolate.makeChocolate(1, 2, 6));
        assertEquals(0, MakeChocolate.makeChocolate(1, 2, 5));
        assertEquals(5, MakeChocolate.makeChocolate(6, 1, 10));
        assertEquals(6, MakeChocolate.makeChocolate(6, 1, 11));
        assertEquals(-1, MakeChocolate.makeChocolate(6, 1, 12));
        assertEquals(-1, MakeChocolate.makeChocolate(6, 1, 13));
        assertEquals(0, MakeChocolate.makeChocolate(6, 2, 10));
        assertEquals(1, MakeChocolate.makeChocolate(6, 2, 11));
        assertEquals(2, MakeChocolate.makeChocolate(6, 2, 12));
        assertEquals(50, MakeChocolate.makeChocolate(60, 100, 550));
        assertEquals(6, MakeChocolate.makeChocolate(1000, 1000000, 5000006));
        assertEquals(7, MakeChocolate.makeChocolate(7, 1, 12));
        assertEquals(-1, MakeChocolate.makeChocolate(7, 1, 13));
        assertEquals(3, MakeChocolate.makeChocolate(7, 2, 13));
    }
}


