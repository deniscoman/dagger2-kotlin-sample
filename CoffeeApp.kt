package com.example.denis.coffeemaker

import dagger.Component
import javax.inject.Singleton

class CoffeeApp {
    @Singleton
    @Component(modules = [DripCoffeeModule::class])
    interface CoffeeShop {
        fun maker(): CoffeeMaker
    }

    fun main(args: Array<String>) {
        val coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build()
        coffeeShop.maker().brew()
    }
}