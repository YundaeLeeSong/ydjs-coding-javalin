package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class NotAloneTest {
    /**
     * < Q10 >
     * Tests the notAlone method.
     */
    @Test
    public void testNotAlone() {
        assertArrayEquals(new int[]{1, 3, 3}, 
            NotAlone.notAlone(new int[]{1, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 2}, 
            NotAlone.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2));
        assertArrayEquals(new int[]{3, 4}, 
            NotAlone.notAlone(new int[]{3, 4}, 3));
        assertArrayEquals(new int[]{3, 3}, 
            NotAlone.notAlone(new int[]{3, 3}, 3));
        assertArrayEquals(new int[]{1, 3, 3, 2}, 
            NotAlone.notAlone(new int[]{1, 3, 1, 2}, 1));
        assertArrayEquals(new int[]{3}, NotAlone.notAlone(new int[]{3}, 3));
        assertArrayEquals(new int[]{}, NotAlone.notAlone(new int[]{}, 3));
        assertArrayEquals(new int[]{7, 7, 6}, 
            NotAlone.notAlone(new int[]{7, 1, 6}, 1));
        assertArrayEquals(new int[]{1, 1, 1}, 
            NotAlone.notAlone(new int[]{1, 1, 1}, 1));
        assertArrayEquals(new int[]{1, 1, 1, 2}, 
            NotAlone.notAlone(new int[]{1, 1, 1, 2}, 1));
    }
}


