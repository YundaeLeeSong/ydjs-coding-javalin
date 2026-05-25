package assessment.java.d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class CatDogTest {
    /**
     * < Q10 >
     * Tests the catDog method.
     */
    @Test
    public void testCatDog() {
        assertTrue(CatDog.catDog("catdog"));
        assertFalse(CatDog.catDog("catcat"));
        assertTrue(CatDog.catDog("1cat1cadodog"));
        assertFalse(CatDog.catDog("catxxdogxxxdog"));
        assertTrue(CatDog.catDog("catxdogxdogxcat"));
        assertFalse(CatDog.catDog("catxdogxdogxca"));
        assertFalse(CatDog.catDog("dogdogcat"));
        assertTrue(CatDog.catDog("dogogcat"));
        assertFalse(CatDog.catDog("dog"));
        assertFalse(CatDog.catDog("cat"));
        assertTrue(CatDog.catDog("ca"));
        assertTrue(CatDog.catDog("c"));
        assertTrue(CatDog.catDog(""));
    }
}


