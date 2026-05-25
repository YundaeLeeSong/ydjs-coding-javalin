package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Pre4Test {
    /**
     * < Q3 >
     * Tests the pre4 method.
     */
    @Test
    public void testPre4() {
        assertArrayEquals(new int[]{1, 2}, 
            Pre4.pre4(new int[]{1, 2, 4, 1}));
        assertArrayEquals(new int[]{3, 1}, 
            Pre4.pre4(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{1}, 
            Pre4.pre4(new int[]{1, 4, 4}));
        assertArrayEquals(new int[]{1}, 
            Pre4.pre4(new int[]{1, 4, 4, 2}));
        assertArrayEquals(new int[]{1, 3}, 
            Pre4.pre4(new int[]{1, 3, 4, 2, 4}));
        assertArrayEquals(new int[]{}, 
            Pre4.pre4(new int[]{4, 4}));
        assertArrayEquals(new int[]{3, 3}, 
            Pre4.pre4(new int[]{3, 3, 4}));
        assertArrayEquals(new int[]{1, 2, 1}, 
            Pre4.pre4(new int[]{1, 2, 1, 4}));
        assertArrayEquals(new int[]{2, 1}, 
            Pre4.pre4(new int[]{2, 1, 4, 2}));
        assertArrayEquals(new int[]{2, 1, 2, 1}, 
            Pre4.pre4(new int[]{2, 1, 2, 1, 4, 2}));
    }
}


