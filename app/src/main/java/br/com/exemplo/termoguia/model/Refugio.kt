package br.com.exemplo.termoguia.model

data class Refugio(
    val name: String,
    val categories: List<RefugiosCategory>,
    val address: String,
    val temperaturePerceived: Double,
    val imageUrl: String,
    val featured: Boolean = false
)

