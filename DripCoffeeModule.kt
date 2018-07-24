package com.example.denis.coffeemaker

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [PumpModule::class])
internal class DripCoffeeModule {
    @Provides
    @Singleton
    fun provideHeater(): Heater {
        return ElectricHeater()
    }
}
