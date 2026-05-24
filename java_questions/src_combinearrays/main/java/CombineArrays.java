
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] mergedArr = new int[arr1.length + arr2.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < mergedArr.length; i++) {
            if (j != arr1.length) mergedArr[i] = arr1[j++];
            else mergedArr[i] = arr2[k++];
        }
        return mergedArr;
    }
}
