package me.podlesnykh.travelhackmvp.network.izitravel.pojo

import com.google.gson.annotations.SerializedName

data class Reviews(

	@field:SerializedName("rating_average")
	val ratingAverage: Int? = null,

	@field:SerializedName("ratings_count")
	val ratingsCount: Int? = null,

	@field:SerializedName("reviews_count")
	val reviewsCount: Int? = null
)

data class AudioItem(

	@field:SerializedName("duration")
	val duration: Int? = null,

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

data class TriggerZonesItem(

	@field:SerializedName("circle_longitude")
	val circleLongitude: Double? = null,

	@field:SerializedName("circle_latitude")
	val circleLatitude: Double? = null,

	@field:SerializedName("circle_altitude")
	val circleAltitude: Int? = null,

	@field:SerializedName("circle_radius")
	val circleRadius: Double? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class Playback(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("order")
	val order: List<String?>? = null
)

data class ContentProvider(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null
)

data class ChildrenItem(

	@field:SerializedName("summary")
	val summary: String? = null,

	@field:SerializedName("trigger_zones")
	val triggerZones: List<TriggerZonesItem?>? = null,

	@field:SerializedName("images")
	val images: List<ImagesItem?>? = null,

	@field:SerializedName("hidden")
	val hidden: Boolean? = null,

	@field:SerializedName("languages")
	val languages: List<String?>? = null,

	@field:SerializedName("language")
	val language: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null,

	@field:SerializedName("content_provider")
	val contentProvider: ContentProvider? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("hash")
	val hash: String? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("desc")
	val desc: String? = null
)

data class ContentItem(

	@field:SerializedName("summary")
	val summary: String? = null,

	@field:SerializedName("images")
	val images: List<ImagesItem?>? = null,

	@field:SerializedName("children")
	val children: List<ChildrenItem?>? = null,

	@field:SerializedName("playback")
	val playback: Playback? = null,

	@field:SerializedName("language")
	val language: String? = null,

	@field:SerializedName("audio")
	val audio: List<AudioItem?>? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("desc")
	val desc: String? = null
)

data class SearchResultItem(

	@field:SerializedName("distance")
	val distance: Int? = null,

	@field:SerializedName("city")
	val city: City? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null,

	@field:SerializedName("content")
	val content: List<ContentItem>? = null,

	@field:SerializedName("duration")
	val duration: Int? = null,

	@field:SerializedName("reviews")
	val reviews: Reviews? = null,

	@field:SerializedName("content_provider")
	val contentProvider: ContentProvider? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("placement")
	val placement: String? = null,

	@field:SerializedName("category")
	val category: String? = null,

	@field:SerializedName("map")
	val map: Map? = null,

	@field:SerializedName("hash")
	val hash: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)
