package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals(4, answer);

    }

    @Test
    public void extractTwoNumbers() {
        int answer1 = 2 - 2;
        assertEquals(0, answer1);
    }

    @Test

    public void devideTwoNumbers() {
        int answer2 = 4 / 2;
        assertEquals(2, answer2);
    }

    @Test
    public void multipleTwoNumbers() {
        int answer = 2 * 2;
        assertEquals(4, answer);
    }
}
