package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    static void illustrate() {
        System.out.println("\n\nTreeMap");
        Map<String, String> map = new TreeMap();

        map.put("one", "whatever");
        map.put("two", "and so on");
        map.put("three", "ok");

        System.out.println("for each loop");
        for (Map.Entry<String, String> e: map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println("Get by key");
        String one = map.get("one");
        System.out.println("one: " + one);

        System.out.println("Contains key");
        boolean containsKey = map.containsKey("one");
        System.out.println("one: " + containsKey);

        System.out.println("Contains value");
        boolean containsValue = map.containsValue("whatever");
        System.out.println("whatever: " + containsValue);
    }
}
