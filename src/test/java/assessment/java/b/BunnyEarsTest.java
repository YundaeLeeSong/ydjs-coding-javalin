package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BunnyEarsTest {
    @Test
    public void testBunnyEars() {
        assertEquals(0, BunnyEars.bunnyEars(0));
        assertEquals(2, BunnyEars.bunnyEars(1));
        assertEquals(4, BunnyEars.bunnyEars(2));
        assertEquals(6, BunnyEars.bunnyEars(3));
        assertEquals(8, BunnyEars.bunnyEars(4));
        assertEquals(10, BunnyEars.bunnyEars(5));
        assertEquals(24, BunnyEars.bunnyEars(12));
        assertEquals(100, BunnyEars.bunnyEars(50));
        assertEquals(468, BunnyEars.bunnyEars(234));
    }
}


