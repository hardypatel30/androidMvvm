package com.example.hardy.data.datasource.network_data_source

import com.example.hardy.data.models.country_response.CountryResponse
import retrofit2.Call
import retrofit2.http.GET


interface CountryService {
    @GET("countries")
    fun getCountries(): Call<CountryResponse?>?
}