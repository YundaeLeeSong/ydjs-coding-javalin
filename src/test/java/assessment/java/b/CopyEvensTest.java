package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CopyEvensTest {
    @Test
    public void testCopyEvens() {
        assertArrayEquals(new int[]{2, 4}, 
            CopyEvens.copyEvens(new int[]{3, 2, 4, 5, 8}, 2));
        assertArrayEquals(new int[]{2, 4, 8}, 
            CopyEvens.copyEvens(new int[]{3, 2, 4, 5, 8}, 3));
        assertArrayEquals(new int[]{6, 2, 4}, 
            CopyEvens.copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3));
        assertArrayEquals(new int[]{6, 2, 4, 8}, 
            CopyEvens.copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 4));
        assertArrayEquals(new int[]{4}, 
            CopyEvens.copyEvens(new int[]{3, 1, 4, 1, 5}, 1));
        assertArrayEquals(new int[]{2}, 
            CopyEvens.copyEvens(new int[]{2}, 1));
        assertArrayEquals(new int[]{6, 2}, 
            CopyEvens.copyEvens(new int[]{6, 2, 4, 8}, 2));
        assertArrayEquals(new int[]{6, 2, 4}, 
            CopyEvens.copyEvens(new int[]{6, 2, 4, 8}, 3));
        assertArrayEquals(new int[]{6, 2, 4, 8}, 
            CopyEvens.copyEvens(new int[]{6, 2, 4, 8}, 4));
        assertArrayEquals(new int[]{8}, 
            CopyEvens.copyEvens(new int[]{1, 8, 4}, 1));
        assertArrayEquals(new int[]{8, 4}, 
            CopyEvens.copyEvens(new int[]{1, 8, 4}, 2));
        assertArrayEquals(new int[]{2, 8}, 
            CopyEvens.copyEvens(new int[]{2, 8, 4}, 2));
    }
}


