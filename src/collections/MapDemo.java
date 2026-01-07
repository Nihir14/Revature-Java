package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(1, "C++"); // key overwritten

        System.out.println(map);
        System.out.println("Value for key 2: " + map.get(2));
    }
}
