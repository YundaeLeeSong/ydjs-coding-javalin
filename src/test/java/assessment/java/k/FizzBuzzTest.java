package assessment.java.k;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {
    /**
     * < Q9 >
     * Tests the fizzBuzz method.
     */
    @Test
    public void testFizzBuzz() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, FizzBuzz.fizzBuzz(1, 6));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, FizzBuzz.fizzBuzz(1, 8));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, FizzBuzz.fizzBuzz(1, 11));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, FizzBuzz.fizzBuzz(1, 16));
        assertArrayEquals(new String[]{"1", "2", "Fizz"}, FizzBuzz.fizzBuzz(1, 4));
        assertArrayEquals(new String[]{"1"}, FizzBuzz.fizzBuzz(1, 2));
        assertArrayEquals(new String[]{"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"}, FizzBuzz.fizzBuzz(50, 56));
        assertArrayEquals(new String[]{"FizzBuzz", "16"}, FizzBuzz.fizzBuzz(15, 17));
        assertArrayEquals(new String[]{"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"}, FizzBuzz.fizzBuzz(30, 36));
        assertArrayEquals(new String[]{"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"}, FizzBuzz.fizzBuzz(1000, 1006));
        assertArrayEquals(new String[]{"Fizz", "Buzz", "101"}, FizzBuzz.fizzBuzz(99, 102));
        assertArrayEquals(new String[]{"14", "FizzBuzz", "16", "17", "Fizz", "19"}, FizzBuzz.fizzBuzz(14, 20));
    }
}
