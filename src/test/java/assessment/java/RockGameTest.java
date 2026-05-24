package assessment.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RockGameTest {
    @Test
    public void test1() {
        assertEquals(5, RockGame.rockGame(9, 2, 3));
    }

    @Test
    public void test2() {
        assertEquals(7, RockGame.rockGame(11, 1, 2));
    }

    @Test
    public void test3() {
        assertEquals(5, RockGame.rockGame(6, 4, 1));
    }

    @Test
    public void test4() {
        assertEquals(6, RockGame.rockGame(14, 4, 5));
    }

    @Test
    public void test5() {
        assertEquals(9, RockGame.rockGame(21, 6, 7));
    }
}
