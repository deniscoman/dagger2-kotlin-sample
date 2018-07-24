package com.example.denis.coffeemaker

interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}