package practice.f;

import java.util.List;

/**
 * Max Minus Min Challenge
 */
public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums) {
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        for (Integer num: nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }
}
