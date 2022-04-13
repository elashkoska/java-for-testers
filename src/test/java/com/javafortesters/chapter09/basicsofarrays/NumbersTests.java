package com.javafortesters.chapter09.basicsofarrays;

import com.javaffortesters.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class NumbersTests {
    @Test
    public void simpleArrayExample() {
        String[] numbers0123 = {"one", "two", "three", "zero"};
        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }
        assertEquals("one", numbers0123[0]);
        assertEquals("zero", numbers0123[3]);
    }

    /* int[] numbers=new int[10];
    int []moreInts=new int[10];
    int evenMore[]=new int[10];
    int [] number12=new int[10];
    String [] arraysofnames=new String[3];
    int int10={1,2,3};
    int zerolength={};
    int morelength
     */
    @Test
    public void createUsers() {
        User[] users = new User[3];
        users[0] = new User("Ana", "anana");
        users[1] = new User("Bojan", "javasenior");
        users[2] = new User("Filip", "barcelona");

        for (User us : users) {
            System.out.println(us.getUsername());
        }

        Assert.assertEquals("Ana", users[0].getUsername());
    }

    @Test
    public void secondUsers() {
        User[] users = new User[100];
        for (int i = 0; i < 100; i++) {
            users[i] = new User("user" + i, "password" + i);
        }
        for (User user : users) {
            System.out.println(user.getUsername() + ',' + user.getPassword());
        }
        Assert.assertEquals("Ana", users[0].getUsername());
    }

    @Test
    public void exxampleDays() {
        String[] weekdays = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Samstag", "Sonntag"};
        String[] workdays;
        workdays = Arrays.copyOf(weekdays, 7);
        Assert.assertEquals(6, weekdays.length);
    }

    @Test
    public void instantiateAraay() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);
        assertEquals("Friday", workdays[0]);
        assertEquals("Monday", workdays[1]);
        assertEquals("Thursday", workdays[2]);
        assertEquals("Tuesday", workdays[3]);
        assertEquals("Wednesday", workdays[4]);
    }

    @Test
    public void sortingArray() {
        String[] workdays = {"monday", "Tuesday", "Wednesday", "thursday", "Friday"};
        Arrays.sort(workdays);
        assertEquals("Friday", workdays[0]);
        assertEquals("Tuesday", workdays[1]);
        assertEquals("Wednesday", workdays[2]);
        assertEquals("monday", workdays[3]);
        assertEquals("thursday", workdays[4]);
    }

    @Test
    public void makeTriangle() {
        int[][] ragged2d = new int[16][];
        for (int i = 0; i < ragged2d.length; i++) {
            ragged2d[i] = new int[i + 1];

            for (int j = 0; j < i + 1; j++) {
                ragged2d[i][j] = j;
            }


        }

        print2D(ragged2d);

    }

    public void print2D(int[][] multi) {
        for (int[] outer : multi) {
            if (outer == null) {
                System.out.print("null");
            } else {
                for (int inner : outer) {
                    System.out.print(inner + ",");

                }
            }
            System.out.println();
        }
    }
}








