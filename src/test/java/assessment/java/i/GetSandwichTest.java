package assessment.java.i;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class GetSandwichTest {
    /**
     * < Q4 >
     * Tests the getSandwich method.
     */
    @Test
    public void testGetSandwich() {
        assertEquals("jam", GetSandwich.getSandwich("breadjambread"));
        assertEquals("jam", GetSandwich.getSandwich("xxbreadjambreadyy"));
        assertEquals("", GetSandwich.getSandwich("xxbreadyy"));
        assertEquals("breadjam", 
            GetSandwich.getSandwich("xxbreadbreadjambreadyy"));
        assertEquals("A", GetSandwich.getSandwich("breadAbread"));
        assertEquals("", GetSandwich.getSandwich("breadbread"));
        assertEquals("", GetSandwich.getSandwich("abcbreaz"));
        assertEquals("", GetSandwich.getSandwich("xyz"));
        assertEquals("", GetSandwich.getSandwich(""));
        assertEquals("breax", GetSandwich.getSandwich("breadbreaxbread"));
        assertEquals("y", GetSandwich.getSandwich("breaxbreadybread"));
        assertEquals("breadbread", 
            GetSandwich.getSandwich("breadbreadbreadbread"));
    }
}


