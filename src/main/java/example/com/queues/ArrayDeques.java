package example.com.queues;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class ArrayDeques {
    static void illustrate() {
        System.out.println("\n\nArrayDeque");
        Queue<Integer> arrayDeque = new ArrayDeque();
        arrayDeque.add(2);
        arrayDeque.add(0);
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);

        System.out.println("arrayDeque");
        System.out.println(arrayDeque);

        System.out.println("Contains");
        System.out.println("arrayList contains 1: " + arrayDeque.contains(1));
        System.out.println("arrayList contains -1: " + arrayDeque.contains(-1));

        System.out.println("Remove 2 (uses element first occurance)");
        arrayDeque.remove(2);
        System.out.println(arrayDeque);

        System.out.println("Iterator");
        Iterator<Integer> iterator = arrayDeque.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("For each loop");
        for (Integer i : arrayDeque) {
            System.out.println(i);
        }

        Queue<Integer> arrayDeque2 = new ArrayDeque() {
            {
                add(11);
                add(22);
            }
        };
        // add at the end
        arrayDeque2.add(33);

        System.out.println("arrayDeque2");
        System.out.println(arrayDeque2);

        Integer peek = arrayDeque2.peek();
        System.out.println("peek the first element on top of the queue");
        System.out.println(peek);

        Integer firstOut = arrayDeque2.poll();
        System.out.println("poll: get and remove the first element (firstOut)");
        System.out.println(firstOut);

        System.out.println("arrayDeque2");
        System.out.println(arrayDeque2);

        Integer peek2 = arrayDeque2.peek();
        System.out.println("peek the first element on top of the queue again");
        System.out.println(peek2);

        ArrayDeque<Integer> arrayDeque3 = new ArrayDeque<>() {
            {
                add(1);
                add(0);
                add(3);
                add(2);
                add(6);
                add(5);
            }
        };

        System.out.println("arrayDeque3 addFirst");
        arrayDeque3.addFirst(7);
        System.out.println(arrayDeque3);


        System.out.println("arrayDeque3 addLast");
        arrayDeque3.addLast(8);
        System.out.println(arrayDeque3);

        System.out.println("arrayDeque3 removeLast");
        arrayDeque3.removeLast();
        System.out.println(arrayDeque3);
    }
}
