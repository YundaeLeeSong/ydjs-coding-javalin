package assessment.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MixStartTest {
    @Test
    public void testMixStart() {
        assertTrue(MixStart.mixStart("mix snacks"));
        assertTrue(MixStart.mixStart("pix snacks"));
        assertFalse(MixStart.mixStart("piz snacks"));
        assertTrue(MixStart.mixStart("nix"));
        assertFalse(MixStart.mixStart("ni"));
        assertFalse(MixStart.mixStart("n"));
    }
}


