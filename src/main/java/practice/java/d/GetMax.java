package practice.java.d;

/**
 * Get Max Challenge
 * 
 * This method should return the max value of arr (the largest int.)
 * This problem will require you to use a for loop. No other guidance will be
 * provided.
 */
public class GetMax {
    /**
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) if (max < arr[i]) max = arr[i];
        return max;
    }
}
