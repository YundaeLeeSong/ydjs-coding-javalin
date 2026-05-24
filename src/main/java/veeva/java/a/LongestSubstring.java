package veeva.java.a;

/**
 * Question 3: Longest Substring Without Repeating Characters (Sliding Window)
 * 
 * Find the length of the longest substring in a given string that contains no 
 * repeating characters.
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        java.util.Set<Character> set = new java.util.HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
