package com.javafortesters.chapter17.DatesAndTime.examples;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DateAndTime {
    @Test
    public void testDate() {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        long startTime2 = System.nanoTime();
        System.out.println(startTime2);
    }

    @Test
    public void currentTimeMillis() {
        long startTime = System.currentTimeMillis();
        for (int x = 0; x < 10; x++) {
            System.out.println("Current time" + System.currentTimeMillis());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time" + (endTime - startTime));
    }

    @Test
    public void createUserAllChars() {
        String initialUserID = "user" + System.currentTimeMillis();
        System.out.println(initialUserID);
        String userID = initialUserID;
        for (int x = 0; x < 10; x++) {
            String charReplacement = "" + ((char) ('A' + x));
            String inttoReplace = String.valueOf(x);
            userID = userID.replace(inttoReplace, charReplacement);
        }
        assertThat(userID.contains("0"), is(false));
        assertThat(userID.contains("1"), is(false));
        assertThat(userID.contains("2"), is(false));
        assertThat(userID.contains("3"), is(false));
        assertThat(userID.contains("4"), is(false));
        assertThat(userID.contains("5"), is(false));
        assertThat(userID.contains("6"), is(false));
        assertThat(userID.contains("7"), is(false));
        assertThat(userID.contains("8"), is(false));
        assertThat(userID.contains("9"), is(false));
        assertThat(initialUserID.length(), is(userID.length()));
        System.out.println(userID);
        Date date = new Date();
        System.out.println(date.toString());
        long oneWeekFromNowTime = date.getTime();
        oneWeekFromNowTime = oneWeekFromNowTime + (1000 * 60 * 60 * 24 * 7);
        Date oneWeekFromNow = new Date(oneWeekFromNowTime);
        System.out.println(oneWeekFromNow.toString());
        Date sameDate = new Date();
        sameDate.setTime(date.getTime());
        assertThat(date.equals(sameDate), is(true));
        assertThat(date.compareTo(sameDate), is(0));
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("MM/dd/yyyy");
        assertThat(sdf.format(date), is("03/10/2019"));
        SimpleDateFormat sdf1 = new SimpleDateFormat("y M d HH:mm:ss:SSS");
        System.out.println(sdf1);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.plusDays(5));
    }

    @Test
    public void calendarInstantiate() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.toString());
        Calendar sameDate = Calendar.getInstance();
        sameDate.setTime(cal.getTime());
        assertThat(cal.equals(sameDate), is(true));
        assertThat(cal.compareTo(sameDate), is(0));
        Calendar oneWeekfromNow = Calendar.getInstance();
        oneWeekfromNow.setTime(cal.getTime());
        oneWeekfromNow.add(Calendar.DATE, 7);
        assertThat(oneWeekfromNow.after(cal), is(true));
        assertThat(cal.before(oneWeekfromNow), is(true));
        assertThat(cal.compareTo(oneWeekfromNow), is(-1));
        assertThat(oneWeekfromNow.compareTo(cal), is(1));
        cal.set(Calendar.YEAR, 2019);
        cal.set(Calendar.MONTH, 03);
        cal.set(Calendar.DAY_OF_MONTH, 10);
        cal.set(Calendar.HOUR, 11);
        cal.set(Calendar.MINUTE, 33);
        cal.set(Calendar.MILLISECOND, 14);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(2019, 03, 10);
        cal.set(2019, Calendar.DECEMBER, 10);
        cal.set(2018, Calendar.DECEMBER, 15, 23, 39, 54);
        assertThat(cal.get(Calendar.MONTH), is(Calendar.DECEMBER));

    }

    @Test
    public void calendarCostants() {
        Calendar cal = Calendar.getInstance();
        cal.set(2013, Calendar.DECEMBER, 15, 23, 39, 54);
        assertThat(cal.get(Calendar.MONTH), is(Calendar.DECEMBER));
        assertThat(cal.get(Calendar.YEAR), is(2013));
        assertThat(cal.get(Calendar.DAY_OF_MONTH), is(15));
        assertThat(cal.get(Calendar.DAY_OF_WEEK), is(Calendar.SUNDAY));
        assertThat(cal.get(Calendar.WEEK_OF_MONTH), is(3));
        cal.add(Calendar.YEAR, -2);
        cal.add(Calendar.MONTH, -6);
        System.out.println(new SimpleDateFormat().format(cal.getTime()));
    }

    @Test
    public void rollCalendar() {
        Calendar cal = Calendar.getInstance();
        cal.set(2013, Calendar.DECEMBER, 15, 23, 39, 54);
        cal.roll(Calendar.DAY_OF_MONTH, 17);
        assertThat(cal.get(Calendar.YEAR), is(2013));
        assertThat(cal.get(Calendar.MONTH), is(Calendar.DECEMBER));
        assertThat(cal.get(Calendar.DAY_OF_MONTH), is(1));

    }

    @Test
    public void addCalendar() {
        Calendar cal = Calendar.getInstance();
        cal.set(2013, Calendar.DECEMBER, 23, 23, 39, 54);
        cal.add(Calendar.DAY_OF_MONTH, 17);
        assertThat(cal.get(Calendar.YEAR), is(2014));
        assertThat(cal.get(Calendar.MONTH), is(Calendar.JANUARY));
        assertThat(cal.get(Calendar.DAY_OF_MONTH), is(9));
    }

}