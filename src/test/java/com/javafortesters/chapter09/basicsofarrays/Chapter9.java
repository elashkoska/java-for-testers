package com.javafortesters.chapter09.basicsofarrays;

import com.javaffortesters.domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Chapter9 {
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
    }

    @Test
    public void secondUsers() {
        User[] users = new User[100];
        for (int i = 0; i < 100; i++) {
            users[i] = new User("user" + i, "password" + i);
        }
        for (User auser : users) {
            System.out.println(auser.getUsername() + ',' + auser.getPassword());
        }
    }

    @Test
    public void exxampleDays() {
        String[] weekdays = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Samstag", "Sonntag"};
        String[] workdays;
        workdays = Arrays.copyOf(weekdays, 7);
        // assertEquals(null,weekdays[5]);
        //assertEquals(null,weekdays[6]);
        //weekdays[5]="Saturday";
        //weekdays[6]="Sunday";
        /*String[] workdays;
        workdays=Arrays.copyOf(weekdays,3);
        assertEquals(3,workdays.length);
        assertEquals("Montag",workdays[0]);
        assertEquals("Dienstag",workdays[1]);
        assertEquals("Mittwoch",workdays[2]); */
        /*String[] workdays=Arrays.copyOfRange(weekdays,2,5);
        assertEquals(3,workdays.length);
        assertEquals("Mittwoch",workdays[0]);
        assertEquals("Donnerstag",workdays[1]);
        assertEquals("Freitag",workdays[2]);
        assertEquals(workdays[0],weekdays[2]);
        assertEquals(workdays[1],weekdays[3]);
        assertEquals(workdays[2],weekdays[4]);
        String [] workdays=Arrays.copyOfRange(weekdays,2,7);
        assertEquals(5,workdays.length);
        assertEquals("Mitwwoch",workdays[0]);
        assertEquals("Donnerstag",workdays[1]);
        assertEquals("Freitag",workdays[2]);
        assertEquals(null,workdays[3]);
        assertEquals(null,workdays[4]);*/
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
                //System.out.println(i + "," +j);
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


// ragged2d[0]=new int[1];
//ragged2d[1]=new int[2];
//ragged2d[2]=new int[3];







