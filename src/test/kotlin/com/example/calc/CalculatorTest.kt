package com.example.calc

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator: Calculator = Calculator()

    @Test
    fun add_1_and_2() {
        val result = calculator.add(1, 2)
        assertEquals(3, result)
    }

    @Test
    fun add_1_and_negative_3() {
        val result = calculator.add(1, -3)
        assertEquals(-2, result)
    }

    @Test
    fun subtract_3_from_5() {
        val result = calculator.subtract(5, 3)
        assertEquals(2, result)
    }

    @Test
    fun subtract_2_from_negative_2() {
        val result = calculator.subtract(2, -2)
        assertEquals(4, result)
    }

    @Test
    fun multiply_3_and_6() {
        val result = calculator.multiply(3, 6)
        assertEquals(18, result)
    }

}