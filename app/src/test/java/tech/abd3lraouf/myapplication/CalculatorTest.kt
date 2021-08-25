package tech.abd3lraouf.myapplication

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.lang.IllegalStateException

class CalculatorTest {

    /**
     * 1. failing unit test to test that something fails or not exist yet
     * 2. write the minimal code to make the test pass
     * 3. refactor written code
     */

    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }


    @Test
    fun `add returns the addition of two numbers`() {
        val sum: Int = calculator.add(1, 2)

        assertEquals(3, sum)
    }

    @Test
    fun `mul returns correct multiplication`() {
        val mul = calculator.mul(100, 10)

        assertEquals(1000, mul)
    }

    @Test
    fun `div returns correct division`() {
        val div = calculator.div(1000, 10)

        assertEquals(100, div)
    }

    @Test (expected = IllegalStateException::class)
    fun `division by zero`() {
        val div = calculator.div(1000, 0)
    }

    // TDD kata
}