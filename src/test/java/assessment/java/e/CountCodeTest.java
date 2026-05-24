package assessment.java.e;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CountCodeTest {
    /**
     * < Q1 >
     * Tests the countCode method.
     */
    @Test
    public void testCountCode() {
        assertEquals(1, CountCode.countCode("aaacodebbb"));
        assertEquals(2, CountCode.countCode("codexxcode"));
        assertEquals(2, CountCode.countCode("cozexxcope"));
        assertEquals(1, CountCode.countCode("cozfxxcope"));
        assertEquals(1, CountCode.countCode("xxcozeyycop"));
        assertEquals(0, CountCode.countCode("cozcop"));
        assertEquals(0, CountCode.countCode("abcxyz"));
        assertEquals(1, CountCode.countCode("code"));
        assertEquals(0, CountCode.countCode("ode"));
        assertEquals(0, CountCode.countCode("c"));
        assertEquals(0, CountCode.countCode(""));
        assertEquals(3, CountCode.countCode("AAcodeBBcoleCCccoreDD"));
        assertEquals(2, CountCode.countCode("AAcodeBBcoleCCccorfDD"));
        assertEquals(3, CountCode.countCode("coAcodeBcoleccoreDD"));
    }
}
