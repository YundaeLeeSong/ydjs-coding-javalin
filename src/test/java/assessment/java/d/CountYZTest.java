package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CountYZTest {
    /**
     * < Q8 >
     * Tests the countYZ method.
     */
    @Test
    public void testCountYZ() {
        assertEquals(2, CountYZ.countYZ("fez day"));
        assertEquals(2, CountYZ.countYZ("day fez"));
        assertEquals(2, CountYZ.countYZ("day fyyyz"));
        assertEquals(1, CountYZ.countYZ("day yak"));
        assertEquals(1, CountYZ.countYZ("day:yak"));
        assertEquals(2, CountYZ.countYZ("!!day--yaz!!"));
        assertEquals(0, CountYZ.countYZ("yak zak"));
        assertEquals(2, CountYZ.countYZ("DAY abc XYZ"));
        assertEquals(3, CountYZ.countYZ("aaz yyz my"));
        assertEquals(2, CountYZ.countYZ("y2bz"));
        assertEquals(0, CountYZ.countYZ("zxyx"));
    }
}


