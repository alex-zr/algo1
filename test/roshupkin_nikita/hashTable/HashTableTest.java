package roshupkin_nikita.hashTable;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class HashTableTest {
    private HashTable hashTable;

    @Before
    public void setUp() throws Exception {
        this.hashTable = new HashTable();
    }

    @Test
    public void testPutSuccess() {
        hashTable.put(1, new User("", ""));
        hashTable.put(17, new User("", ""));
        assertEquals(2, hashTable.size());
    }

    @Test
    public void testGetSuccess() {
        hashTable.put(1, new User("1", "2"));
        hashTable.put(17, new User("2", "3"));
        hashTable.put(2, new User("3", "3"));
        Map.Entry entry = hashTable.get(17);
        User user = (User) entry.getValue();
        System.out.println(user.toSring());
    }

    @Test
    public void testDeleteSuccess() {
        hashTable.put(1, new User("1", "2"));
        hashTable.put(17, new User("2", "3"));
        hashTable.put(2, new User("3", "3"));
        hashTable.delete(17);
        assertEquals(2, hashTable.size());
    }
}