package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {
    CashBackHacker hacker = new CashBackHacker();
    @org.testng.annotations.Test
    public void shouldAmountIs1000() {
        int actual = hacker.remain(1000);
        int expected = 0;
        assertEquals (actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldAmountIs1() {
        int actual = hacker.remain(1);
        int expected = 999;
        assertEquals (actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldAmountIs0() {
        assertEquals (hacker.remain(0), 1000);
    }
    @org.testng.annotations.Test
    public void shouldAmountIs100() {
        assertEquals (hacker.remain(100), 900);
    }
    @org.testng.annotations.Test
    public void shouldAmountIs2700() {
        assertEquals (hacker.remain(2700), 300);
    }
    @org.testng.annotations.Test
    public void shouldAmountIsMinus300() {
        assertEquals (hacker.remain(-300), 1300);
    }
}