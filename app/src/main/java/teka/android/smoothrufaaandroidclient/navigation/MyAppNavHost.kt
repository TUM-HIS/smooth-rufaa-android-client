package teka.android.smoothrufaaandroidclient.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import teka.android.composenavigation.navigation.Routes
import teka.android.smoothrufaaandroidclient.presentation.home.HomeScreen
import teka.android.smoothrufaaandroidclient.presentation.map.MapScreen

@Composable
fun MyAppNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = Routes.MAP_SCREEN){

        composable(Routes.HOME_SCREEN){
            HomeScreen(navController = navController)
        }
        
//        composable(Routes.MAP_SCREEN +"/{facilityCode}" ){ navBackStackEntry ->
//            MapScreen(navController = navController,
//                facilityCode = navBackStackEntry.arguments?.getString("facilityCode")?: "11289")
//        }

        composable(Routes.MAP_SCREEN){
            MapScreen(navController = navController)
        }

    }


}