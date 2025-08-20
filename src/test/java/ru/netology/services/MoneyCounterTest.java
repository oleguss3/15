package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyCounterTest {

    @Test
    void shouldReturn3RestMonthsForCase1() {
        MoneyCounter service = new MoneyCounter();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;

        assertEquals(expected, actual);

    }

    @Test
    void shouldReturn2RestMonthsForCase2() {
        MoneyCounter service = new MoneyCounter();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    void shouldReturn2RestMonthsForCase3() {
        MoneyCounter service = new MoneyCounter();
        int income = 70_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 0;

        assertEquals(expected, actual);

    }


    @Test
    void shouldReturn3RestMonthsForCase4() {
        MoneyCounter service = new MoneyCounter();
        int income = 10_000;
        int expenses = 1_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;

        assertEquals(expected, actual);
    }
}