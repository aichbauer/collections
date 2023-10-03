package example.com.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    static void illustrate() {
        System.out.println("\n\nArrayList");
        List<Integer> arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println("arrayList");
        System.out.println(arrayList);

        System.out.println("Contains");
        System.out.println("arrayList contains 1: " + arrayList.contains(1));
        System.out.println("arrayList contains -1: " + arrayList.contains(-1));

        System.out.println("Remove 2 (uses index)");
        arrayList.remove(2);
        System.out.println(arrayList);

        System.out.println("Iterator");
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("For each loop");
        for (Integer i : arrayList) {
            System.out.println(i);
        }

        System.out.println("For loop with get method");
        for (Integer i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        List<Integer> arrayList2 = new ArrayList() {
            {
                add(11);
                add(22);
            }
        };
        // add at the end
        arrayList2.add(33);
        // add at index 0
        arrayList2.add(0, 44);

        System.out.println("arrayList2");
        System.out.println(arrayList2);

        System.out.println("Update index 0");
        arrayList2.set(0, 55);
        System.out.println(arrayList2);


    }
}
