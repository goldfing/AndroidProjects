package com.hans.android.koinexam.domain.usecase

import java.lang.IllegalArgumentException

class SleepTimeUseCase {
    fun isNight(hour:Int): Boolean {
        if (hour > 24) throw IllegalArgumentException()

        if (hour >= 21 || hour <= 7) return true

        return false
    }
}