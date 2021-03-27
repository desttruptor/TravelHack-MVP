package me.podlesnykh.travelhackmvp.network.izitravel.pojo

import com.google.gson.annotations.SerializedName

data class PlaceDataItem(

	@field:SerializedName("trigger_zones")
	val triggerZones: List<TriggerZonesItem>? = null,

	@field:SerializedName("parent_uuid")
	val parentUuid: String? = null,

	@field:SerializedName("content_provider")
	val contentProvider: ContentProvider? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null,

	@field:SerializedName("content")
	val content: List<ContentItem>? = null,

	@field:SerializedName("map")
	val map: Map? = null
)
