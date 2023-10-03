package example.com.queues;

public class Queues {
    public static void main(String[] args) {
        // first in first out
        // not synchronized (use PriorityBlockingQue when used with threads)
        // removes items based on their natural order or a custom comparator
        PriorityQueues.illustrate();
        // likely to be faster than Stack when used as a stack
        // likely to be faster than LinkedList when used as a queue
        // deque means doubly ended -> can insert on both ends
        // not synchronized
        ArrayDeques.illustrate();
    }
}
