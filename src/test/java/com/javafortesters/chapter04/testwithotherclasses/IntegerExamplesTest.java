package com.javafortesters.chapter04.testwithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {
    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        int intValue = 4;
        assertEquals("intValue returns int 4", 4, four.intValue());
    }

    @Test
    public void stringExploration() {
        Integer five = new Integer("5");
        int intValue = 5;
        assertEquals("intValue returns int 5", 5, five.intValue());
    }

    @Test
    public void probaInteger() {
        Integer six = 6;
        assertEquals("autoboxing assigment for 6", 6, six.intValue());
    }

    @Test
    public void heksInteger() {
        assertEquals("hex 11 is b", "b", Integer.toHexString(11));
        assertEquals("hex 10 is a", "a", Integer.toHexString(10));
        assertEquals("hex 3 is 3", "3", Integer.toHexString(3));
        assertEquals("hex 21 is 15", "15", Integer.toHexString(21));
    }

    @Test
    public void testMinMax() {
        int min_value = -2147483648;
        int max_value = 2147483647;
        assertEquals("integermin is", Integer.MIN_VALUE, min_value);
        assertEquals("integermax is", Integer.MAX_VALUE, max_value);
    }
}

