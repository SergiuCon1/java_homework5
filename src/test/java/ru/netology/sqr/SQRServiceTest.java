package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "Calculate with valid border, 300, 200, 3",
                    "Calculate when all numbers including in the borders, 9801, 100, 90",
                    "Calculate when the maximum limit is less than the allowed value by one digit max borders, 9800, 100, 89",
                    "Calculate when the minimum limit is greater than the allowable value by one digit, 9801, 101, 89",
                    "Calculate when the maximum and minimum values do not match the allowed value, 9800, 101, 88",
                    "Calculate when no one value is not included in the borders, 99, 0, 0"

            }
    )
    void calculateBorderOfSquares(String test, int maxBorder, int minBorder, long expected) {
        SQRService service = new SQRService();

        int actual = service.calculateCountOfSquares(minBorder, maxBorder);

        assertEquals(expected, actual);

    }
}