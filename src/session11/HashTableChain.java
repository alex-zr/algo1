package session11;

public class HashTableChain<K, V> {
    private Node<K, V>[] buckets;
    private static final int INIT_SIZE = 16;

    private int size;

    public HashTableChain() {
        buckets = new Node[INIT_SIZE];
    }

    public V get(K key) {
        int keyHash = key.hashCode();
        int bucketIdx = keyHash % buckets.length;

        Node<K, V> current = buckets[bucketIdx];

        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNext();
        }

        return null;
    }

    public void put(K key, V user) {
        int keyHash = key.hashCode();
        int bucketIdx = keyHash % buckets.length;

        final Node<K, V> newNode = new Node<>(key, user, null);

        if (buckets[bucketIdx] == null) {
            buckets[bucketIdx] = newNode;
        } else {
            Node<K, V> current = buckets[bucketIdx];
            while (current.getNext() != null) {
                if (current.equals(newNode)) {
                    return;
                }
                current = current.getNext();
            }
            if (current.equals(newNode)) {
                return;
            }
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node<K, V> current : buckets) {
            if (current == null) {
                continue;
            }
            while (current != null) {
                sb.append("[")
                        .append(current.getKey())
                        .append(":")
                        .append(current.getValue())
                        .append("]");
                current = current.getNext();
            }
        }

        return sb.toString();
    }

    public int size() {
        return size;
    }
}
