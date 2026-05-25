package practice.j;

/**
 * Notice that we are IMPLEMENTING the comparable interface, for type of
 * ObjectToBeCompared. This means that we must implement a method compareTo,
 * otherwise the code will not compile.
 */
public class SampleClassC implements Comparable<SampleClassC> {
    int val;
    
    /**
     * CompareTo should return a negative value if this object's 'val' is less
     * than another object's 'val', and positive otherwise. If 'val' is equal
     * for both objects, return 0.
     *
     * @param other another object of type SampleClassC, which we are comparing
     *              to 'this' object.
     */
    @Override
    public int compareTo(SampleClassC other) {
        return (this.val - other.val);
    }
}
