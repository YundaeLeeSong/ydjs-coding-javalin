package exam.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindBottomTwoElementsTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 5}, 
            FindBottomTwoElements.findBottomTwoElements(
                new int[]{9, 5, 12, 1, 8}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{3, 6}, 
            FindBottomTwoElements.findBottomTwoElements(
                new int[]{15, 7, 3, 10, 6}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{2, 2}, 
            FindBottomTwoElements.findBottomTwoElements(
                new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{50, 75}, 
            FindBottomTwoElements.findBottomTwoElements(
                new int[]{100, 50, 75, 125, 200}));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[]{0, 5}, 
            FindBottomTwoElements.findBottomTwoElements(
                new int[]{20, 15, 10, 5, 0}));
    }
}


