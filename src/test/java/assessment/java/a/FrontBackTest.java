package assessment.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FrontBackTest {
    @Test
    public void testFrontBack() {
        assertEquals("eodc", FrontBack.frontBack("code"));
        assertEquals("a", FrontBack.frontBack("a"));
        assertEquals("ba", FrontBack.frontBack("ab"));
        assertEquals("cba", FrontBack.frontBack("abc"));
        assertEquals("", FrontBack.frontBack(""));
        assertEquals("ehocolatC", FrontBack.frontBack("Chocolate"));
        assertEquals("java", FrontBack.frontBack("aavj"));
        assertEquals("oellh", FrontBack.frontBack("hello"));
    }
}


