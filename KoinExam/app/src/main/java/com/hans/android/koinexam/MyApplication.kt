package com.hans.android.koinexam

import android.app.Application
import com.hans.android.koinexam.di.myModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        // start Koin
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MyApplication)
            modules(myModule)
        }
    }
}