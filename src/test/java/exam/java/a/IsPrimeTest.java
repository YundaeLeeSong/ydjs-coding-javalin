package exam.java.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPrimeTest {
    @Test
    public void test1() {
        assertTrue(IsPrime.isPrime(7));
    }

    @Test
    public void test2() {
        assertFalse(IsPrime.isPrime(20));
    }

    @Test
    public void test3() {
        assertTrue(IsPrime.isPrime(13));
    }

    @Test
    public void test4() {
        assertFalse(IsPrime.isPrime(66));
    }

    @Test
    public void test5() {
        assertTrue(IsPrime.isPrime(11));
    }
}


