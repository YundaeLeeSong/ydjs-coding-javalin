package visa.java.a;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextJustificationTest {

    @Test
    public void testExample1() {
        TextJustification tj = new TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> expected = Arrays.asList(
            "This    is    an",
            "example  of text",
            "justification.  "
        );
        assertEquals(expected, tj.fullJustify(words, maxWidth));
    }

    @Test
    public void testExample2() {
        TextJustification tj = new TextJustification();
        String[] words = {"What","must","be","acknowledgment","shall","be"};
        int maxWidth = 16;
        List<String> expected = Arrays.asList(
            "What   must   be",
            "acknowledgment  ",
            "shall be        "
        );
        assertEquals(expected, tj.fullJustify(words, maxWidth));
    }

    @Test
    public void testExample3() {
        TextJustification tj = new TextJustification();
        String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        int maxWidth = 20;
        List<String> expected = Arrays.asList(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
        );
        assertEquals(expected, tj.fullJustify(words, maxWidth));
    }

    @Test
    public void testNullOrEmptyInput() {
        TextJustification tj = new TextJustification();
        assertEquals(Arrays.asList(), tj.fullJustify(null, 20));
        assertEquals(Arrays.asList(), tj.fullJustify(new String[0], 20));
    }
}


