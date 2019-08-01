package session11;

import org.junit.Before;
import org.junit.Test;
import session10.User;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

public class HashTableChainUserTest {

    private HashTableChain<User, String> hashTable;

    @Before
    public void setUp() throws Exception {
        this.hashTable = new HashTableChain<>();
    }

    @Test
    public void testPutSuccess() {
        final User user1 = new User("1", "2");
        final User user2 = new User("2", "1");
        assertNotEquals(user1.hashCode(), user2.hashCode());
        hashTable.put(user1, "1");
        hashTable.put(user2, "17");
        assertEquals(2, hashTable.size());
        System.out.println(hashTable.toString());
    }

}