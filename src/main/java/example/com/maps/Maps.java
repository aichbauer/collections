package example.com.maps;

public class Maps {
    public static void main(String[] args) {
        // key value store
        // to access you need to know the key
        // unordered
        HashMaps.illustrate();
        // ordered
        LinkedHashMaps.illustrate();
        // sorted by the natural order or a custom comparator
        TreeMaps.illustrate();
    }
}
