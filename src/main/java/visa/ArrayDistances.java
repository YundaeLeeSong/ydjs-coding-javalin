package visa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given a 0-indexed integer array nums. There exists an array arr of
 * length nums.length, where arr[i] is the sum of |i - j| over all j such that
 * nums[j] == nums[i] and j != i. If there is no such j, set arr[i] to be 0.
 * 
 * Return the array arr.
 * 
 * Example 1:
 * Input: nums = [1,3,1,1,2]
 * Output: [5,0,3,4,0]
 * Explanation: 
 * When i = 0, nums[0] == nums[2] and nums[0] == nums[3]. Therefore, arr[0] =
 * |0 - 2| + |0 - 3| = 5. 
 * When i = 1, arr[1] = 0 because there is no other index with value 3.
 * When i = 2, nums[2] == nums[0] and nums[2] == nums[3]. Therefore, arr[2] =
 * |2 - 0| + |2 - 3| = 3. 
 * When i = 3, nums[3] == nums[0] and nums[3] == nums[2]. Therefore, arr[3] =
 * |3 - 0| + |3 - 2| = 4. 
 * When i = 4, arr[4] = 0 because there is no other index with value 2. 
 * 
 * Example 2:
 * Input: nums = [0,5,3]
 * Output: [0,0,0]
 * Explanation: Since each element in nums is distinct, arr[i] = 0 for all i.
 * 
 * Constraints:
 * - 1 <= nums.length <= 105
 * - 0 <= nums[i] <= 109
 */
public class ArrayDistances {
    // Overall Runtime: O(n) Time, O(n) Space
    public long[] distance(int[] nums) {
        // Edge case: Return empty array for null or empty input
        if (nums == null || nums.length == 0) {
            return new long[0];
        }

        int n = nums.length;
        long[] distances = new long[n];

        // O(n) Time, O(n) Space: Group indices by their values
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], key -> new ArrayList<>()).add(i);
        }

        // O(n) Time overall: Process each group of identical numbers
        for (List<Integer> indices : map.values()) {
            int size = indices.size();
            if (size == 1) continue;

            long[] prefix = new long[size];
            long[] suffix = new long[size];
            
            prefix[0] = indices.get(0);
            suffix[size - 1] = indices.get(size - 1);
            
            // O(size) Time: Calculate prefix and suffix sums for the group
            for (int i = 1; i < size; i++) {
                prefix[i] = prefix[i - 1] + indices.get(i);
                suffix[size - 1 - i] = suffix[size - i] + indices.get(size - 1 - i);
            }

            // O(size) Time: Calculate the total distance using the sums
            for (int i = 0; i < size; i++) {
                long pos = indices.get(i);
                long dist = (suffix[i] - prefix[i]) + (long)(2 * i + 1 - size) * pos;
                distances[(int) pos] = dist;
            }
        }

        return distances;
    }
}
