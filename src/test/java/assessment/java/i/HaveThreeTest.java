package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class HaveThreeTest {
    /**
     * < Q6 >
     * Tests the haveThree method.
     */
    @Test
    public void testHaveThree() {
        assertTrue(HaveThree.haveThree(new int[]{3, 1, 3, 1, 3}));
        assertFalse(HaveThree.haveThree(new int[]{3, 1, 3, 3}));
        assertFalse(HaveThree.haveThree(new int[]{3, 4, 3, 3, 4}));
        assertFalse(HaveThree.haveThree(new int[]{1, 3, 1, 3, 1, 2}));
        assertTrue(HaveThree.haveThree(new int[]{1, 3, 1, 3, 1, 3}));
        assertFalse(HaveThree.haveThree(new int[]{1, 3, 3, 1, 3}));
        assertFalse(HaveThree.haveThree(new int[]{1, 3, 1, 3, 1, 3, 4, 3}));
        assertTrue(HaveThree.haveThree(new int[]{3, 4, 3, 4, 3, 4, 4}));
        assertFalse(HaveThree.haveThree(new int[]{3, 3, 3}));
        assertFalse(HaveThree.haveThree(new int[]{1, 3}));
        assertFalse(HaveThree.haveThree(new int[]{3}));
        assertFalse(HaveThree.haveThree(new int[]{1}));
    }
}
