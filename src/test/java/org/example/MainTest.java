package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void factorialOfZeroReturnsOne() {
        assertEquals(1, Main.factorial(0));
    }

    @Test
    void factorialOfFiveReturns120() {
        assertEquals(120, Main.factorial(5));
    }

    @Test
    void factorialOfOneReturnsOne() {
        assertEquals(1, Main.factorial(1));
    }

    @Test
    void factorialOfNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Main.factorial(-1));
    }
}
