package assessment.java.f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class AllStarTest {
    /**
     * < Q12 >
     * Tests the allStar method.
     */
    @Test
    public void testAllStar() {
        assertEquals("h*e*l*l*o", AllStar.allStar("hello"));
        assertEquals("a*b*c", AllStar.allStar("abc"));
        assertEquals("a*b", AllStar.allStar("ab"));
        assertEquals("a", AllStar.allStar("a"));
        assertEquals("", AllStar.allStar(""));
        assertEquals("3*.*1*4", AllStar.allStar("3.14"));
        assertEquals("C*h*o*c*o*l*a*t*e", AllStar.allStar("Chocolate"));
        assertEquals("1*2*3*4", AllStar.allStar("1234"));
    }
}
