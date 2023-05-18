package teka.android.smoothrufaaandroidclient.presentation.facilities

import android.media.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material3.*
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle

import androidx.compose.ui.unit.dp
import teka.android.smoothrufaaandroidclient.R


@Composable
fun FacilityCard(){

    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth()

            ) {
                Text(
                    text = "code",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.primary,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = " | ",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.secondary
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "facilityName",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

//            Image(
//                painter = painterResource(id = R.drawable.map),
//                contentDescription = "Image",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.size(72.dp)
//            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    val text = buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color.Black)) {
                            append("Status: ")
                        }
                        withStyle(style = SpanStyle(color = Color.Magenta)) {
                            append("Operational")
                        }
                    }

                    Text(
                        text = text,
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.Black
                    )
                    Button(
                        shape = RoundedCornerShape(5.dp),
                        onClick = { /*TODO*/ },
                        modifier = Modifier.padding(0.dp)
                    ) {
                        Text(
                            text = "Medical Clinic",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.Gray,
                        )
                    }


                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {

                    Text(
                        text = "Baringo County",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Private Practice",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.Gray
                    )

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {

                    Text(
                        text = "Marigat Sub-county",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Baringo South Constituency",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Gray
                    )

                }
                
                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "Marigat Ward",
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.Black
                    )


                }


            }
        }
    }

}