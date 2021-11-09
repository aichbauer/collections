package sets;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    static void illustrate() {
        System.out.println("\n\nMaintains Order: TreeSet");

        Set set = new TreeSet();
        set.add("Hello");
        set.add("World");
        set.add("World");
        set.add("World2");
        set.add("!");
        System.out.println("set");
        System.out.println(set);

        System.out.println("Contains");
        System.out.println("set contains \"Hello\": " + set.contains("Hello"));
        System.out.println("set contains \"Bye\": " + set.contains("Bye"));

        System.out.println("Remove World2");
        set.remove("World2");
        System.out.println(set);

        System.out.println("Iterator");
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set set2 = new TreeSet<String>();
        set2.add("Good");
        set2.add("Bye");
        set2.add("World");
        set2.add("!");
        System.out.println("set2");
        System.out.println(set2);

        Set union = new TreeSet<String>(set);
        union.addAll(set2);
        System.out.println("Union of two sets");
        System.out.println(union);

        Set intersection = new TreeSet<String>(set);
        intersection.retainAll(set2);
        System.out.println("Intersection of two sets");
        System.out.println(intersection);

        Set difference = new TreeSet<String>(set);
        difference.removeAll(set2);
        System.out.println("Difference of two sets");
        System.out.println(difference);

        Set difference2 = new TreeSet<String>(set2);
        difference.removeAll(set);
        System.out.println("Difference of two sets");
        System.out.println(difference2);
    }
}
