package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CountHiTest {
    /**
     * < Q3 >
     * Tests the countHi method.
     */
    @Test
    public void testCountHi() {
        assertEquals(1, CountHi.countHi("abc hi ho"));
        assertEquals(2, CountHi.countHi("ABChi hi"));
        assertEquals(2, CountHi.countHi("hihi"));
        assertEquals(2, CountHi.countHi("hiHIhi"));
        assertEquals(0, CountHi.countHi(""));
        assertEquals(0, CountHi.countHi("h"));
        assertEquals(1, CountHi.countHi("hi"));
        assertEquals(0, CountHi.countHi("Hi is no HI on ahI"));
        assertEquals(2, CountHi.countHi("hiho not HOHIhi"));
    }
}


