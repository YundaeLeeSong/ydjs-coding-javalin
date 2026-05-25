package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class StrDistTest {
    /**
     * < Q12 >
     * Tests the strDist method.
     */
    @Test
    public void testStrDist() {
        assertEquals(9, StrDist.strDist("catcowcat", "cat"));
        assertEquals(3, StrDist.strDist("catcowcat", "cow"));
        assertEquals(9, StrDist.strDist("cccatcowcatxx", "cat"));
        assertEquals(12, StrDist.strDist("abccatcowcatcatxyz", "cat"));
        assertEquals(3, StrDist.strDist("xyx", "x"));
        assertEquals(1, StrDist.strDist("xyx", "y"));
        assertEquals(0, StrDist.strDist("xyx", "z"));
        assertEquals(1, StrDist.strDist("z", "z"));
        assertEquals(0, StrDist.strDist("x", "z"));
        assertEquals(0, StrDist.strDist("", "z"));
        assertEquals(13, StrDist.strDist("hiHellohihihi", "hi"));
        assertEquals(5, StrDist.strDist("hiHellohihihi", "hih"));
        assertEquals(1, StrDist.strDist("hiHellohihihi", "o"));
        assertEquals(2, StrDist.strDist("hiHellohihihi", "II"));
    }
}


