package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerTest {

    CashBackHacker hacker = new CashBackHacker();
    @org.junit.Test
    public void shouldAmountIs1000() { // Если пользователь купил ровно на 1000 рублей, то приложение не должно ему говорить, что нужно купить ещё на 1000.
        int actual = hacker.remain(1000);
        int expected = 0;
        assertEquals (actual, expected);
    }
    @org.junit.Test
    public void shouldAmountIs1() {
        int actual = hacker.remain(1);
        int expected = 999;
        assertEquals (actual, expected);
    }
    @org.junit.Test
    public void shouldAmountIs0() {
        assertEquals (hacker.remain(0), 1000);
    }
    @org.junit.Test
    public void shouldAmountIs100() {
        assertEquals (hacker.remain(100), 900);
    }
    @org.junit.Test
    public void shouldAmountIs2700() {
        assertEquals (hacker.remain(2700), 300);
    }
    @org.junit.Test
    public void shouldAmountIsMinus300() {
        assertEquals (hacker.remain(-300), 1300);
    }
}