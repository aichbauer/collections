package example.com.sets;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSets {
    enum E1 {
        HELLO,
        WORLD,
        WORLD2,
    }

    enum E2 {
        BYE,
    }

    static void illustrate() {
        System.out.println("\n\nNo Order: EnumSet");
        Set<E1> set = EnumSet.of(E1.HELLO, E1.WORLD, E1.WORLD2);
        System.out.println("set");
        System.out.println(set);

        System.out.println("Contains");
        System.out.println("set contains \"HELLO\": " + set.contains(E1.HELLO));
        System.out.println("set contains \"BYE\": " + set.contains(E2.BYE));

        System.out.println("Remove World2");
        set.remove(E1.WORLD2);
        System.out.println(set);

        System.out.println("Iterator");
        Iterator<E1> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
