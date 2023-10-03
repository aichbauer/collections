package example.com.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
    static void illustrate() {
        System.out.println("\n\nMaintains Order: LinkedHashSet");

        Set set = new LinkedHashSet();
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

        Set set2 = new LinkedHashSet<String>();
        set2.add("Good");
        set2.add("Bye");
        set2.add("World");
        set2.add("!");
        System.out.println("set2");
        System.out.println(set2);

        Set union = new LinkedHashSet<String>(set);
        union.addAll(set2);
        System.out.println("Union of two sets");
        System.out.println(union);

        Set intersection = new LinkedHashSet<String>(set);
        intersection.retainAll(set2);
        System.out.println("Intersection of two sets");
        System.out.println(intersection);

        Set difference = new LinkedHashSet<String>(set);
        difference.removeAll(set2);
        System.out.println("Difference of two sets");
        System.out.println(difference);

        Set difference2 = new LinkedHashSet<String>(set2);
        difference.removeAll(set);
        System.out.println("Difference of two sets");
        System.out.println(difference2);
    }
}
