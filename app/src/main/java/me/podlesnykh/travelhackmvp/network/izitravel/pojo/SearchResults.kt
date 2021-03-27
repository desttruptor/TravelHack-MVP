package me.podlesnykh.travelhackmvp.network.izitravel.pojo

import com.google.gson.annotations.SerializedName

data class Location(

	@field:SerializedName("latitude")
	val latitude: Double? = null,

	@field:SerializedName("city_uuid")
	val cityUuid: String? = null,

	@field:SerializedName("longitude")
	val longitude: Double? = null
)

data class ImagesItem(

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null,

	@field:SerializedName("hash")
	val hash: String? = null,

	@field:SerializedName("order")
	val order: Int? = null
)

data class ResponseItem(

	@field:SerializedName("images")
	val images: List<ImagesItem>? = null,

	@field:SerializedName("distance")
	val distance: Int? = null,

	@field:SerializedName("city")
	val city: City? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("reviews")
	val reviews: Reviews? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null,

	@field:SerializedName("duration")
	val duration: Int? = null,

	@field:SerializedName("content_provider")
	val contentProvider: ContentProvider? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("map")
	val map: Map? = null,

	@field:SerializedName("route")
	val route: String? = null
)

data class City(

	@field:SerializedName("summary")
	val summary: String? = null,

	@field:SerializedName("images")
	val images: List<ImagesItem>? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("map")
	val map: Map? = null,
)

data class Map(

	@field:SerializedName("bounds")
	val bounds: String? = null
)
