package tech.abd3lraouf.myapplication

import java.lang.IllegalStateException

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun mul(a: Int, b: Int): Int {
        return a * b
    }

    fun div(a: Int, b: Int): Int {
        if (b == 0) throw IllegalStateException()
        return a / b
    }
}
