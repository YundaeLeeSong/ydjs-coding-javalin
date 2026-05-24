package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ChangeXYTest {
    /**
     * < Q14 >
     * Tests the changeXY method.
     */
    @Test
    public void testChangeXY() {
        assertEquals("codey", ChangeXY.changeXY("codex"));
        assertEquals("yyhiyy", ChangeXY.changeXY("xxhixx"));
        assertEquals("yhiyhiy", ChangeXY.changeXY("xhixhix"));
        assertEquals("hiy", ChangeXY.changeXY("hiy"));
        assertEquals("h", ChangeXY.changeXY("h"));
        assertEquals("y", ChangeXY.changeXY("x"));
        assertEquals("", ChangeXY.changeXY(""));
        assertEquals("yyy", ChangeXY.changeXY("xxx"));
        assertEquals("yyhyyi", ChangeXY.changeXY("yyhxyi"));
        assertEquals("hihi", ChangeXY.changeXY("hihi"));
    }
}
