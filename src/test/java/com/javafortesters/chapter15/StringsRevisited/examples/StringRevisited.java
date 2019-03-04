package com.javafortesters.chapter15.StringsRevisited.examples;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class StringRevisited {
    @Test
    public void experimentSomething() {
        String aString = "abcdef";
        assertThat("hello".length(), is(5));
        assertEquals("123456", "12" + "34" + "56");
        int i = 4;
        System.out.println("Print an int to the console " + i);
        System.out.println("Bob said \"hello\" to his cat");
        System.out.println("This is a single backslash \\");
        System.out.println("this is a \t new tab ");
        System.out.println("this is a new \n line");
        System.out.println("Another \b   backspace");
        System.out.println("a carriage \r return");
        String ps1 = "This is " + "String2";
        assertThat(ps1, is("This is String2"));
        String ps2 = "This is " + 4;
        assertThat(ps2, is("This is 4"));
        String intConcatConvert = "" + 1;
        assertThat(intConcatConvert, is("1"));
        String integerIntConvert = Integer.toString(2);
        assertThat(integerIntConvert, is("2"));
        String integerStringConvert = String.valueOf(3);
        assertThat(integerStringConvert, is("3"));
        assertThat(String.valueOf(3), is("3"));
        char[] cArray = {'2', '3'};
        assertThat("23".toCharArray(), is(cArray));

    }

    @Test
    public void canConvertBytes() throws UnsupportedEncodingException {
        byte[] b8Array = "Hello there".getBytes("UTF8");
        String empty = new String();
        assertThat(empty.length(), is(0));
        char[] newChar = {'a', 'b'};
        assertThat("ab".toCharArray(), is(newChar));
        byte[] bytesAr = "Elena".getBytes();
        String hello = "Hello";
        assertThat(hello.compareTo("Hello"), is(0));
        assertThat(hello.compareTo("hello") < 0, is(true));
        assertThat(hello.compareTo("Helloo") < 0, is(true));
        assertThat(hello.compareTo("Hemlo") < 0, is(true));
        assertThat(hello.compareTo("H") > 0, is(true));
        assertThat(hello.compareTo("Hel") > 0, is(true));
        assertThat(hello.compareToIgnoreCase("hello"), is(0));
        assertThat(hello.contains("He"), is(true));
        assertThat(hello.contains("Hello"), is(true));
        assertThat(hello.contains("z"), is(false));
        assertThat(hello.contentEquals("Hello"), is(true));
        assertThat(hello.contentEquals("hello"), is(false));
        assertThat(hello.equalsIgnoreCase("hello"), is(true));

        String hello5 = "Helloo";
        assertThat(hello5.endsWith("Helloo"), is(true));
        assertThat(hello5.endsWith(""), is(true));
        assertThat(hello5.endsWith("loo"), is(true));
        assertThat(hello5.startsWith("Hello"), is(true));
        assertThat(hello5.startsWith("he"), is(false));
        assertThat(hello5.startsWith("lo"), is(false));

        String empty1 = "";
        assertEquals(empty1.isEmpty(), true);
        assertThat(empty1.length(), is(0));
    }

    @Test
    public void regionMatches() {
        String str = "Hello fella";
        assertTrue(str.regionMatches(true, 9, "young lady", 6, 2));
        String hello = "Hello fellas";
        assertThat(hello.indexOf("l"), is(2));
        assertThat(hello.indexOf("l", 3), is(3));
    }
}
