package com.javafortesters.chap011exceptions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsExampleTest {
    @Test
    public void throwNullPointerException() {
        Integer age = 18;
        String ageAsString = age.toString();
        String yourAge = "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void examplesExceptions() {
        Integer age = null;
        String ageAsString;
        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        }
    }

    @Test
    public void anotherExample() {
        Integer age = null;
        String ageAsString;
        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
            //System.out.println("getMessage -" +e.getMessage());
            //System.out.println("getStacktrace -"+e.getStackTrace());
            //System.out.println("printStackTrace");
            // e.printStackTrace();
        }
        String yourAge = "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    /* ova ne mi chini??? public User(String username, String password)
     {
         this.username=username;
         setPassword(password);
     }
     public void setPassword(String password)
     {
         if(password.length()<7)
         {
             throw new IllegalArgumentException("Passsword must be >6 chars");
         }
         this.password=password;
     }*/
    @Test
    public void tryCatchFinallyNullPointException() {
        Integer age = null;
        String ageAsString;
        String ypurAge = "";
        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        } finally {
            ypurAge = "You are " + age.toString() + " years old";
        }
        assertEquals("You are 18 years old", ypurAge);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exampleTryCatchFinally() {
        Integer age = null;
        try {
            System.out.println("1.generate a null pointer exception");
            System.out.println(age.toString());
        } catch (NullPointerException e) {
            System.out.println("2.handle null pointer exception");
            throw new IllegalArgumentException("Null pointer became illegal", e);
        } finally {
            System.out.println("3.run code in finally selection");
        }
    }

    public class InvalidPassword extends Exception {
        public InvalidPassword(String message) {
            super(message);
        }

    }

    @Test
    public void checkException() throws InvalidPassword {
        String password = "abcdelena";
        if (password.length() < 6) {
            throw new InvalidPassword("Password must be >6 chars");
        }

    }

}


