package me.podlesnykh.travelhackmvp.network.izitravel

import me.podlesnykh.travelhackmvp.BuildConfig
import me.podlesnykh.travelhackmvp.network.izitravel.pojo.SearchResult
import me.podlesnykh.travelhackmvp.network.izitravel.pojo.SearchResults
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface IziTravelService {
    @GET("mtgobjects/search?languages=ru,en&includes=all&api_key=${BuildConfig.IZITRAVEL_API_KEY}&query={place}}")
    suspend fun getObjectsAndRoutes(@Path("place") place: String) : Response<SearchResults>

    @GET("mtgobjects/{uid}}?languages=ru,en&includes=all&except=translations,publisher,download&api_key=${BuildConfig.IZITRAVEL_API_KEY}")
    suspend fun getBaseRoute(@Path("uid") uid: String) : Response<SearchResult>

    @GET("mtgobjects/{childrenUid}?languages=ru,en&includes=all&except=translations,publisher,download&api_key=${BuildConfig.IZITRAVEL_API_KEY}")
    suspend fun getExactData(@Path("childrenUid") childrenUid: String)

    @GET("{contentProviderUid}/{audioUid}.m4a?api_key=${BuildConfig.IZITRAVEL_API_KEY}")
    suspend fun getAudio(
        @Path("contentProviderUid") contentProviderUid: String,
        @Path("audioUid") audioUid: String
    )

    @GET("{contentProviderUid}/{imageUid}}.jpg?api_key=7c6c2db9-d237-4411-aa0e-f89125312494")
    suspend fun getImages(
        @Path("contentProviderUid") contentProviderUid: String,
        @Path("imageUid") imageUid: String
    )
}