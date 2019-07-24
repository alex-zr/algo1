package session10;

import java.util.AbstractMap;
import java.util.Map;

public class HashTable {
    private Map.Entry<Integer, User>[] buckets;
    private static final int INIT_SIZE = 16;

    private int size;

    public HashTable() {
        buckets = new Map.Entry[INIT_SIZE];
    }

    public void put(Integer key, User user) {
        int keyHash = key.hashCode();
        int bucketIdx = keyHash % buckets.length;

        final AbstractMap.SimpleEntry<Integer, User> integerUserSimpleEntry = new AbstractMap.SimpleEntry<>(key, user);

        for (int i = 0; i < buckets.length; i++) {
            if (buckets[bucketIdx] == null) {
                break;
            }
            bucketIdx++;
        }

        if (buckets[bucketIdx] == null) {
            buckets[bucketIdx] = integerUserSimpleEntry;
            size++;
        }
    }

    public int size() {
        return size;
    }
}
