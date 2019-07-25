package session11;

import org.junit.Before;
import org.junit.Test;
import session10.HashTable;
import session10.User;

import static org.junit.Assert.*;

public class HashTableChainTest {

    private HashTableChain<Integer, String> hashTable;

    @Before
    public void setUp() throws Exception {
        this.hashTable = new HashTableChain<>();
    }

    @Test
    public void testPutSuccess() {
        hashTable.put(1, "1");
        hashTable.put(17, "17");
        assertEquals(2, hashTable.size());
        System.out.println(hashTable.toString());
    }

    @Test
    public void testPutDublicates() {
        hashTable.put(1, "1");
        hashTable.put(1, "1");
        hashTable.put(17, "17");
        assertEquals(2, hashTable.size());
    }

    @Test
    public void testGetSuccess() {
        hashTable.put(1, "1");
        hashTable.put(17, "17");
        assertEquals("1", hashTable.get(1));
        assertEquals("17", hashTable.get(17));
        assertNull(hashTable.get(2));
    }
}