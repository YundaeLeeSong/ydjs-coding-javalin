package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class IsEverywhereTest {
    /**
     * < Q4 >
     * Tests the isEverywhere method.
     */
    @Test
    public void testIsEverywhere() {
        assertTrue(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        assertFalse(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 2));
        assertFalse(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
        assertTrue(IsEverywhere.isEverywhere(new int[]{2, 1, 2, 1}, 1));
        assertTrue(IsEverywhere.isEverywhere(new int[]{2, 1, 2, 1}, 2));
        assertFalse(IsEverywhere.isEverywhere(new int[]{2, 1, 2, 3, 1}, 2));
        assertTrue(IsEverywhere.isEverywhere(new int[]{3, 1}, 3));
        assertFalse(IsEverywhere.isEverywhere(new int[]{3, 1}, 2));
        assertTrue(IsEverywhere.isEverywhere(new int[]{3}, 1));
        assertTrue(IsEverywhere.isEverywhere(new int[]{}, 1));
        assertTrue(IsEverywhere.isEverywhere(
            new int[]{1, 2, 1, 2, 3, 2, 5}, 2));
        assertFalse(IsEverywhere.isEverywhere(
            new int[]{1, 2, 1, 1, 1, 2}, 2));
        assertFalse(IsEverywhere.isEverywhere(
            new int[]{2, 1, 2, 1, 1, 2}, 2));
        assertFalse(IsEverywhere.isEverywhere(
            new int[]{2, 1, 2, 2, 2, 1, 1, 2}, 2));
        assertTrue(IsEverywhere.isEverywhere(
            new int[]{2, 1, 2, 2, 2, 1, 2, 1}, 2));
        assertTrue(IsEverywhere.isEverywhere(new int[]{2, 1, 2, 1, 2}, 2));
    }
}


