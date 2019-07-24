package session10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {
    private HashTable hashTable;

    @Before
    public void setUp() throws Exception {
        this.hashTable = new HashTable();
    }

    @Test
    public void put() {
        hashTable.put(1, new User("", ""));
        hashTable.put(17, new User("", ""));
        assertEquals(2, hashTable.size());
    }
}