package assessment.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Diff21Test {
    @Test
    public void testDiff21() {
        assertEquals(2, Diff21.diff21(19));
        assertEquals(11, Diff21.diff21(10));
        assertEquals(0, Diff21.diff21(21));
        assertEquals(2, Diff21.diff21(22));
        assertEquals(8, Diff21.diff21(25));
        assertEquals(18, Diff21.diff21(30));
        assertEquals(21, Diff21.diff21(0));
        assertEquals(20, Diff21.diff21(1));
        assertEquals(19, Diff21.diff21(2));
        assertEquals(22, Diff21.diff21(-1));
        assertEquals(23, Diff21.diff21(-2));
        assertEquals(58, Diff21.diff21(50));
    }
}
