package me.podlesnykh.travelhackmvp.network.izitravel

import me.podlesnykh.travelhackmvp.entities.Route
import me.podlesnykh.travelhackmvp.entities.SearchResultListItem
import me.podlesnykh.travelhackmvp.entities.WayPoint

class Repository {
    suspend fun searchByCity(city: String): List<SearchResultListItem> {
        val response = RetrofitInstance.iziTravelInstance.getObjectsAndRoutes(city)
        return response.body()?.map { responceItem ->
            SearchResultListItem(
                uuid = responceItem.uuid ?: "",
                title = responceItem.title ?: "",
                imageUrl = responceItem.images?.get(0)?.uuid ?: "",
                city = responceItem.city?.title ?: ""
            )
        } ?: emptyList()
    }

    suspend fun getRoute(uuid: String): Route {
        val response = RetrofitInstance.iziTravelInstance.getExactData(uuid)
        val points = response.body()
            ?.get(0)
            ?.content
            ?.get(0)
            ?.children?.map { childrenItem ->
                WayPoint(
                    uid = childrenItem?.uuid ?: "",
                    title = childrenItem?.title ?: "",
                    latitude = childrenItem?.location?.latitude ?: 0.0,
                    longitude = childrenItem?.location?.longitude ?: 0.0,
                    triggerRadius = childrenItem?.triggerZones?.get(0)?.circleRadius ?: 0.0,
                    description = childrenItem?.desc ?: "",
                    imagesUrls = childrenItem?.images?.map { imagesItem ->
                        imagesItem?.uuid ?: ""
                    } ?: emptyList(),
                    pointAudioItemUrl = response.body()?.get(0)?.content?.get(0)?.audio?.get(0)?.uuid ?: ""
                )
            }
        return Route(points ?: emptyList(), response.body()?.get(0)?.map?.bounds ?: "")
    }
}