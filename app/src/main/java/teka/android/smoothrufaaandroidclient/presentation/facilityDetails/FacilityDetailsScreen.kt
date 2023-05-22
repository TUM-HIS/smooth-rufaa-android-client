package teka.android.smoothrufaaandroidclient.presentation.facilityDetails

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import teka.android.smoothrufaaandroidclient.presentation.facilityDetails.components.*


@Composable
fun FacilityDetailsScreen(){




    Scaffold {

        PrimaryInfoCard()

        LocationInfoCard()

        OwnerInfoCard()

        ContactInfoCard()

        ServicesCard()

    }

}