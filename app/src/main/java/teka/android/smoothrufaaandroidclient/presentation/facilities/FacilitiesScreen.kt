package teka.android.smoothrufaaandroidclient.presentation.facilities

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun FacilitiesScreen(){

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        repeat(5) {
            FacilityCard()
            Spacer(modifier = Modifier.height(16.dp))
        }
    }

}