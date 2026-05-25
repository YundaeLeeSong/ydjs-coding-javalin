package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    public void testFactorial() {
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(120, Factorial.factorial(5));
        assertEquals(720, Factorial.factorial(6));
        assertEquals(5040, Factorial.factorial(7));
        assertEquals(40320, Factorial.factorial(8));
        assertEquals(479001600, Factorial.factorial(12));
    }
}


