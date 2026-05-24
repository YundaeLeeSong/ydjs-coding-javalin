package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BunnyEars2Test {
    @Test
    public void testBunnyEars2() {
        assertEquals(0, BunnyEars2.bunnyEars2(0));
        assertEquals(2, BunnyEars2.bunnyEars2(1));
        assertEquals(5, BunnyEars2.bunnyEars2(2));
        assertEquals(7, BunnyEars2.bunnyEars2(3));
        assertEquals(10, BunnyEars2.bunnyEars2(4));
        assertEquals(12, BunnyEars2.bunnyEars2(5));
        assertEquals(15, BunnyEars2.bunnyEars2(6));
        assertEquals(25, BunnyEars2.bunnyEars2(10));
    }
}
