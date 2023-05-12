package teka.android.smoothrufaaandroidclient.presentation.map

import com.google.maps.android.compose.MapProperties
import teka.android.smoothrufaaandroidclient.domain.items.HospitalSpot

data class MapState(

    val properties: MapProperties = MapProperties(),
    val hospitalSpots: HospitalSpot ?= null,
    val isFalloutMap: Boolean = false

)
