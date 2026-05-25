package assessment.java.b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HasOneTest {
    @Test
    public void testHasOne() {
        assertTrue(HasOne.hasOne(10));
        assertFalse(HasOne.hasOne(22));
        assertFalse(HasOne.hasOne(220));
        assertTrue(HasOne.hasOne(212));
        assertTrue(HasOne.hasOne(1));
        assertFalse(HasOne.hasOne(9));
        assertTrue(HasOne.hasOne(211112));
        assertTrue(HasOne.hasOne(121121));
        assertFalse(HasOne.hasOne(222222));
        assertTrue(HasOne.hasOne(56156));
        assertFalse(HasOne.hasOne(56556));
    }
}


