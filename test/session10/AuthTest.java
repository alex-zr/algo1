package session10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthTest {
    private Auth auth;

    @Before
    public void setUp() throws Exception {
        this.auth = new Auth();
    }

    @Test
    public void testIsAuthSuccess() {
        assertTrue(auth.isAuth("1", "2"));
        assertFalse(auth.isAuth("3452354", "57865"));
    }
}