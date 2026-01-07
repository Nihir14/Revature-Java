package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");

        Iterator<String> itr = items.iterator();

        while (itr.hasNext()) {
            String value = itr.next();
            System.out.println(value);
        }
    }
}
