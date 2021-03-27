package me.podlesnykh.travelhackmvp.network.izitravel

import com.google.gson.GsonBuilder
import me.podlesnykh.travelhackmvp.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val gson by lazy {
        GsonBuilder()
            .create()
    }

    private val retrofitIzitravel by lazy {
        Retrofit.Builder()
            .baseUrl(BuildConfig.IZITRAVEL_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    val iziTravelInstance: IziTravelService by lazy {
        retrofitIzitravel.create(IziTravelService::class.java)
    }
}