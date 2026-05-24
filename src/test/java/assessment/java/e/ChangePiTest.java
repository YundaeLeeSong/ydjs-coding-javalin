package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ChangePiTest {
    /**
     * < Q11 >
     * Tests the changePi method.
     */
    @Test
    public void testChangePi() {
        assertEquals("x3.14x", ChangePi.changePi("xpix"));
        assertEquals("3.143.14", ChangePi.changePi("pipi"));
        assertEquals("3.14p", ChangePi.changePi("pip"));
        assertEquals("3.14", ChangePi.changePi("pi"));
        assertEquals("hip", ChangePi.changePi("hip"));
        assertEquals("p", ChangePi.changePi("p"));
        assertEquals("x", ChangePi.changePi("x"));
        assertEquals("", ChangePi.changePi(""));
        assertEquals("3.14xx", ChangePi.changePi("pixx"));
        assertEquals("xyzzy", ChangePi.changePi("xyzzy"));
    }
}
