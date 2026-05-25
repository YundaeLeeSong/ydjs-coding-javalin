package assessment.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackAroundTest {
    @Test
    public void testBackAround() {
        assertEquals("tcatt", BackAround.backAround("cat"));
        assertEquals("oHelloo", BackAround.backAround("Hello"));
        assertEquals("aaa", BackAround.backAround("a"));
        assertEquals("cabcc", BackAround.backAround("abc"));
        assertEquals("dreadd", BackAround.backAround("read"));
        assertEquals("obooo", BackAround.backAround("boo"));
    }
}


