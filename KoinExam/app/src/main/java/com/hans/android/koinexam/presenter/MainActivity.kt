package com.hans.android.koinexam.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hans.android.koinexam.R
import com.hans.android.koinexam.domain.usecase.SleepTimeUseCase
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val sleepTimeUseCase:SleepTimeUseCase by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendSleepTime(view: View) {
        val sleepResult = sleepTimeUseCase.isNight(editCurrentHour.text.toString().toInt())
        if (sleepResult) {
            tvResult.setText("It's sleep time.")
        } else {
            tvResult.setText("It's play time.")
        }
    }
}
