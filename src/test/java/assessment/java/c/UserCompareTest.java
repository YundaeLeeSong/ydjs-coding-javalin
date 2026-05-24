package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class UserCompareTest {
    /**
     * < Q9 >
     * Tests the userCompare method.
     */
    @Test
    public void testUserCompare() {
        assertEquals(-1, UserCompare.userCompare("bb", 1, "zz", 2));
        assertEquals(1, UserCompare.userCompare("bb", 1, "aa", 2));
        assertEquals(0, UserCompare.userCompare("bb", 1, "bb", 1));
        assertEquals(1, UserCompare.userCompare("bb", 5, "bb", 1));
        assertEquals(-1, UserCompare.userCompare("bb", 5, "bb", 10));
        assertEquals(-1, UserCompare.userCompare("adam", 1, "bob", 2));
        assertEquals(-1, UserCompare.userCompare("bob", 1, "bob", 2));
        assertEquals(1, UserCompare.userCompare("bzb", 1, "bob", 2));
    }
}
