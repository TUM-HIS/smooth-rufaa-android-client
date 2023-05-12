package teka.android.smoothrufaaandroidclient.domain.items

import teka.android.smoothrufaaandroidclient.data.remote.models.FacilityModel

data class FacilityItem(

    val id: Int,
    val name: String,

)


fun FacilityModel.toFacilityItem() = FacilityItem(id, name)
