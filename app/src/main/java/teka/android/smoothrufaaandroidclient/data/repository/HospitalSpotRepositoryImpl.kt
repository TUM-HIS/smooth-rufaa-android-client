package teka.android.smoothrufaaandroidclient.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import teka.android.smoothrufaaandroidclient.domain.model.HospitalSpot
import teka.android.smoothrufaaandroidclient.domain.repository.HospitalSpotRepository


class HospitalSpotRepositoryImpl(
): HospitalSpotRepository {

    override fun getHospitalSpots(): Flow<List<HospitalSpot>> {
        TODO("Not yet implemented")
    }


}