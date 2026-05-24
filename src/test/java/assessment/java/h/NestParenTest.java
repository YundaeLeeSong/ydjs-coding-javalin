package assessment.java.h;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class NestParenTest {
    /**
     * < Q13 >
     * Tests the nestParen method.
     */
    @Test
    public void testNestParen() {
        assertTrue(NestParen.nestParen("(())"));
        assertTrue(NestParen.nestParen("((()))"));
        assertFalse(NestParen.nestParen("(((x))"));
        assertFalse(NestParen.nestParen("((())"));
        assertTrue(NestParen.nestParen("()"));
        assertTrue(NestParen.nestParen(""));
        assertFalse(NestParen.nestParen("(yy)"));
        assertTrue(NestParen.nestParen("(())"));
        assertFalse(NestParen.nestParen("(((y))"));
        assertFalse(NestParen.nestParen("((y)))"));
        assertTrue(NestParen.nestParen("((()))"));
        assertFalse(NestParen.nestParen("(())))"));
        assertFalse(NestParen.nestParen("((yy())))"));
        assertTrue(NestParen.nestParen("(((())))"));
    }
}
