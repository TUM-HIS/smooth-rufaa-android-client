package teka.android.smoothrufaaandroidclient.presentation.map

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.*


@Composable
fun MapScreen(
    navController: NavController,
    facilityCode: String
    //viewModel: MapsViewModel = viewModel()
){


    val facilityLocation = LatLng(-4.0616872121212095, 39.67737171507561)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(facilityLocation, 300f)
    }


    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    ) {

        MapMarker(
            position = facilityLocation,
            title = "Medical Facility"
        )


    }


}


@Composable
fun MapMarker(
    position: LatLng,
    title: String,

) {

    Marker(
        state = MarkerState(position = position),
        title = title,
        icon = BitmapDescriptorFactory.defaultMarker(
            BitmapDescriptorFactory.HUE_CYAN
        )
    )
}
