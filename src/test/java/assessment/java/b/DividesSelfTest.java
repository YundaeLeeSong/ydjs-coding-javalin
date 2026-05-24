package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DividesSelfTest {
    @Test
    public void testDividesSelf() {
        assertTrue(DividesSelf.dividesSelf(128));
        assertTrue(DividesSelf.dividesSelf(12));
        assertFalse(DividesSelf.dividesSelf(120));
        assertTrue(DividesSelf.dividesSelf(122));
        assertFalse(DividesSelf.dividesSelf(13));
        assertFalse(DividesSelf.dividesSelf(32));
        assertTrue(DividesSelf.dividesSelf(22));
        assertFalse(DividesSelf.dividesSelf(42));
        assertTrue(DividesSelf.dividesSelf(212));
        assertFalse(DividesSelf.dividesSelf(213));
        assertTrue(DividesSelf.dividesSelf(162));
    }
}
