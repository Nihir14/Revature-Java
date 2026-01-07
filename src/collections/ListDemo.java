package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Python");
        names.add("Java"); // allows duplicates

        System.out.println(names);
        System.out.println("Element at index 1: " + names.get(1));
        System.out.println("Size: " + names.size());
    }
}
