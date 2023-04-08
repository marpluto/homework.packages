package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class WorkScheduleServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/work_schedule.csv")
    public void testCalculateMonths(int expected, int income, int expenses, int threshold) {
        WorkScheduleService service = new WorkScheduleService();

        int actual = service.calculateMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
