package teka.android.smoothrufaaandroidclient.presentation.facilityDetails

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*

import teka.android.smoothrufaaandroidclient.presentation.facilityDetails.components.ContactInfoCard
import teka.android.smoothrufaaandroidclient.presentation.facilityDetails.components.OwnerInfoCard
import teka.android.smoothrufaaandroidclient.presentation.facilityDetails.components.PrimaryInfoCard
import teka.android.smoothrufaaandroidclient.presentation.facilityDetails.components.ServicesCard


@Composable
fun FacilityDetailsScreen(){




    Scaffold {

        PrimaryInfoCard()

        OwnerInfoCard()

        ContactInfoCard()

        ServicesCard()

    }

}