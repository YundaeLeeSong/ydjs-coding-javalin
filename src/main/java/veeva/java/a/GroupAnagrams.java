package veeva.java.a;

import java.util.List;

/**
 * Question 2: Group Anagrams (Data Structures)
 * 
 * Given an array of strings, group the anagrams together. You can return the 
 * answer in any order.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a 
 * different word or phrase, typically using all the original letters exactly 
 * once.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        java.util.Map<String, List<String>> map = new java.util.HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            java.util.Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new java.util.ArrayList<>()).add(s);
        }
        return new java.util.ArrayList<>(map.values());
    }
}
