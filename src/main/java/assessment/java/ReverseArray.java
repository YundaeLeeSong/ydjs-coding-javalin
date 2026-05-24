package assessment.java;

/**
 * You are working on an array manipulation application and need to reverse the
 * order of elements in an array of integers. Your task is to write a method
 * that takes an array of integers as input and returns a new array with the
 * elements in reverse order.
 * 
 * Your method should traverse the original array, starting from the last
 * element, and construct a new array with the elements in reverse order.
 * 
 * NOTE: The first value of the input is the size of the array and the following
 * values are the elements in the array!
 * 
 * Input                       Output
 * 5 [1, 2, 3, 4, 5]           [5, 4, 3, 2, 1]
 * 5 [10, 20, 30, 40, 50]      [50, 40, 30, 20, 10]
 */
public class ReverseArray {
    public static int[] reverseArray(int[] array) {
        int[] output = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            output[j++] = array[i];
        }
        return output;
    }
}
