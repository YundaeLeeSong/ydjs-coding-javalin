package practice.java.j;

/**
 * Interfaces contain methods without bodies, and classes which implement the
 * interfaces must implement those methods. Notice how this interface has a
 * signature for a method, but it doesn't have a body. The method body will be
 * written by the implementing class.
 *
 * @param <T> the Object that the class that implements this interface will be
 *            compared to.
 */
public interface Comparable<T> {
    int compareTo(T data);
}
