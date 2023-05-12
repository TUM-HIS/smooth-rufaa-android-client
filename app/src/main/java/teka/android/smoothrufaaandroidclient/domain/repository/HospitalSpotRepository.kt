package teka.android.smoothrufaaandroidclient.domain.repository

import kotlinx.coroutines.flow.Flow
import teka.android.smoothrufaaandroidclient.domain.items.HospitalSpot

interface HospitalSpotRepository {
    fun getHospitalSpots(): Flow<List<HospitalSpot>>
}