package teka.android.smoothrufaaandroidclient.data.repository

import kotlinx.coroutines.flow.Flow
import teka.android.smoothrufaaandroidclient.data.remote.FacilityService
import teka.android.smoothrufaaandroidclient.domain.items.FacilityItem
import teka.android.smoothrufaaandroidclient.domain.items.HospitalSpot
import teka.android.smoothrufaaandroidclient.domain.items.toFacilityItem
import teka.android.smoothrufaaandroidclient.domain.repository.HospitalSpotRepository
import javax.inject.Inject


class HospitalSpotRepositoryImpl @Inject constructor(
    private val facilityService: FacilityService
): HospitalSpotRepository {

    override fun getHospitalSpots(): Flow<List<HospitalSpot>> {
        TODO("Not yet implemented")
    }

    override suspend fun getFacilities(): List<FacilityItem> {
        return facilityService.getFacilities().map {
            it.toFacilityItem()
        }
    }

    override suspend fun getGameById(code : Int): FacilityItem {
        return facilityService.getFacilityByCode(code).toFacilityItem()
    }


}