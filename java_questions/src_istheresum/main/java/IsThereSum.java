import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){
        Arrays.sort(arr);
        // C(n, 2) = n(n-1) / 2
        // no better time complexity than O(n^2)?
        // brute force algo here...
        Set<Integer> values = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (!values.contains(arr[i] + arr[j])) values.add(arr[i] + arr[j]);
            }
        }

        return values.contains(target);
    }
}
