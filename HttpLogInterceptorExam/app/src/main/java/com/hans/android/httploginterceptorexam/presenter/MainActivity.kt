package com.hans.android.httploginterceptorexam.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hans.android.httploginterceptorexam.R
import com.hans.android.httploginterceptorexam.data.city.CityRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val repository = CityRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getCity(view: View) {
        repository.getCity()
    }
}
