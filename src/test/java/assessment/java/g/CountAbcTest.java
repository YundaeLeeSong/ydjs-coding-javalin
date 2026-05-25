package assessment.java.g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CountAbcTest {
    /**
     * < Q12 >
     * Tests the countAbc method.
     */
    @Test
    public void testCountAbc() {
        assertEquals(1, CountAbc.countAbc("abc"));
        assertEquals(2, CountAbc.countAbc("abcxxabc"));
        assertEquals(2, CountAbc.countAbc("abaxxaba"));
        assertEquals(2, CountAbc.countAbc("ababc"));
        assertEquals(0, CountAbc.countAbc("abxbc"));
        assertEquals(1, CountAbc.countAbc("aaabc"));
        assertEquals(0, CountAbc.countAbc("hello"));
        assertEquals(0, CountAbc.countAbc(""));
        assertEquals(0, CountAbc.countAbc("ab"));
        assertEquals(1, CountAbc.countAbc("aba"));
        assertEquals(0, CountAbc.countAbc("aca"));
        assertEquals(0, CountAbc.countAbc("aaa"));
    }
}


