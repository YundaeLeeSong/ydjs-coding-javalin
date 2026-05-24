package veeva.java.a;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GroupAnagramsTest {

    @Test
    public void testGroupAnagrams() {
        GroupAnagrams solution = new GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);
        
        assertNotNull(result);
        assertEquals(3, result.size());
    }
}
