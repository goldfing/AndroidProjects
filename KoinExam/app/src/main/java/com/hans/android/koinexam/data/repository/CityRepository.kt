package com.hans.android.koinexam.data.repository

open class CityRepository {
    private val cities = listOf<String>("Seoul", "Busan", "Incheon")

    fun getCities() : List<String> {
        return cities
    }

    fun getCity(name: String): String {
        return cities.get(cities.indexOf(name))
    }

    fun isExistsCity(name: String): Boolean {
        return cities.indexOf(name) < 0
    }
}