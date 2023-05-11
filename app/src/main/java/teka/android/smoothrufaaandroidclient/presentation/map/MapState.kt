package teka.android.smoothrufaaandroidclient.presentation.map

import com.google.maps.android.compose.MapProperties
import teka.android.smoothrufaaandroidclient.domain.model.HospitalSpot

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<HospitalSpot> = emptyList(),
    val isFalloutMap: Boolean = false

)
