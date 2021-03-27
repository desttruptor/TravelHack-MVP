package me.podlesnykh.travelhackmvp.entities

data class WayPoint(
    val uid: String,
    val title: String,
    val latitude: Double,
    val longitude: Double,
    val triggerRadius: Double,
    val description: String,
    val imagesUrls: List<String>,
    val pointAudioItemUrl: String? = null
)
