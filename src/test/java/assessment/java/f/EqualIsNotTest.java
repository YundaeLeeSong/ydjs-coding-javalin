package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class EqualIsNotTest {
    /**
     * < Q3 >
     * Tests the equalIsNot method.
     */
    @Test
    public void testEqualIsNot() {
        assertFalse(EqualIsNot.equalIsNot("This is not"));
        assertTrue(EqualIsNot.equalIsNot("This is notnot"));
        assertTrue(EqualIsNot.equalIsNot("noisxxnotyynotxisi"));
        assertFalse(EqualIsNot.equalIsNot("noisxxnotyynotxsi"));
        assertTrue(EqualIsNot.equalIsNot("xxxyyyzzzintint"));
        assertTrue(EqualIsNot.equalIsNot(""));
        assertTrue(EqualIsNot.equalIsNot("isisnotnot"));
        assertFalse(EqualIsNot.equalIsNot("isisnotno7Not"));
        assertFalse(EqualIsNot.equalIsNot("isnotis"));
        assertFalse(EqualIsNot.equalIsNot("mis3notpotbotis"));
    }
}


