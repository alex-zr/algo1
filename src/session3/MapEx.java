package session3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "1");
        map.put(0, "3");
        map.put(1, "2");
        map.put(2, "3");

        final String twoEl = map.get(2);
        final boolean isPresent = map.containsKey(1);
        map.remove(0);
        System.out.println(map);

        //final Set<Integer> key = map.keySet();
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        final Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }
    }
}
