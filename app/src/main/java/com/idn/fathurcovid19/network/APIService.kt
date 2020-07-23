package com.idn.fathurcovid19.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService{
    @GET("summary")
    fun getAllCountries(): Call<AllCountries>
}

interface InfoService{
    @GET
    fun getInfoService(@Url url: String?): Call<List<InfoCountry>>
}
