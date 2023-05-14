package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HolidayServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Data.csv")

    public void shouldCalculateMoneyAndMonthsV1(int income, int expences, int threshold, int expected) {
        HolidayService service = new HolidayService();

        int actual = service.calculateMonthsAndMoney(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
