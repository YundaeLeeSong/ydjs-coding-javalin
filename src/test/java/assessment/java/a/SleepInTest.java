package assessment.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SleepInTest {
    @Test
    public void testSleepIn() {
        assertTrue(SleepIn.sleepIn(true, true));
        assertFalse(SleepIn.sleepIn(true, false));
        assertTrue(SleepIn.sleepIn(false, true));
        assertTrue(SleepIn.sleepIn(false, false));
    }
}


