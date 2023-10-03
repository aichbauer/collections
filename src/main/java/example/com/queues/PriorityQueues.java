package example.com.queues;

import java.util.*;

public class PriorityQueues {
    static void illustrate() {
        System.out.println("\n\nPriorityQueue");
        Queue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(2);
        priorityQueue.add(0);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);

        System.out.println("priorityQueue");
        System.out.println(priorityQueue);

        System.out.println("Contains");
        System.out.println("arrayList contains 1: " + priorityQueue.contains(1));
        System.out.println("arrayList contains -1: " + priorityQueue.contains(-1));

        System.out.println("Remove 2 (uses element first occurance)");
        priorityQueue.remove(2);
        System.out.println(priorityQueue);

        System.out.println("Iterator");
        Iterator<Integer> iterator = priorityQueue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("For each loop");
        for (Integer i : priorityQueue) {
            System.out.println(i);
        }

        Queue<Integer> priorityQueue2 = new PriorityQueue() {
            {
                add(11);
                add(22);
            }
        };
        // add at the end
        priorityQueue2.add(33);

        System.out.println("priorityQueue2");
        System.out.println(priorityQueue2);

        Integer peek = priorityQueue2.peek();
        System.out.println("peek the first element on top of the queue");
        System.out.println(peek);

        Integer firstOut = priorityQueue2.poll();
        System.out.println("poll: get and remove the first element (firstOut)");
        System.out.println(firstOut);

        System.out.println("priorityQueue2");
        System.out.println(priorityQueue2);

        Integer peek2 = priorityQueue2.peek();
        System.out.println("peek the first element on top of the queue again");
        System.out.println(peek2);

        Queue<Integer> priorityQueue3 = new PriorityQueue() {
            {
                add(1);
                add(0);
                add(3);
                add(2);
                add(6);
                add(5);
            }
        };

        System.out.println("priorityQueue3 unordered");
        System.out.println(priorityQueue3);

        System.out.println("will be removed in priority");
        while(!priorityQueue3.isEmpty()) {
            System.out.println(priorityQueue3.remove());
        }
    }
}
