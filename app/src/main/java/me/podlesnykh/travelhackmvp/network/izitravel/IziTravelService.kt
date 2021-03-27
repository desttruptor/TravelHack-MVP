package me.podlesnykh.travelhackmvp.network.izitravel

import me.podlesnykh.travelhackmvp.BuildConfig
import me.podlesnykh.travelhackmvp.network.izitravel.pojo.*
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface IziTravelService {
    @GET("mtgobjects/search?languages=ru,en&includes=all&api_key=${BuildConfig.IZITRAVEL_API_KEY}&query={place}}")
    suspend fun getObjectsAndRoutes(@Path("place") place: String) : Response<List<ResponseItem>>

    @GET("mtgobjects/{uuid}?languages=ru,en&includes=all&except=translations,publisher,download&api_key=${BuildConfig.IZITRAVEL_API_KEY}")
    suspend fun getBaseRoute(@Path("uuid") uuid: String) : Response<List<SearchResultItem>>

    @GET("mtgobjects/{childrenUid}?languages=ru,en&includes=all&except=translations,publisher,download&api_key=${BuildConfig.IZITRAVEL_API_KEY}")
    suspend fun getExactData(@Path("childrenUid") childrenUid: String) : Response<List<PlaceDataItem>>
}