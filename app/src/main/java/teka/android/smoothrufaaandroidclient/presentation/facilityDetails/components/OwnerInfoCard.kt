package teka.android.smoothrufaaandroidclient.presentation.facilityDetails.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import teka.android.smoothrufaaandroidclient.R


@Composable
fun OwnerInfoCard() {


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
                modifier = Modifier.weight(1f)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.map),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(72.dp)
                )
            }

            Column(
                modifier = Modifier.weight(2f)
                    .height(72.dp),
                verticalArrangement = Arrangement.Center,

            ) {

                Text(text = "Owner : Ministry of Health")
                Text(text = "Category : Ministry of Health")

            }


        }

    }
}

@Preview
@Composable
fun OwnerCardInfoPreview() {
    OwnerInfoCard()
}