package teka.android.smoothrufaaandroidclient.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import teka.android.smoothrufaaandroidclient.data.remote.models.FacilityModel
import teka.android.smoothrufaaandroidclient.utils.Constants.Companion.FACILITIES_ENDPOINT
import teka.android.smoothrufaaandroidclient.utils.Constants.Companion.FACILITY_CODE_ENDPOINT

interface FacilityApi {

    @GET(FACILITIES_ENDPOINT)
    suspend fun getFacilities(): Response<List<FacilityModel>>

    @GET(FACILITY_CODE_ENDPOINT)
    suspend fun getFacilityByCode(@Query(value = "id") id: Int): Response<FacilityModel>

}