package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Only14Test {
    /**
     * < Q8 >
     * Tests the only14 method.
     */
    @Test
    public void testOnly14() {
        assertTrue(Only14.only14(new int[]{1, 4, 1, 4}));
        assertFalse(Only14.only14(new int[]{1, 4, 2, 4}));
        assertTrue(Only14.only14(new int[]{1, 1}));
        assertTrue(Only14.only14(new int[]{4, 1}));
        assertFalse(Only14.only14(new int[]{2}));
        assertTrue(Only14.only14(new int[]{}));
        assertFalse(Only14.only14(new int[]{1, 4, 1, 3}));
        assertFalse(Only14.only14(new int[]{3, 1, 3}));
        assertTrue(Only14.only14(new int[]{1}));
        assertTrue(Only14.only14(new int[]{4}));
        assertFalse(Only14.only14(new int[]{3, 4}));
        assertFalse(Only14.only14(new int[]{1, 3, 4}));
        assertTrue(Only14.only14(new int[]{1, 1, 1}));
        assertFalse(Only14.only14(new int[]{1, 1, 1, 5}));
        assertTrue(Only14.only14(new int[]{4, 1, 4, 1}));
    }
}


