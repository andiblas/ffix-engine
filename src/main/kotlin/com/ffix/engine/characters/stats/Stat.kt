package com.ffix.engine.characters.stats

open class Stat {
    private var value: Int = 0

    fun increase(quantity: Int) = value + quantity
    fun decrease(quantity: Int) {
        if (value < quantity) value = 0
        else value - quantity
    }
}
