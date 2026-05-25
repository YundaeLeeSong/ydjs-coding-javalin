package practice.java.h;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Stacks Challenge
 * 
 * Stacks are LIFO - last in, first out, like a stack of plates or books, or
 * the puzzle game "Towers of Hanoi". They are used in algorithms where it is
 * needed to keep track of the ordering in which the elements were inserted.
 */
public class Stacks {
    /**
     * Implement and return some class that implements Deque, such as ArrayDeque,
     * which contains all the functionality of a Stack.
     *
     * @return a newly instantiated Deque. Deques implement both stack and queue
     *         behavior.
     */
    public Deque<String> createNewStack() {
        return new ArrayDeque<>();
    }

    /**
     * @param stack A Deque of Strings.
     * @return the number of elements in the deque.
     */
    public int getSize(Deque<String> stack) {
        return stack.size();
    }

    /**
     * Push a value to the top of the deque.
     * @param stack A Deque of Strings.
     * @param item a String to be added to the deque.
     */
    public void addToTopOfStack(Deque<String> stack, String item) {
        stack.add(item);
    }

    /**
     * Pop the value from the top of the deque and return that value.
     * @param stack A Deque of Strings.
     * @return the value popped from the top of the deque.
     */
    public String removeFromTopOfStack(Deque<String> stack) {
        return stack.removeLast();
    }
    
    /**
     * Peek the value at the top of a deque.
     * This returns the most recently-pushed value, without removing it.
     *
     * @param stack A Deque of Strings.
     * @return the value peeked from the top of the deque.
     */
    public String getTopOfStackWithoutRemoving(Deque<String> stack) {
        return stack.peekLast();
    }
}
