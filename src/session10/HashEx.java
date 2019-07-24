package session10;

import java.util.HashMap;
import java.util.Map;

public class HashEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(1, "2");
        map.put(3, "3");
        System.out.println(map);

        final HashEx hashEx = new HashEx();
        System.out.println(hashEx.hashCode());
        System.out.println(hashEx.hashCode());
        System.out.println(hashEx.hashCode());
        System.out.println(hashEx.hash(new int[]{1,2,3}));

    }

    public int hash(int[] vector) {
        int sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }
        return sum;
    }
}
