package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class MaxBlockTest {
    /**
     * < Q5 >
     * Tests the maxBlock method.
     */
    @Test
    public void testMaxBlock() {
        assertEquals(2, MaxBlock.maxBlock("hoopla"));
        assertEquals(3, MaxBlock.maxBlock("abbCCCddBBBxx"));
        assertEquals(0, MaxBlock.maxBlock(""));
        assertEquals(1, MaxBlock.maxBlock("xyz"));
        assertEquals(2, MaxBlock.maxBlock("xxyz"));
        assertEquals(2, MaxBlock.maxBlock("xyzz"));
        assertEquals(3, MaxBlock.maxBlock("abbbcbbbxbbbx"));
        assertEquals(3, MaxBlock.maxBlock("XXBBBbbxx"));
        assertEquals(4, MaxBlock.maxBlock("XXBBBBbbxx"));
        assertEquals(4, MaxBlock.maxBlock("XXBBBbbxxXXXX"));
        assertEquals(4, MaxBlock.maxBlock("XX2222BBBbbXX2222"));
    }
}
