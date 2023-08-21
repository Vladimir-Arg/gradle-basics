package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {
    CashBackHacker hacker = new CashBackHacker();
    @Test
    public void shouldAmountIs1000() {
        int actual = hacker.remain(1000);
        int expected = 1000;
        assertEquals (actual, expected);
    }
    @Test
    public void shouldAmountIs1() {
        int actual = hacker.remain(1);
        int expected = 999;
        assertEquals (actual, expected);
    }
    @Test
    public void shouldAmountIs0() {
        assertEquals (hacker.remain(0), 1000);
    }
    @Test
    public void shouldAmountIs100() {
        assertEquals (hacker.remain(100), 900);
    }
    @Test
    public void shouldAmountIs2700() {
        assertEquals (hacker.remain(2700), 300);
    }
    @Test
    public void shouldAmountIsMinus300() {
        assertEquals (hacker.remain(-300), 1300);
    }
}