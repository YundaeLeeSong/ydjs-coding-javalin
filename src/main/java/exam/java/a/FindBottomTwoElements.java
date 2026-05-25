package exam.java.a;

import java.util.Arrays;

/**
 * Your task is to write a function that takes an array of numbers as input and
 * returns the two smallest values present in the array.
 * 
 * Your function should traverse the array, unveil the two lowest elements, and
 * return them in ascending order.
 * 
 * NOTE: The first value of the input is the size of the array and the following
 * values are the elements in the array!
 * 
 * Input                  Output
 * 5 [9, 5, 12, 1, 8]     [1, 5]
 * 5 [15, 7, 3, 10, 6]    [3, 6]
 */
public class FindBottomTwoElements {
    public static int[] findBottomTwoElements(int[] arr) {
        if (arr == null || arr.length < 2) return arr;
        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);
        return new int[]{sortedArray[0], sortedArray[1]};
    }
}


