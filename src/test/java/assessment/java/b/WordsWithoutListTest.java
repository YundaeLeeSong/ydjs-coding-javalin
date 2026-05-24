package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordsWithoutListTest {
    @Test
    public void testWordsWithoutList() {
        assertArrayEquals(new String[]{"bb", "ccc"}, 
            WordsWithoutList.wordsWithoutList(
                new String[]{"a", "bb", "b", "ccc"}, 1));
        assertArrayEquals(new String[]{"a", "bb", "b"}, 
            WordsWithoutList.wordsWithoutList(
                new String[]{"a", "bb", "b", "ccc"}, 3));
        assertArrayEquals(new String[]{"a", "bb", "b", "ccc"}, 
            WordsWithoutList.wordsWithoutList(
                new String[]{"a", "bb", "b", "ccc"}, 4));
        assertArrayEquals(new String[]{"xx", "yyy", "yy"}, 
            WordsWithoutList.wordsWithoutList(
                new String[]{"xx", "yyy", "x", "yy", "z"}, 1));
        assertArrayEquals(new String[]{"yyy", "x", "z"}, 
            WordsWithoutList.wordsWithoutList(
                new String[]{"xx", "yyy", "x", "yy", "z"}, 2));
    }
}
