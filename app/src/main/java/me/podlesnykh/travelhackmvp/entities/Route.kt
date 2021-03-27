package me.podlesnykh.travelhackmvp.entities

data class Route(
    val wayPoints: List<WayPoint>,
    val bounds: String
)