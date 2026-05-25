package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordsCountTest {
    @Test
    public void testWordsCount() {
        assertEquals(2, WordsCount.wordsCount(
            new String[]{"a", "bb", "b", "ccc"}, 1));
        assertEquals(1, WordsCount.wordsCount(
            new String[]{"a", "bb", "b", "ccc"}, 3));
        assertEquals(0, WordsCount.wordsCount(
            new String[]{"a", "bb", "b", "ccc"}, 4));
        assertEquals(2, WordsCount.wordsCount(
            new String[]{"xx", "yyy", "x", "yy", "z"}, 1));
        assertEquals(2, WordsCount.wordsCount(
            new String[]{"xx", "yyy", "x", "yy", "z"}, 2));
        assertEquals(1, WordsCount.wordsCount(
            new String[]{"xx", "yyy", "x", "yy", "z"}, 3));
    }
}


