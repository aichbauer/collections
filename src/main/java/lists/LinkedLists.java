package lists;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedLists {
    static void illustrate() {
        System.out.println("\n\nLinkedList");
        List<Integer> linkedList = new LinkedList();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("linkedList");
        System.out.println(linkedList);

        System.out.println("Contains");
        System.out.println("linkedList contains 1: " + linkedList.contains(1));
        System.out.println("linkedList contains -1: " + linkedList.contains(-1));

        System.out.println("Remove 2 (uses index)");
        linkedList.remove(2);
        System.out.println(linkedList);

        System.out.println("Iterator");
        Iterator<Integer> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("For each loop");
        for (Integer i : linkedList) {
            System.out.println(i);
        }

        System.out.println("For loop with get method");
        for (Integer i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        List<Integer> linkedList2 = new LinkedList() {
            {
                add(11);
                add(22);
            }
        };
        // add at the end
        linkedList2.add(33);
        // add at index 0
        linkedList2.add(0, 44);

        System.out.println("linkedList2");
        System.out.println(linkedList2);

        System.out.println("Update index 0");
        linkedList2.set(0, 55);
        System.out.println(linkedList2);
    }
}
