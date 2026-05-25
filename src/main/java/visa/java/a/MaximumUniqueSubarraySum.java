package visa.java.a;

import java.util.HashSet;
import java.util.Set;

/**
 * You are given an array of positive integers nums and want to erase a subarray
 * containing unique elements. The score you get by erasing the subarray is
 * equal to the sum of its elements.
 * 
 * Return the maximum score you can get by erasing exactly one subarray.
 * 
 * An array b is called to be a subarray of a if it forms a contiguous
 * subsequence of a, that is, if it is equal to a[l], a[l+1], ..., a[r] for
 * some (l, r).
 * 
 * Example 1:
 * Input: nums = [4,2,4,5,6]
 * Output: 17
 * Explanation: The optimal subarray here is [2,4,5,6].
 * 
 * Example 2:
 * Input: nums = [5,2,1,2,5,2,1,2,5]
 * Output: 8
 * Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
 * 
 * Constraints:
 * - 1 <= nums.length <= 105
 * - 1 <= nums[i] <= 104
 */
public class MaximumUniqueSubarraySum {
    // Overall Runtime: O(n) Time, O(n) Space
    public int maximumUniqueSubarray(int[] nums) {
        // Edge case: Return 0 for null or empty input
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> uniqueElements = new HashSet<>();
        int maxSum = 0;
        int currentSum = 0;
        int start = 0;

        // O(n) Time: Sliding window approach across the array
        for (int end = 0; end < nums.length; end++) {
            int currentElement = nums[end];
            
            // O(1) Amortized Time: Adjust window to maintain uniqueness
            while (uniqueElements.contains(currentElement)) {
                int elementToRemove = nums[start];
                uniqueElements.remove(elementToRemove);
                currentSum -= elementToRemove;
                start++;
            }
            
            uniqueElements.add(currentElement);
            currentSum += currentElement;
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}


