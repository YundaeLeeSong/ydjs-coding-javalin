package practice.e;

import java.util.List;
import java.util.Comparator;

/**
 * Largest Sum Challenge
 */
public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values
     * in the list. A number can't be added to itself, unless there are
     * duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums) {
        nums.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer arg0, Integer arg1) {
              return arg0 - arg1;
            }
        });
        int size = nums.size();
        return nums.get(size - 1) + nums.get(size - 2);
    }
}
