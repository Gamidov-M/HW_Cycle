package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class DayOfFreelancerTest {

    @Test

    public void testCalculate1() {
        DayOfFreelancer service = new DayOfFreelancer();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void testCalculate2() {
        DayOfFreelancer service = new DayOfFreelancer();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/TextData.csv")
    public void parameterizedTestCalculate(int income, int expenses, int threshold, int expected) {
        DayOfFreelancer service = new DayOfFreelancer();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }


}