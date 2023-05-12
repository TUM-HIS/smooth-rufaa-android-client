package teka.android.smoothrufaaandroidclient

import com.google.android.gms.maps.model.LatLng
import teka.android.smoothrufaaandroidclient.ui.theme.SmoothRufaaAndroidClientTheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import teka.android.smoothrufaaandroidclient.presentation.map.MapScreen


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmoothRufaaAndroidClientTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MapScreen()
                }
            }
        }
    }
}