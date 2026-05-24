package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class BobThereTest {
    /**
     * < Q8 >
     * Tests the bobThere method.
     */
    @Test
    public void testBobThere() {
        assertTrue(BobThere.bobThere("abcbob"));
        assertTrue(BobThere.bobThere("b9b"));
        assertFalse(BobThere.bobThere("bac"));
        assertTrue(BobThere.bobThere("bbb"));
        assertFalse(BobThere.bobThere("abcdefb"));
        assertTrue(BobThere.bobThere("123abcbcdbabxyz"));
        assertFalse(BobThere.bobThere("b12"));
        assertTrue(BobThere.bobThere("b1b"));
        assertTrue(BobThere.bobThere("b12b1b"));
        assertFalse(BobThere.bobThere("bbc"));
        assertFalse(BobThere.bobThere("bb"));
        assertFalse(BobThere.bobThere("b"));
    }
}
