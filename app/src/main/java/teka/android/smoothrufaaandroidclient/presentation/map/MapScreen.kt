package teka.android.smoothrufaaandroidclient.presentation.map

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel;
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.*


@Composable
fun MapScreen(
    navController: NavController,
    viewModel: MapsViewModel = viewModel()
){


   // val facilityLocation = LatLng(-4.0616872121212095, 39.67737171507561)
    val hospitalSpot = viewModel.state.hospitalSpots
    val facilityLocation = LatLng(hospitalSpot!!.lat, hospitalSpot.lng)

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
