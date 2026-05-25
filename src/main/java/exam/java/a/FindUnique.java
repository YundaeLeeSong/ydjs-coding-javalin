package exam.java.a;

import java.util.HashMap;
import java.util.Map;

/**
 * Sarah is running a tournament where players pick numbers to determine their
 * opponent. There should be two matching numbers for each game to take place;
 * however, there is a player missing. She rounds up all the numbers and now
 * needs to find the missing player. Write a method that accepts an array of
 * integers and returns the value which is not repeated.
 * 
 * Please provide the implementation details for the 'findUnique()' method. This
 * method takes an Integer array argument. Each element of the array will either
 * appear twice or once. The method should return the value of the element that
 * is not repeated.
 * 
 * NOTE: The first value of the input is the size of the array and the following
 * values are the elements in the array!
 * 
 * Input                      Output
 * 5 [1, 1, 2, 2, 3]          3
 * 7 [9, 8, 7, 6, 7, 8, 9]    6
 */
public class FindUnique {
    public static int findUnique(int[] arr) {
        Map<Integer,Integer> occurs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            occurs.put(arr[i], occurs.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (occurs.get(arr[i]) == 1) return arr[i];
        }
        return -1;
    }
}
