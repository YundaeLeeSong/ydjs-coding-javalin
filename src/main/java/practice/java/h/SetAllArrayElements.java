package practice.java.h;

/**
 * Set All Array Elements Challenge
 */
public class SetAllArrayElements {
    /**
     * Your task: you will recieve an array and a number, and you will have to
     * set every element of the array to that number.
     *
     * You will need to access every element of the array and change them, one
     * by one. For this type of problem, it will be best to use a for loop.
     *
     * @param arr an array.
     * @param n number that you will switch all numbers of arr to.
     */
    public void set(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) arr[i] = n;
    }
}
