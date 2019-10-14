package com.javafortesters.chapter15.stringsRevisited;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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
        byte[] b8Array = "Hello there".getBytes(StandardCharsets.UTF_8);
        String empty = "";
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

    @Test
    public void replacingString() {
        String hello = "Hello fella fella fella";
        assertThat(hello.replace("fella", "world"), is("Hello world world world"));
        assertThat(hello.replaceFirst("fella", "world"), is("Hello world fella fella"));
        assertThat(hello.replaceAll("fella", "world"), is("Hello world world world"));
        assertThat("1,2,3".replaceFirst("[0-9]", "digit"), is("digit,2,3"));
        assertThat("1,2,3".replaceAll("[0-9]", "digit"), is("digit,digit,digit"));
        String text = "In the lower 3rd";
        assertThat(text.toUpperCase(), is("IN THE LOWER 3RD"));
        assertThat(text.toLowerCase(), is("in the lower 3rd"));
        String padded = "     trim me   ";
        assertThat(padded.length(), is(15));
        String trimmed = padded.trim();
        assertThat(trimmed.length(), is(7));
        assertThat(trimmed, is("trim me"));
        String digits = "0123456789";
        assertThat(digits.substring(5), is("56789"));
        assertThat(digits.substring(5, 6), is("5"));
        int value = 4;
        String output = "The value " + value + " was used";
        assertThat(output, is("The value 4 was used"));
        String template = "The value %d was used";
        String formatted = String.format(template, value);
        assertThat(formatted, is("The value 4 was used"));
        String example = "The number of years is %d";
        String formatted1 = String.format(example, value);
        assertThat(formatted1, is("The number of years is 4"));
        String use = "%s %s towards %d large %s";
        assertThat(String.format(use, "Bob", "took", 6, "cookies"), is("Bob took towards 6 large cookies"));
        String txt = "%2$s %4$s towards %3$d large %1$s";
        assertThat(String.format(txt, "Bob", "ran", 6, "onions"), is("ran onions towards 6 large Bob"));
        String txt2 = "%1$s %1$s towards %3$d large %1$s";
        assertThat(String.format(txt2, "Bob", "ran", 6, "onions"), is("Bob Bob towards 6 large Bob"));
        String csv = "1,2,3,4,5,6,7,8,9,10";
        String[] results = csv.split(",");
        assertThat(results.length, is(10));
        assertThat(results[0], is("1"));
        assertThat(results[9], is("10"));
        StringBuilder builder = new StringBuilder();
        builder.append("Hello there").replace(7, 11, "World").delete(5, 7);
        assertThat(builder.toString(), is("HelloWorld"));
        StringBuilder builder1 = new StringBuilder();
        assertThat(builder1.capacity(), is(16));
        StringBuilder sblen = new StringBuilder(512);
        assertThat(sblen.capacity(), is(512));
        assertThat(sblen.toString().length(), is(0));
        builder.ensureCapacity(600);
        builder.trimToSize();
        StringBuilder builder2 = new StringBuilder();
        builder2.append("> ");
        builder2.append(1);
        builder2.append("+");
        builder2.append(2);
        char[] ca = {' ', '=', '3'};
        builder2.append(ca);
        assertThat(builder2.toString(), is("> 1+2 =3"));
    }

    @Test
    public void stringBuilder() {
        StringBuilder builder = new StringBuilder(5);
        assertThat(builder.capacity(), is(5));
        builder.append("Hello World");
        assertThat(builder.capacity() > 5, is(true));
    }

    @Test
    public void stringBuilder1() {
        StringBuilder builder = new StringBuilder("123890");
        builder.insert(3, "4567");
        assertThat(builder.toString(), is("1234567890"));
    }

    @Test
    public void stringBuilder2() {
        StringBuilder builder = new StringBuilder();
        builder.insert(0, "a");
        assertThat(builder.toString(), is("a"));
        builder.insert(builder.toString().length(), "b");
        assertThat(builder.toString(), is("ab"));
        builder.insert(1, "c");
        assertThat(builder.toString(), is("acb"));
    }

    @Test
    public void stringBuilder3() {
        char[] ch = {'.', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder builder = new StringBuilder("abgh");
        builder.insert(2, ch, 3, 4);
        assertThat(builder.toString(), is("abcdefgh"));
        StringBuilder builder1 = new StringBuilder("abcdef");
        builder1.delete(1, 3);
        assertThat(builder1.toString(), is("adef"));
        StringBuilder builder2 = new StringBuilder("abcdefgh");
        builder2.replace(0, 4, "12345678");
        assertThat(builder2.toString(), is("12345678efgh"));
        StringBuilder builder3 = new StringBuilder("012345678");
        builder3.setCharAt(5, 'f');
        assertThat(builder3.toString(), is("01234f678"));
        StringBuilder builder4 = new StringBuilder("elena");
        assertThat(builder4.reverse().toString(), is("anele"));
        StringBuilder builder5 = new StringBuilder("0123456789");
        assertThat(builder5.substring(3, 7), is("3456"));
        assertThat(builder5.substring(3), is("3456789"));
    }
}
