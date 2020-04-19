package com.hans.android.koinexam.di

import com.hans.android.koinexam.domain.usecase.SleepTimeUseCase
import org.koin.dsl.module

var myModule = module {
    single { SleepTimeUseCase() }
}