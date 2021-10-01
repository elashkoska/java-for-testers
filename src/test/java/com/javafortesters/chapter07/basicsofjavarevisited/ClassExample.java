package com.javafortesters.chapter07.basicsofjavarevisited;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassExample {
    // public static final String CONSTANT="a constant string";
    //public static String aClassField="a class field";
    //protected static String proField="a class field";
    //public String pubField="a public field";
    //private String privField="a private field";
    //private String name;
    //public ClassExample(String name)
   /* {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setName()
    {
        this.name=name;


    } */
    @Test
    public void increnebrDecrementOperators() {
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);

    }

    @Test
    public void booleanOperatorsExplored() {
        assertTrue(4 == 4);
        assertTrue(4 != 5);
        assertTrue(3 < 4);
        assertTrue(5 > 4);
        assertTrue(6 >= 6);
        assertTrue(7 >= 6);
        assertTrue(8 <= 8);
        assertTrue(8 <= 9);
        assertTrue(!false);
        boolean truthy = true;
        assertTrue(truthy);
    }

    @Test
    public void conditionalOperatorsExplorer() {
        assertTrue(true && true);
        assertTrue(true || false);
    }

    @Test
    public void ternaryOperator() {
        int x;
        x = 4 > 3 ? 2 : 1;
        assertEquals(2, x);
        assertTrue(5 >= 4);
    }

    //bitwise operations on Integer data types
    @Test
    public void iterraryExample() {
        int x;
        x = 5 > 4 ? 3 : 2;
        assertEquals(3, x);
        assertTrue(4 > 3);
    }
    //Chapter 8 examples

    @Test
    public void catOrCats() {
        int numberOfCats = 1;
        assertEquals("1==cat", "cats", (numberOfCats == 1) ? "cats" : "cat");
        numberOfCats = 0;
        assertEquals("0==cats", "cats", (numberOfCats == 1) ? "cat" : "cats");
        numberOfCats = 2;
        assertEquals("2==cats", "cats", (numberOfCats == 1) ? "cat" : "cats");
    }

    @Test
    public void catsMethod() {
        assertEquals("1==cats", "cats", catOrCats(1));
        assertEquals("0==cat", "cat", catOrCats(0));
        assertEquals("2==cat", "cat", catOrCats(2));
    }

    private String catOrCats(int numberOfCats) {
        return (numberOfCats == 1) ? "cats" : "cat";
    }

    @Test
    public void statementCheck() {
        boolean truthy = true;
        if (truthy)
            assertTrue(true);
    }

    @Test
    public void statementAnotherCheck() {
        boolean truthy = true;
        if (truthy)
            assertTrue(true);
        assertFalse(false);
    }

    @Test
    public void anotherTestIfElse() {
        boolean truthy = true;
        if (truthy)
            assertTrue(true);
        else {
            assertFalse(truthy);
        }
    }

    @Test
    public void anotherTest() {
        // boolean truthy=true;
        boolean truthy = false;
        if (truthy) {
            assertTrue(true);
            assertFalse(!truthy);
        } else {
            assertFalse(truthy);
        }
    }

    @Test
    public void anotherTestNested() {
        boolean truthy = true;
        boolean falsey = false;
        if (truthy) {


            if (!falsey) {

            }
            if (truthy && !falsey) {

            }
            if (falsey || truthy) {
                assertTrue(true);
                assertFalse(false);
            } else {
                assertTrue(true);
                assertFalse(true);
            }
        } else {
            if (!truthy) {
                if (falsey) {
                    assertFalse(true);
                    assertTrue(false);
                } else {
                    assertFalse(false);
                    assertTrue(false);
                }
            }
        }
    }

    @Test
    public void switchExample() {
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    public String likelyGenderIs(String title) {
        String likelyGender;
        switch (title.toLowerCase()) {
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }

    @Test
    public void countrySwitch() {
        assertEquals("United Kingdom", shortCode("UK"));
        assertEquals("United States", shortCode("US"));
        assertEquals("United States of America", shortCode("USA"));
        assertEquals("France", shortCode("FR"));
        assertEquals("Sweden", shortCode("SE"));
        assertEquals("Rest of the World", shortCode("CH"));

    }

    public String shortCode(String country) {
        String name;
        switch (country.toUpperCase()) {
            case "UK":
                name = "United Kingdom";
                break;
            case "US":
                name = "United States";
                break;
            case "USA":
                name = "United States of America";
                break;
            case "FR":
                name = "France";
                break;
            case "SE":
                name = "Sweden";
                break;
            default:
                name = "Rest of the World";
                break;
        }
        return name;
    }

    @Test
    public void switchCheck() {
        assertEquals("One", changeNumber(1));
        assertEquals("Two", changeNumber(2));
        assertEquals("Three", changeNumber(3));
        assertEquals("Four", changeNumber(4));
        assertEquals("Too big", changeNumber(5));
        assertEquals("Too big", changeNumber(Integer.MAX_VALUE));
        assertEquals("Too small", changeNumber(0));
        assertEquals("Too small", changeNumber(Integer.MIN_VALUE));

    }

    public String changeNumber(int number) {
        String number1 = "";
        switch (number) {
            case 1:
                number1 = "One";
                break;
            case 2:
                number1 = "Two";
                break;
            case 3:
                number1 = "Three";
                break;
            case 4:
                number1 = "Four";
                break;
            default:
                if (number < 1) {
                    number1 = "Too small";

                }
                if (number > 4) {
                    number1 = "Too big";
                }
                break;
        }
        return number1;
    }

    @Test
    public void checkVowel() {
        assertEquals("samoglaska A", samoglaska(1));
        assertEquals("samoglaska E", samoglaska(2));
        assertEquals("samoglaska I", samoglaska(3));
        assertEquals("samoglaska O", samoglaska(4));
        assertEquals("samoglaska U", samoglaska(5));
    }

    public String samoglaska(int vowel) {
        String bukva = "";
        switch (vowel) {
            case 1:
                bukva = "A";
                break;
            case 2:
                bukva = "E";
                break;
            case 3:
                bukva = "I";
                break;
            case 4:
                bukva = "O";
                break;
            case 5:
                bukva = "U";
                break;
            default:
                bukva = "soglaska";

        }
        return "samoglaska " + bukva;
    }

}
