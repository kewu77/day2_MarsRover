package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_true_when_isInRange_given_a_number_5() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 5;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertTrue(isInRange);
    }

    // TODO: add more tests for isInRange

    @Test
    void should_return_false_when_isInRange_given_a_number_0() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 0;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_false_when_isInRange_given_a_number_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 1001;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_true_when_isStarterNotBiggerThanEnd_given_start_2_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;
        // When
        boolean isValid = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start,end);

        // Then
        assertTrue(isValid);
    }

    @Test
    void should_return_true_when_isStarterNotBiggerThanEnd_given_start_3_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 3;
        // When
        boolean isValid = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start,end);

        // Then
        assertTrue(isValid);
    }

    @Test
    void should_return_false_when_isStarterNotBiggerThanEnd_given_start_3_end_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 2;
        // When
        boolean isValid = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start,end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_true_when_isValid_given_start_2_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;
        // When
        boolean isValid = multiplicationTableBuilder.isValid(start,end);

        // Then
        assertTrue(isValid);
    }
}
