package com.hans.android.httploginterceptorexam.data.city

import android.util.Log
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class CityRemote {

    fun getCity() {
        val client = OkHttpClient().newBuilder()
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://goldfing.github.io")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

        val api:Api = retrofit.create(Api::class.java)

        var entity: CityEntity? = null
        api.getCity().enqueue(object: Callback<CityEntity> {
            override fun onFailure(call: Call<CityEntity>, t: Throwable) {

            }

            override fun onResponse(call: Call<CityEntity>, response: Response<CityEntity>) {
                entity = response.body()
                Log.d("CityRemote", "body: " + entity.toString())
            }
        })
    }

    interface Api {
        @GET(value = "/api/city.json")
        fun getCity():Call<CityEntity>
    }
}