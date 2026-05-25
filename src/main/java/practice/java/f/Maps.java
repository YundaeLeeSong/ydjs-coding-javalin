package practice.java.f;

import java.util.HashMap;
import java.util.Map;

/**
 * Maps Challenge
 * 
 * Maps are key/value pairs. They are used in situations where we have some
 * value that we'd like to efficiently be able to access, but can be easily
 * identified by some other value.
 * For instance, a dictionary 'key' may be the word and the 'value' may be its
 * definition.
 * Or, if we'd like to keep track of how many times words were used in a book,
 * we could use a word as a 'key' and the amount of times the word appeared as
 * a 'value'.
 *
 * Keys may not be duplicates, but there may be duplicate values in a map.
 */
public class Maps {

    /**
     * Create and instantiate a collection that implements that Map interface.
     *
     * @return a new Map instantiated using Integer keys and String values.
     */
    public Map<Integer, String> createMap() {
        return new HashMap<>();
    }

    /**
     * Get the size of a map. (number of key/value pairs)
     * @param map a map to be manipulated.
     * @return the size of map.
     */
    public int getSize(Map<Integer,String> map) {
        return map.size();
    }

    /**
     * Insert a key/value pair into a map.
     * @param map a map to be manipulated.
     * @param key the key of the new pair.
     * @param value the value of the new pair.
     */
    public void addKeyValuePair(Map<Integer,String> map, int key, String value) {
        map.put(key, value);
    }

    /**
     * Get a value from a map given a key.
     * @param map a map to be manipulated.
     * @param key the key corresponding to the value we will be retrieving.
     * @return the value associated with key in map.
     */
    public String getValueFromKey(Map<Integer, String> map, int key) {
        return map.get(key);
    }

    /**
     * Remove a key/value pair from a map.
     * @param map a map to be manipulated.
     * @param key the key corresponding to the pair we will be deleting.
     */
    public void removeKeyValuePair(Map<Integer, String> map, int key) {
        map.remove(key);
    }

    /**
     * Update the value related to a certain key in a map.
     * @param map a map to be manipulated.
     * @param key the key corresponding to the pair we will be updating.
     * @param value the new value that should be associated with key.
     */
    public void overwriteValue(Map<Integer, String> map, int key, String value) {
        map.put(key, value);
    }
}
