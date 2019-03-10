package com.javafortesters.chap006domainentities.examples;

import com.javaffortesters.domainentities.User;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void canConstructANewUser() {
        User user = new User();

    }

    @Test
    public void userHasDefaultUsernameAndPassword() {
        User user = new User();
        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("fedault password is expected", "password", user.getPassword());
    }

    @Test
    public void userHasName() {
        User auser = new User();
        auser.setUsername("Bob");
        assertEquals("not default username", "Bob", auser.getUsername());
    }

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User("admin", "pA55w0rD");
        assertEquals("given username expected", "admin", user.getUsername());
        assertEquals("given password expected", "pA55w0rD", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed() {
        User user = new User();
        user.setPassword("PaZZwor6");
        assertEquals("setter password expected", "PaZZwor6", user.getPassword());
    }

    @Test
    public void canConstructUsername() {
        User user = new User();
        user.setUsername("Elena");
        assertEquals("username is setted", "Elena", user.getUsername());
    }

    @Test
    public void examplesAllAssertions() {
        assertThat(3, is(3));
        assertTrue(3 > 2);
        assertFalse(3 == 2);
        assertArrayEquals(new int[]{2, 1, 3}, new int[]{2, 1, 3});
        assertNotNull(3);
        assertNotSame(2, 3);
        assertNull(null);
        assertSame(3, 3);
    }
}
