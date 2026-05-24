package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Post4Test {
    /**
     * < Q9 >
     * Tests the post4 method.
     */
    @Test
    public void testPost4() {
        assertArrayEquals(new int[]{1, 2}, Post4.post4(new int[]{2, 4, 1, 2}));
        assertArrayEquals(new int[]{2}, Post4.post4(new int[]{4, 1, 4, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, Post4.post4(new int[]{4, 4, 1, 2, 3}));
        assertArrayEquals(new int[]{2}, Post4.post4(new int[]{4, 2}));
        assertArrayEquals(new int[]{3}, Post4.post4(new int[]{4, 4, 3}));
        assertArrayEquals(new int[]{}, Post4.post4(new int[]{4, 4}));
        assertArrayEquals(new int[]{}, Post4.post4(new int[]{4}));
        assertArrayEquals(new int[]{3, 2}, Post4.post4(new int[]{2, 4, 1, 4, 3, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, Post4.post4(new int[]{4, 1, 4, 2, 2, 2}));
        assertArrayEquals(new int[]{3, 2}, Post4.post4(new int[]{3, 4, 3, 2}));
    }
}
