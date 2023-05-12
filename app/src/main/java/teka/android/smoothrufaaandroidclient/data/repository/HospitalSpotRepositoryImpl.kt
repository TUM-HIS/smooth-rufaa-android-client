package teka.android.smoothrufaaandroidclient.data.repository

import kotlinx.coroutines.flow.Flow
import teka.android.smoothrufaaandroidclient.domain.items.HospitalSpot
import teka.android.smoothrufaaandroidclient.domain.repository.HospitalSpotRepository


class HospitalSpotRepositoryImpl(
): HospitalSpotRepository {

    override fun getHospitalSpots(): Flow<List<HospitalSpot>> {
        TODO("Not yet implemented")
    }


}