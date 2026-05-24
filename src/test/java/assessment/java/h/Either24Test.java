package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Either24Test {
    /**
     * < Q3 >
     * Tests the either24 method.
     */
    @Test
    public void testEither24() {
        assertTrue(Either24.either24(new int[]{1, 2, 2}));
        assertTrue(Either24.either24(new int[]{4, 4, 1}));
        assertFalse(Either24.either24(new int[]{4, 4, 1, 2, 2}));
        assertFalse(Either24.either24(new int[]{1, 2, 3, 4}));
        assertFalse(Either24.either24(new int[]{3, 5, 9}));
        assertTrue(Either24.either24(new int[]{1, 2, 3, 4, 4}));
        assertTrue(Either24.either24(new int[]{2, 2, 3, 4}));
        assertTrue(Either24.either24(new int[]{1, 2, 3, 2, 2, 4}));
        assertFalse(Either24.either24(new int[]{1, 2, 3, 2, 2, 4, 4}));
        assertFalse(Either24.either24(new int[]{1, 2}));
        assertTrue(Either24.either24(new int[]{2, 2}));
        assertTrue(Either24.either24(new int[]{4, 4}));
        assertFalse(Either24.either24(new int[]{2}));
        assertFalse(Either24.either24(new int[]{}));
    }
}
