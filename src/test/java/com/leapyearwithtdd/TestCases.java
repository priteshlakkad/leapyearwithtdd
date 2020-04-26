package com.leapyearwithtdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCases {

    LeapYearCheck calculate = new LeapYearCheck();

    @Test
    public void testcase_1_1() {
        assertEquals(calculate.isLeapYear(2000), true);
    }

    @Test
    public void testcase_2_1() {
        assertEquals(calculate.isLeapYear(1700), false);
    }

    @Test
    public void testcase_2_2() {
        assertEquals(calculate.isLeapYear(1800), false);
    }

    @Test
    public void testcase_2_3() {
        assertEquals(calculate.isLeapYear(1900), false);
    }

    @Test
    public void testcase_2_4() {
        assertEquals(calculate.isLeapYear(2100), false);
    }

    @Test
    public void testcase_3_1() {
        assertEquals(calculate.isLeapYear(2008), true);
    }

    @Test
    public void testcase_3_2() {
        assertEquals(calculate.isLeapYear(2012), true);
    }

    @Test
    public void testcase_3_3() {
        assertEquals(calculate.isLeapYear(2016), true);
    }

    @Test
    public void testcase_4_1() {
        assertEquals(calculate.isLeapYear(2017), false);
    }

    @Test
    public void testcase_4_2() {
        assertEquals(calculate.isLeapYear(2018), false);
    }

    @Test
    public void testcase_4_3() {
        assertEquals(calculate.isLeapYear(2019), false);
    }
}
