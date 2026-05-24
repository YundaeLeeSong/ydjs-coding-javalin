package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class NotReplaceTest {
    /**
     * < Q6 >
     * Tests the notReplace method.
     */
    @Test
    public void testNotReplace() {
        assertEquals("is not test", NotReplace.notReplace("is test"));
        assertEquals("is not-is not", NotReplace.notReplace("is-is"));
        assertEquals("This is not right", 
            NotReplace.notReplace("This is right"));
        assertEquals("This is not isabell", 
            NotReplace.notReplace("This is isabell"));
        assertEquals("", NotReplace.notReplace(""));
        assertEquals("is not", NotReplace.notReplace("is"));
        assertEquals("isis", NotReplace.notReplace("isis"));
        assertEquals("Dis is not bliss is not", 
            NotReplace.notReplace("Dis is bliss is"));
        assertEquals("is not his", NotReplace.notReplace("is his"));
        assertEquals("xis yis", NotReplace.notReplace("xis yis"));
        assertEquals("AAAis is not", NotReplace.notReplace("AAAis is"));
    }
}
