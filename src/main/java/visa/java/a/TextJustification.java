package visa.java.a;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of strings words and a width maxWidth, format the text such
 * that each line has exactly maxWidth characters and is fully (left and right)
 * justified.
 * 
 * You should pack your words in a greedy approach; that is, pack as many words
 * as you can in each line. Pad extra spaces ' ' when necessary so that each
 * line has exactly maxWidth characters.
 * 
 * Extra spaces between words should be distributed as evenly as possible. If
 * the number of spaces on a line does not divide evenly between words, the
 * empty slots on the left will be assigned more spaces than the slots on the
 * right.
 * 
 * For the last line of text, it should be left-justified, and no extra space
 * is inserted between words.
 * 
 * Note:
 * - A word is defined as a character sequence consisting of non-space
 *   characters only.
 * - Each word's length is guaranteed to be greater than 0 and not exceed
 *   maxWidth.
 * - The input array words contains at least one word.
 * 
 * Example 1:
 * Input: words = ["This", "is", "an", "example", "of", "text",
 *                 "justification."], maxWidth = 16
 * Output:
 * [
 *    "This    is    an",
 *    "example  of text",
 *    "justification.  "
 * ]
 * 
 * Example 2:
 * Input: words = ["What","must","be","acknowledgment","shall","be"],
 *        maxWidth = 16
 * Output:
 * [
 *   "What   must   be",
 *   "acknowledgment  ",
 *   "shall be        "
 * ]
 * Explanation: Note that the last line is "shall be    " instead of
 * "shall     be", because the last line must be left-justified instead of
 * fully-justified.
 * Note that the second line is also left-justified because it contains only
 * one word.
 * 
 * Example 3:
 * Input: words = ["Science","is","what","we","understand","well","enough",
 *                 "to","explain","to","a","computer.","Art","is","everything",
 *                 "else","we","do"], maxWidth = 20
 * Output:
 * [
 *   "Science  is  what we",
 *   "understand      well",
 *   "enough to explain to",
 *   "a  computer.  Art is",
 *   "everything  else  we",
 *   "do                  "
 * ]
 * 
 * Constraints:
 * - 1 <= words.length <= 300
 * - 1 <= words[i].length <= 20
 * - words[i] consists of only English letters and symbols.
 * - 1 <= maxWidth <= 100
 * - words[i].length <= maxWidth
 */
public class TextJustification {
    // Overall Runtime: O(n) Time, O(n) Space (where n is the total number of characters in words)
    public List<String> fullJustify(String[] words, int maxWidth) {
        // Edge case: Return empty list for null or empty input
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }

        List<String> lines = new ArrayList<>();
        int start = 0;
        int n = words.length;

        // O(n) Time: Process each word exactly once
        while (start < n) {
            int end = start + 1;
            int lineLen = words[start].length();
            
            // Greedily fit as many words as possible into the current line
            while (end < n && (lineLen + words[end].length() + (end - start) <= maxWidth)) {
                lineLen += words[end].length();
                end++;
            }

            int wordCount = end - start;
            int spaces = maxWidth - lineLen;

            StringBuilder sb = new StringBuilder();
            if (wordCount == 1 || end == n) {
                // Left justified for single-word lines or the last line
                for (int k = start; k < end; k++) {
                    sb.append(words[k]);
                    if (k < end - 1) {
                        sb.append(" ");
                    }
                }
                // Pad remaining space with spaces on the right
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else {
                // Fully justified for normal lines
                int gap = spaces / (wordCount - 1);
                int extra = spaces % (wordCount - 1);

                for (int k = start; k < end; k++) {
                    sb.append(words[k]);
                    if (k < end - 1) {
                        // Add base gap spaces
                        for (int s = 0; s < gap; s++) {
                            sb.append(" ");
                        }
                        // Distribute extra spaces to the leftmost gaps
                        if (extra > 0) {
                            sb.append(" ");
                            extra--;
                        }
                    }
                }
            }
            lines.add(sb.toString());
            start = end;
        }

        return lines;
    }
}


