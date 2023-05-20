package teka.android.smoothrufaaandroidclient.presentation.facilityDetails.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import teka.android.smoothrufaaandroidclient.utils.BadgeState

@Composable
fun PrimaryInfoCard(){

    var badgeState by remember { mutableStateOf(BadgeState.Empty) }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {


        Row(
            modifier = Modifier.fillMaxWidth()

        ) {
            Text(
                text = "30519",
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
                text = "FacilityName",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onSurface
            )
        }

        Spacer(modifier = Modifier.width(16.dp))


        val typeText = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.Black)) {
                append("Type: ")
            }
            withStyle(style = SpanStyle(color = Color.Magenta)) {
                append("Dispensary")
            }
        }

        Text(
            text = typeText,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black
        )


        val rBText = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.Black)) {
                append("Regulatory Body: ")
            }
            withStyle(style = SpanStyle(color = Color.Magenta)) {
                append("Ministry of Health")
            }
        }

        Text(
            text = rBText,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black
        )


        Spacer(modifier = Modifier.height(8.dp))

        val operationStatusText = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.Black)) {
                append("Operation Status: ")
            }
            withStyle(style = SpanStyle(color = Color.Magenta)) {
                append("Operational")
            }
        }


        Text(
            text = operationStatusText,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Gray
        )


        val regulationStatusText = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.Black)) {
                append("Regulation status: ")
            }
            withStyle(style = SpanStyle(color = Color.Magenta)) {
                append("Pending Gazettement")
            }
        }


        Text(
            text = regulationStatusText,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(8.dp))

        val bedsText = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.Black)) {
                append("Beds: ")
            }
            withStyle(style = SpanStyle(color = Color.Magenta)) {
                append("0")
            }
        }

        Text(
            text = bedsText,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )



        Spacer(modifier = Modifier.height(16.dp))


        val cotsText = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.Black)) {
                append("Cots: ")
            }
            withStyle(style = SpanStyle(color = Color.Magenta)) {
                append("0")
            }
        }

        Text(
            text = cotsText,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Black
        )


    }

}