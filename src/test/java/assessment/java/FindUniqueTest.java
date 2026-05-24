package assessment.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindUniqueTest {
    @Test
    public void test1() {
        assertEquals(3, FindUnique.findUnique(new int[]{1, 1, 2, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(7, FindUnique.findUnique(new int[]{12, 7, 12, 3, 3}));
    }

    @Test
    public void test3() {
        assertEquals(5, FindUnique.findUnique(new int[]{8, 7, 6, 5, 6, 7, 8}));
    }

    @Test
    public void test4() {
        assertEquals(11, FindUnique.findUnique(new int[]{22, 33, 33, 11, 22}));
    }

    @Test
    public void test5() {
        assertEquals(902, FindUnique.findUnique(new int[]{902, 425, 501, 337, 501, 337, 215, 425, 215}));
    }
}
