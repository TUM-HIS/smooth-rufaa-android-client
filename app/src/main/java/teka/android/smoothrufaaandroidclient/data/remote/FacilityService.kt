package teka.android.smoothrufaaandroidclient.data.remote

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import teka.android.smoothrufaaandroidclient.data.remote.models.FacilityModel
import javax.inject.Inject

class FacilityService @Inject constructor(
    private val facilityApi: FacilityApi
    ) {

    suspend fun getFacilities(): List<FacilityModel> {

        return withContext(Dispatchers.IO){
            val facilities = facilityApi.getFacilities()
            facilities.body() ?: emptyList()
        }
    }

    suspend fun getFacilityByCode(id: Int): FacilityModel {

        return withContext(Dispatchers.IO){
            val facility = facilityApi.getFacilityByCode(id)
            facility.body()!!
        }

    }
}