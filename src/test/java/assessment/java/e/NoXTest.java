package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class NoXTest {
    /**
     * < Q12 >
     * Tests the noX method.
     */
    @Test
    public void testNoX() {
        assertEquals("ab", NoX.noX("xaxb"));
        assertEquals("abc", NoX.noX("abc"));
        assertEquals("", NoX.noX("xx"));
        assertEquals("", NoX.noX(""));
        assertEquals("ab", NoX.noX("axxbxx"));
        assertEquals("Hello", NoX.noX("Hellox"));
    }
}


