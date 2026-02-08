package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTestJunit4 {
    @Test
    public void shouldReturnCorrectRemainingWhenAmountIsLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals("Остаток для суммы 900", expected, actual);
    }

    @Test
    public void shouldReturnZeroWhenAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals("Остаток для суммы 1000", expected, actual);
    }

}