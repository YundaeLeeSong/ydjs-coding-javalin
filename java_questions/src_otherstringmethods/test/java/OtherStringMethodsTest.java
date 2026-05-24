
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class OtherStringMethodsTest {
    static OtherStringMethods osm;
    @BeforeClass
    public static void setUp(){
        osm = new OtherStringMethods();
    }

    /**
     * Tests the partOfString() method of the OtherStringMethods class.
     * 
     * This test verifies that, if partOfString() receives a value of "banana", with a starting index of 0 (inclusive) and an ending index of 3 (exclusive), it returns "ban".
     */
    @Test
    public void partOfStringTest1(){
        Assert.assertEquals(osm.partOfString("banana", 0, 3), "ban");
    }
    
    /**
     * Tests the partOfString() method of the OtherStringMethods class.
     * 
     * This test verifies that, if partOfString() receives a value of "apple", with a starting index of 1 (inclusive) and an ending index of 5 (exclusive), it returns "pple".
     */
    @Test
    public void partOfStringTest2(){
        Assert.assertEquals(osm.partOfString("apple", 1, 5), "pple");
    }

    /**
     * Tests the compareLexigraphically() method of the OtherStringMethods class.
     * 
     * This test verifies that, if compareLexigraphically() compares "banana" to "apple", it should return a value greater than 0 because "banana" should come after "apple".
     */
    @Test
    public void compareToTest1(){
        Assert.assertTrue(osm.compareLexigraphically("banana", "apple") > 0);
    }

    /**
     * Tests the compareLexigraphically() method of the OtherStringMethods class.
     * 
     * This test verifies that, if compareLexigraphically() compares "monkey" to "penguin", it should return a value less than 0 because "monkey" should come before "penguin".
     */
    @Test
    public void compareToTest2(){
        Assert.assertTrue(osm.compareLexigraphically("monkey", "penguin") < 0);
    }

    /**
     * Tests the compareLexigraphically() method of the OtherStringMethods class.
     * 
     * This test verifies that, if compareLexigraphically() compares "java" to "java", it should return a value of 0 because both strings are equivalent.
     */
    @Test
    public void compareToTest3(){
        Assert.assertTrue(osm.compareLexigraphically("java", "java") == 0);
    }

    /**
     * Tests the splitStringIntoMultipleStrings() method of the OtherStringMethods class.
     * 
     * This test verifies that, if splitStringIntoMultipleStrings() splits the string "banana apple pear" around " " (a single space), it should return the array {"banana", "apple", "pear"}.
     */
    @Test
    public void splitStringTest1(){
        String input = "banana apple pear";
        String splitAround = " ";
        String[] expected = {"banana", "apple", "pear"};
        Assert.assertArrayEquals(osm.splitStringIntoMultipleStrings(input, splitAround), expected);
    }

    /**
     * Tests the splitStringIntoMultipleStrings() method of the OtherStringMethods class.
     * 
     * This test verifies that, if splitStringIntoMultipleStrings() splits the string "src.main.java" around "." (a single period), it should return the array {"src", "main", "java"}.
     */
    @Test
    public void splitStringTest2(){
        String input = "src.main.java";

        // The two backwards slashes prevent the period from being interpreted as a regex expression.
        String splitAround = "\\.";
        
        String[] expected = {"src", "main", "java"};
        Assert.assertArrayEquals(osm.splitStringIntoMultipleStrings(input, splitAround), expected);
    }
}
