package com.javafortesters.chapter12.IntroducingInheritanceexamples;

import com.javaffortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmptyUser extends User {
    @Test
    public void empryUserExampleTest() {
        EmptyUser user = new EmptyUser();
        assertEquals("username", user.getUsername());
        assertEquals("password", user.getPassword());
    }

    @Test
    public void aUserHasNormalPermissions() {
        User auser = new User();
        assertEquals("Normal", auser.getPermission());
    }

    public class AdminUser extends User {

        public AdminUser() {
            this("adminuser", "password");
        }

        public AdminUser(String username, String password) {
            super(username, password);
        }

        @Override
        public String getPermission() {
            return "Elevated";
        }

        @Test
        public void anAminUserDefaultConstructor() {
            AdminUser adminUser = new AdminUser();
            assertEquals("adminuser", adminUser.getUsername());
            assertEquals("password", adminUser.getPassword());
            assertEquals("Elevated", adminUser.getPermission());
        }

        @Test
        public void anAdminUserHasElevatedPermission() {
            AdminUser adminUser = new AdminUser("admin", "password");
            assertEquals("admin", adminUser.getUsername());
            assertEquals("password", getPassword());
            assertEquals("Elevated", adminUser.getPermission());
        }
    }


    public class ReadOnlyUser extends User {


        @Override
        public String getPermission() {
            return "readOnly";
        }
    }

    @Test
    public void readOnlyUser() {
        ReadOnlyUser readOnlyUser = new ReadOnlyUser();
        assertEquals("Readnly", readOnlyUser.getPermission());
        assertEquals("username", readOnlyUser.getUsername());
        assertEquals("password", readOnlyUser.getPassword());
    }


    public class Guest extends User {
        @Override
        public String getPermission() {
            return "Guest";
        }

    }

    @Test
    public void guestExample() {
        Guest guest = new Guest();
        assertEquals("username", guest.getUsername());
        assertEquals("password", guest.getPassword());
        assertEquals("Guest", guest.getPermission());
    }
}



