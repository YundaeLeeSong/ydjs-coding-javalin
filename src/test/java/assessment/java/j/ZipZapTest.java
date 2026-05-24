package assessment.java.j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ZipZapTest {
    /**
     * < Q8 >
     * Tests the zipZap method.
     */
    @Test
    public void testZipZap() {
        assertEquals("zpXzp", ZipZap.zipZap("zipXzap"));
        assertEquals("zpzp", ZipZap.zipZap("zopzop"));
        assertEquals("zzzpzp", ZipZap.zipZap("zzzopzop"));
        assertEquals("zibzp", ZipZap.zipZap("zibzap"));
        assertEquals("zp", ZipZap.zipZap("zip"));
        assertEquals("zi", ZipZap.zipZap("zi"));
        assertEquals("z", ZipZap.zipZap("z"));
        assertEquals("", ZipZap.zipZap(""));
        assertEquals("zp", ZipZap.zipZap("zzp"));
        assertEquals("abcppp", ZipZap.zipZap("abcppp"));
        assertEquals("azbcppp", ZipZap.zipZap("azbcppp"));
        assertEquals("azbcpzp", ZipZap.zipZap("azbcpzpp"));
    }
}
