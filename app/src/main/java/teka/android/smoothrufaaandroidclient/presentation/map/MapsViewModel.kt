package teka.android.smoothrufaaandroidclient.presentation.map;

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.launch
import teka.android.smoothrufaaandroidclient.domain.items.HospitalSpot

@HiltViewModel
class MapsViewModel @Inject constructor(): ViewModel() {
        var state by mutableStateOf(MapState())

        init {
                viewModelScope.launch {
                        state = state.copy(
                                hospitalSpots = HospitalSpot(
                                        lat = -4.0616872121212095,
                                        lng = 39.67737171507561
                                )
                        )
                }
        }


}