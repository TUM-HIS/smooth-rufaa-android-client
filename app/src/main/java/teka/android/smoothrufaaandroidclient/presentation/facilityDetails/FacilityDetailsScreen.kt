package teka.android.smoothrufaaandroidclient.presentation.facilityDetails

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import teka.android.smoothrufaaandroidclient.presentation.facilityDetails.components.*


@Composable
fun FacilityDetailsScreen(){




    Scaffold {

        Column() {
            PrimaryInfoCard()

            LocationInfoCard()

            OwnerInfoCard()

            ContactInfoCard()

            ServicesCard()
        }


    }

}


@Preview
@Composable
fun FacilityDetailsPreview() {
    FacilityDetailsScreen()
}