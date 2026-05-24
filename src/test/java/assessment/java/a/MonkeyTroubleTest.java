package assessment.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonkeyTroubleTest {
    @Test
    public void testMonkeyTrouble() {
        assertTrue(MonkeyTrouble.monkeyTrouble(true, true));
        assertTrue(MonkeyTrouble.monkeyTrouble(false, false));
        assertFalse(MonkeyTrouble.monkeyTrouble(true, false));
        assertFalse(MonkeyTrouble.monkeyTrouble(false, true));
    }
}
