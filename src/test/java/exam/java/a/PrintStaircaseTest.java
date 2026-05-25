package exam.java.a;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class PrintStaircaseTest {
    @Test
    public void test1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        
        try {
            PrintStaircase.printStaircase(2);
            String expectedOutput  = "#\n##\n";
            String expectedOutput2 = "#\r\n##\r\n";
            String actualOutput = outContent.toString();
            assertTrue(actualOutput.equals(expectedOutput) || 
                       actualOutput.equals(expectedOutput2));
        } finally {
            System.setOut(originalOut);
        }
    }
}
