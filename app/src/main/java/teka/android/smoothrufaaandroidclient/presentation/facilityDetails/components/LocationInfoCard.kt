package teka.android.smoothrufaaandroidclient.presentation.facilityDetails.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import teka.android.smoothrufaaandroidclient.R

@Composable
fun LocationInfoCard() {


    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray)
            .padding(6.dp)
    ) {

        Row() {


            Column(
                modifier = Modifier.weight(2f)
            ) {

                Text(text = "Location")
                
                Text(text = "Muranga COUNTY")
                
                Text(text = "KANGEMA SUB-COUNTY")
                
                Text(text = "Kanyenya-ini WARD")
                
                Text(text = "Karurumo shopping centre town")

            }

            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(textAlign = TextAlign.Center,
                    text = "Show location on a map")
                Image(
                    painter = painterResource(id = R.drawable.map),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(72.dp)
                )

            }

        }



    }
}


@Preview
@Composable
fun SimpleComposablePreview() {
    LocationInfoCard()
}