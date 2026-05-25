package exam.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseArrayTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, 
            ReverseArray.reverseArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{50, 40, 30, 20, 10}, 
            ReverseArray.reverseArray(new int[]{10, 20, 30, 40, 50}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{500, 400, 300, 200, 100}, 
            ReverseArray.reverseArray(new int[]{100, 200, 300, 400, 500}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, 
            ReverseArray.reverseArray(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, 
            ReverseArray.reverseArray(new int[]{0, 0, 0, 0, 0}));
    }
}
