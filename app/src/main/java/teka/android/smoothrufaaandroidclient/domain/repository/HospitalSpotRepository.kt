package teka.android.smoothrufaaandroidclient.domain.repository

import kotlinx.coroutines.flow.Flow
import teka.android.smoothrufaaandroidclient.data.remote.models.FacilityModel
import teka.android.smoothrufaaandroidclient.domain.items.FacilityItem
import teka.android.smoothrufaaandroidclient.domain.items.HospitalSpot

interface HospitalSpotRepository {
    fun getHospitalSpots(): Flow<List<HospitalSpot>>

    suspend fun getFacilities(): List<FacilityItem>

    suspend fun getGameById(id: Int): FacilityItem
}