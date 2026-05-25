package exam.java.a;

/**
 * Your co-worker is working on a program that requires all of the numbers in an
 * array to "cancel out". The numbers in an array will "cancel out" when the sum
 * of all the numbers in the first half of the array is equal to the numbers in
 * the second half of the array. Help your co-worker out by writing a method
 * that determines if a given array will "cancel out".
 * 
 * Provide an implementation for the "equalHalves()" method which sums the
 * values in the first half of a given array or integers and compares the sum to
 * the second half of the array. If the sum of both halves is equal, the method
 * should return true. If the values are not equal, the method should return
 * false. If an array has an odd number of elements, then the method should
 * always return false.
 * 
 * NOTE: The first value of the input is the size of the array and the following
 * values are the elements in the array.
 * 
 * Input         Output
 * 2 [1, 1]      true
 * 3 [2, 3, 2]   false
 */
public class EqualHalves {
    public static boolean equalHalves(Integer[] arr) {
        if (arr == null || arr.length % 2 != 0) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int target = sum / 2;
        int halfSum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            halfSum += arr[i];
        }
        return halfSum == target && (sum - halfSum == target);
    }
}
