package practice.java.a;

/**
 * Array Basics Challenge
 * 
 * An array is a group of some predefined number of elements.
 * For instance, we could have an array of 10 ints or 10 Strings.
 *
 * Or, we could have an array of our own custom Objects, such as our own Bird
 * class for a birdwatching application. This would allow us to keep track of
 * many birds and their own behavior.
 *
 * For the following problems, all of the syntax we need is in this
 * documentation: https://www.learnjavaonline.org/en/Arrays
 */
public class ArrayBasics {
    
    /** 
     * This method should return the length of the incoming array
     *
     * @param arr the array we're getting data from.
     * @return the length of arr.
     */
    public int getLengthOfArray(int[] arr) {
        return arr.length;
    }

    /** 
     * This method should return the element in the array at position n
     *
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to return.
     *          Indexes in arrays start counting from zero.
     * @return the element at index n of arr.
     */
    public int getNthElementOfArray(int[] arr, int n) {
        return arr[n];
    }

    /**
     * This method should assign the incoming val to the nth position in the
     * array.
     *
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to modify.
     *          Indexes in arrays start counting from zero.
     * @param val the value that we will assign to a spot in the array.
     */
    public void setNthElementOfArray(int[] arr, int n, int val) {
        arr[n] = val;
    }

    /**
     * This method should create and return a new empty array of size n
     * @param n the size of the array we wish to create
     * @return a new int array that can contain n elements.
     */
    public int[] returnNewArraySizeN(int n) {
        return new int[n];
    }
}
