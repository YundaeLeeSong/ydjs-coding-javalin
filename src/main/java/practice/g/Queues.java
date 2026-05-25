package practice.g;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Queues Challenge
 * 
 * Queues are FIFO - first in, first out, like a checkout line. They are used
 * in algorithms where it is needed to keep track of the order that the
 * elements were inserted in. For instance, tech support tickets may be waiting
 * in a queue until a tech support specialist can clear them.
 * 
 * ArrayDeque fills the role of *both* queues and stacks. You could think of a
 * Deque as a deck of cards (pronounced the same) where you could remove cards
 * from either the top or bottom. You can use ArrayDeque to perform queue
 * operations.
 */
public class Queues {
    /**
     * Instantiate and return some type of Deque, which is a class that contains
     * Queue and Stack functionality.
     * @return an instantiated Deque. Queue, by itself, doesn't have a class, so
     *         you should use a class that implements the Queue interface, such
     *         as ArrayDeque. Deques contain all the methods required for both
     *         Queue and Stack behavior.
     */
    public Deque<String> createQueue() {
        return new ArrayDeque<>();
    }

    /**
     * Return the size of a queue.
     * @param queue a Queue<String> object.
     * @return the length of queue.
     */
    public int getSize(Queue<String> queue) {
        return queue.size();
    }

    /**
     * Add an item to the end of the queue - the queue will be able to return to
     * that item once all the items in front of it have been removed.
     * @param queue a Queue<String> object.
     * @param item a String that should be added to Queue.
     */
    public void addToEndOfQueue(Queue<String> queue, String item) {
        queue.add(item);
    }

    /**
     * Remove an item from a queue, and return the removed item.
     * @param queue a Queue<String> object.
     * @return the next String due to be removed (polled) from the Queue<String>
     */
    public String removeFromStartOfQueue(Queue<String> queue) {
        return queue.remove();
    }

    /**
     * Return the next item from a queue which is due to be removed, but do not
     * remove it. This is referred to as a 'peek'.
     * @param queue a Queue<String> object.
     * @return the next String due to be removed (peeked) from the Queue<String>
     */
    public String getStartOfQueueWithoutRemoving(Queue<String> queue) {
        return queue.peek();
    }
}
