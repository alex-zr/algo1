package roshupkin_nikita.hashTable;

import java.util.AbstractMap;
import java.util.Map;

public class HashTable<E> {
    private Map.Entry<E, E>[] busckets;
    private static final int INIT_SIZE = 16;
    private int size;

    public HashTable() {
        busckets = (Map.Entry<E, E>[]) new Map.Entry[INIT_SIZE];
    }

    public void put(E key, E user) {
        int keyHash = key.hashCode();
        int busketIdx = keyHash % busckets.length;
        final AbstractMap.SimpleEntry<E, E> integerUserSimpleEntry = new AbstractMap.SimpleEntry<>(key, user);
        for (int i = 0; i < busckets.length; i++) {
            if (busckets[busketIdx] == null) {
                break;
            }
            busketIdx++;
        }
        if (busckets[busketIdx] == null) {
            busckets[busketIdx] = integerUserSimpleEntry;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public Map.Entry get(E key) {
        int keyHash = key.hashCode();
        int busketIdx = keyHash % busckets.length;

        for (int i = 0; i < busckets.length; i++) {
            Map.Entry<E, E> searchEntry = busckets[busketIdx];
            if (searchEntry.getKey().equals(key)) {
                return searchEntry;
            } else {
                busketIdx++;
            }

        }
        return null;
    }

    public void delete(E key) {
        int keyHash = key.hashCode();
        int busketIdx = keyHash % busckets.length;
        for (int i = 0; i < busckets.length; i++) {
            Map.Entry<E, E> delEntry = busckets[busketIdx];
            if (delEntry.getKey().equals(key)) {
                busckets[busketIdx] = null;
                size--;
                break;
            }
            else {
                busketIdx++;
            }
        }
    }
}
