package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordsFrontTest {
    @Test
    public void testWordsFront() {
        assertArrayEquals(new String[]{"a"}, 
            WordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 1));
        assertArrayEquals(new String[]{"a", "b"}, 
            WordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 2));
        assertArrayEquals(new String[]{"a", "b", "c"}, 
            WordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 3));
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, 
            WordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 4));
        assertArrayEquals(new String[]{"Hi"}, 
            WordsFront.wordsFront(new String[]{"Hi", "There"}, 1));
        assertArrayEquals(new String[]{"Hi", "There"}, 
            WordsFront.wordsFront(new String[]{"Hi", "There"}, 2));
    }
}


