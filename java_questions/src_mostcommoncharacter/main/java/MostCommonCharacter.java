import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> frequency = new HashMap<>();
        char[] chs = str.toCharArray();
        char maxKey = 0;
        int maxCount = 0;
        for (int i = 0; i < chs.length; i++) {
            char currentChar = chs[i];
            if (!frequency.containsKey(currentChar)) frequency.put(currentChar, 0);
            frequency.put(currentChar, frequency.get(currentChar) + 1);
            if (frequency.get(currentChar) > maxCount) {
                maxCount = frequency.get(currentChar);
                maxKey = currentChar;
            }
        }
        return maxKey;
    }
}
