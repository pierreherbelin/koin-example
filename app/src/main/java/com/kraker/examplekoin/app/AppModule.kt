package com.kraker.examplekoin.app

import com.kraker.examplekoin.feature.ExampleRepository
import org.koin.core.module.Module
import org.koin.dsl.module

object AppModule {
    fun getModule(): Module = module {
        factory { ExampleRepository(get()) }
    }
}