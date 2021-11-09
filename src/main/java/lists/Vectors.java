package lists;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vectors {
    static void illustrate() {
        System.out.println("\n\nArrayList");
        System.out.println("Same as ArrayList, but synchronized, and some legacy code that is not found in the list interface");
        List<Integer> vector = new Vector();
        vector.add(0);
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("vector");
        System.out.println(vector);

        System.out.println("Contains");
        System.out.println("vector contains 1: " + vector.contains(1));
        System.out.println("vector contains -1: " + vector.contains(-1));

        System.out.println("Remove 2 (uses index)");
        vector.remove(2);
        System.out.println(vector);

        System.out.println("Iterator");
        Iterator<Integer> iterator = vector.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("For each loop");
        for (Integer i : vector) {
            System.out.println(i);
        }

        System.out.println("For loop with get method");
        for (Integer i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        List<Integer> vector2 = new Vector() {
            {
                add(11);
                add(22);
            }
        };
        // add at the end
        vector2.add(33);
        // add at index 0
        vector2.add(0, 44);

        System.out.println("vector2");
        System.out.println(vector2);

        System.out.println("Update index 0");
        vector2.set(0, 55);
        System.out.println(vector2);
    }
}
