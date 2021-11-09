package lists;

public class Lists {
    public static void main(String[] args) {
        // dynamic array
        // will use more memory space
        // but accessing a single item is fast
        ArrayLists.illustrate();
        Vectors.illustrate();
        // use less memory and does not need memory that is back to back.
        // but accessing a single item is not fast
        LinkedLists.illustrate();
    }
}
