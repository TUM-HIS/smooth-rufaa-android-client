package teka.android.smoothrufaaandroidclient.presentation.facilities

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun FacilitiesScreen(){

    Scaffold(
        modifier = Modifier.padding(16.dp)
    ) {
        LazyColumn{

            items(5){

                    FacilityCard()
                    Spacer(modifier = Modifier.height(16.dp))

            }

        }

    }

}