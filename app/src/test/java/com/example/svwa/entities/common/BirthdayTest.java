package com.example.svwa.entities.common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirthdayTest {

    @Test
    public void toStringForFirst() {
        Birthday day = new Birthday(Seasons.SUMMER, 1);

        assertEquals("1st of Summer", day.toString());
    }

    @Test
    public void toStringForSecond() {
        Birthday day = new Birthday(Seasons.SUMMER, 2);

        assertEquals("2nd of Summer", day.toString());
    }


    @Test
    public void toStringForThird() {
        Birthday day = new Birthday(Seasons.SUMMER, 3);

        assertEquals("3rd of Summer", day.toString());
    }


    @Test
    public void toStringForOthers() {
        Birthday day = new Birthday(Seasons.SUMMER, 4);

        assertEquals("4th of Summer", day.toString());
    }

}