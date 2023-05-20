package teka.android.smoothrufaaandroidclient.presentation.components

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import teka.android.smoothrufaaandroidclient.utils.BadgeState


@Composable
fun BadgeItem(
    badgeState: BadgeState,
    modifier: Modifier = Modifier
) {
    BoxWithConstraints(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        if (true) {
            Surface(
                shape = CircleShape,
                color = Color.Green,
            ) {
                Text(
                    text = "Dispensary",
                    color = Color.White,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }
    }
}
