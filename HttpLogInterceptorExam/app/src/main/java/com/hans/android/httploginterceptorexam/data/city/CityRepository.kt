package com.hans.android.httploginterceptorexam.data.city

import com.hans.android.httploginterceptorexam.data.model.CityMapper

class CityRepository {
    private val remote = CityRemote()
    private val mapper = CityMapper()

    fun getCity() {
        remote.getCity()
    }
}