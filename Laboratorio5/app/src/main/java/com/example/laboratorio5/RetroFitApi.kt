package com.example.laboratorio5

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RetroFitApi {
    @POST("users")
    fun postData(@Body dataModel: SensorInfo?): Call<SensorInfo?>?
}