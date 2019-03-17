package com.javafortesters.chapter21.Collections.Revisited.examples;

import org.junit.Test;

import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class CollectionRevisited {
    @Test
    public void sortedSetCanMantainSortOrder() {
        SortedSet<String> alphaset = new <String>TreeSet();
        alphaset.add("c");
        alphaset.add("d");
        alphaset.add("a");
        alphaset.add("b");
        alphaset.add("a");
        assertEquals(4, alphaset.size());
        String[] alphas = new String[alphaset.size()];
        alphaset.toArray(alphas);
        assertEquals("a", alphas[0]);
        assertEquals("b", alphas[1]);
        assertEquals("c", alphas[2]);
        assertEquals("d", alphas[3]);
    }

    @Test
    public void canRetrieveFirstFromSortedSet() {
        SortedSet<String> alphaset = new <String>TreeSet();
        alphaset.add("c");
        assertEquals("c", alphaset.first());
        alphaset.add("d");
        assertEquals("c", alphaset.first());
        alphaset.add("b");
        assertEquals("b", alphaset.first());
        alphaset.add("a");
        assertEquals("a", alphaset.first());
        System.out.println(alphaset);
    }

    @Test
    public void canRetrieveLastFromSortedSet() {
        SortedSet<String> alphaset = new <String>TreeSet();
        alphaset.add("c");
        assertEquals("c", alphaset.last());
        alphaset.add("b");
        assertEquals("c", alphaset.last());
        alphaset.add("d");
        assertEquals("d", alphaset.last());
        alphaset.add("a");
        assertEquals("d", alphaset.last());
        System.out.println(alphaset);
    }

    @Test
    public void sortedSetcanReturnHeadSet() {
        SortedSet<String> alphaset = new <String>TreeSet();
        alphaset.add("c");
        alphaset.add("d");
        alphaset.add("b");
        alphaset.add("a");
        SortedSet<String> subset = alphaset.headSet("c");
        assertEquals(2, subset.size());
        String[] alphas = new String[subset.size()];
        subset.toArray(alphas);
        assertEquals("a", alphas[0]);
        assertEquals("b", alphas[1]);
        for (String alpha : alphas) {
            System.out.println(alpha);
        }

    }

}
