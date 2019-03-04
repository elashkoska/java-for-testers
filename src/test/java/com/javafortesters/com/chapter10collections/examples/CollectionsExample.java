package com.javafortesters.com.chapter10collections.examples;

import com.javaffortesters.domainentities.User;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CollectionsExample {
    @Test
    public void simpleDynamisCollection() {
        List<String> numbers0123 = new ArrayList<String>();
        numbers0123.add("zero");
        numbers0123.add("one");
        numbers0123.add("two");
        numbers0123.add("three");
        for (String numb : numbers0123) {
            System.out.println(numb);
        }
        assertEquals("zero", numbers0123.get(0));
        assertEquals("three", numbers0123.get(3));
    }

    /* String[] someDays={"Tuesday","Thursday","Wednesday","Monday","Saturday","Sunday","Friday"};
     List<String> days= Arrays.asList(someDays);
     int forCount=0;
     for (String day:days)
     {
         if ((day.equals("Monday")))
         {
             break;
         }
         forCount++;
     }
     assertEquals("Monday is at position 3",3,forCount);
 }
 int loopCount;
 for(loopCount=0;loopCound<=days.size();loopCount++){
     if(days.get(Loop)
         } */
    @Test
    public void exampleArray() {
        String[] daysofweek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        List<String> days = Arrays.asList(daysofweek);
        /*int count=0;
        while (count<days.size()){
            System.out.println(days.get(count));
            count++;*/
        for (int i = 0; i <
                days.size(); i++)
            System.out.println(days.get(i));
    }

    @Test
    public void testingCollection() {
        Collection<User> users = new ArrayList<>();
        assertEquals(0, users.size());
        assertEquals(true, users.isEmpty());
        User user1 = new User();
        User user2 = new User();
        ((ArrayList<User>) users).add(user1);
        ((ArrayList<User>) users).add(user2);
        assertEquals(2, users.size());
        assertEquals(false, users.isEmpty());
        Collection<User> users12 = new ArrayList<>();
        User user12 = new User();
        User user123 = new User();
        users12.add(user12);
        users12.add(user123);
        ((ArrayList<User>) users).addAll(users12);
        assertTrue(users.containsAll(users12));
        users.removeAll(users12);
        assertEquals(true, users12.contains(user12));
        assertEquals(true, users.contains(user1));
        assertEquals("only first collection", 2, users.size());
        users.clear();
        assertTrue(users.isEmpty());
    }

    @Test
    public void getAnElementAtAnIndex() {
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.remove(1);
        days.add(2, "Friday");
        assertEquals("Monday", days.get(0));
        // assertEquals("Tuesday",days.get(1));
        assertEquals("Wednesday", days.get(1));
    }

    @Test
    public void addingDays() {
        List<String> days = new ArrayList<>();
        List<String> missingDays = new ArrayList<>();
        days.add("Monday");
        days.add("Friday");
        missingDays.add("Tuesday");
        missingDays.add("Wednesday");
        missingDays.add("Thursday");
        days.addAll(1, missingDays);
        assertEquals(5, days.size());
        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));
        assertEquals("Thursday", days.get(3));
        assertEquals("Friday", days.get(4));
        assertEquals(3, days.indexOf("Thursday"));
    }

    @Test
    public void testSto() {
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Thursday");
        days.add("Thursday");
        days.add("Thursday");
        days.set(0, "Tuesday");
        assertEquals("Tuesday", days.get(0));
        assertEquals(4, days.lastIndexOf("Thursday"));
    }

    @Test
    public void testoTo() {
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        List<String> workdays = days.subList(0, 5);
        assertEquals(5, workdays.size());
    }

    @Test
    public void exerciseList() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        users.add(user1);
        users.add(0, user2);
        assertEquals(1, users.indexOf(user1));
        assertEquals(0, users.indexOf(user2));
        users.remove(user1);
        assertEquals(1, users.size());
        users.contains(user1);
        assertFalse(users.contains(user1));
    }

    @Test
    public void setDoesntAllowDuplicates() {
        Set workdays = new HashSet();
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        assertEquals(1, workdays.size());

    }

    @Test
    public void anotherExercise() {
        Set<User> users = new HashSet<>();
        User user = new User();
        users.add(user);
        users.add(user);
        assertEquals(1, users.size());
    }

    /* @Test
     public void mapExercise()
     {
         Map<String,String> map=new HashMap<>();
         map.put("key1","value1");
         map.put("key2","value2");
         map.put("key3","value3");
         assertEquals(3,map.size());
         map.put("key1","newvalue1");
         assertEquals("newvalue1",map.get("key1"));
         assertEquals("value2",map.get("key2"));
         assertEquals("value3",map.get("key3"));
         assertEquals(null,map.get("key4"));
         map.remove("key1");
         assertEquals(2,map.size());
         map.clear();
         assertEquals(0,map.size());
         assertTrue(map.isEmpty());
         assertTrue(map.containsKey("key1"));
         assertTrue(map.containsKey("key12"));
         assertTrue(map.containsValue("value2"));
         assertTrue(map.containsValue("value23"));

     } */
    @Test
    public void exerciseMap() {
        Map<String, User> user = new HashMap<>();
        User user1 = new User();
        User user2 = new User();
        user.put("key1", user1);
        user.put("key1", user2);
        assertEquals(1, user.size());

    }
}