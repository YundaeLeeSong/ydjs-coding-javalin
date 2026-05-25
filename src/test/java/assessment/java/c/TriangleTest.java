package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class TriangleTest {
    /**
     * < Q11 >
     * Tests the triangle method.
     */
    @Test
    public void testTriangle() {
        assertEquals(0, Triangle.triangle(0));
        assertEquals(1, Triangle.triangle(1));
        assertEquals(3, Triangle.triangle(2));
        assertEquals(6, Triangle.triangle(3));
        assertEquals(10, Triangle.triangle(4));
        assertEquals(15, Triangle.triangle(5));
        assertEquals(21, Triangle.triangle(6));
        assertEquals(28, Triangle.triangle(7));
    }
}


