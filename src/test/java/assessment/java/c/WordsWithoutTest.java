package assessment.java.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class WordsWithoutTest {
    /**
     * < Q4 >
     * Tests the wordsWithout method.
     */
    @Test
    public void testWordsWithout() {
        assertArrayEquals(new String[]{"b", "c"}, 
            WordsWithout.wordsWithout(
                new String[]{"a", "b", "c", "a"}, "a"));
        assertArrayEquals(new String[]{"a", "c", "a"}, 
            WordsWithout.wordsWithout(
                new String[]{"a", "b", "c", "a"}, "b"));
        assertArrayEquals(new String[]{"a", "b", "a"}, 
            WordsWithout.wordsWithout(
                new String[]{"a", "b", "c", "a"}, "c"));
        assertArrayEquals(new String[]{"c", "a", "a"}, 
            WordsWithout.wordsWithout(
                new String[]{"b", "c", "a", "a"}, "b"));
        assertArrayEquals(new String[]{"xx", "yyy", "yy"}, 
            WordsWithout.wordsWithout(
                new String[]{"xx", "yyy", "x", "yy", "x"}, "x"));
        assertArrayEquals(new String[]{"xx", "yyy", "x", "x"}, 
            WordsWithout.wordsWithout(
                new String[]{"xx", "yyy", "x", "yy", "x"}, "yy"));
        assertArrayEquals(new String[]{"ab", "ac"}, 
            WordsWithout.wordsWithout(
                new String[]{"aa", "ab", "ac", "aa"}, "aa"));
    }
}


