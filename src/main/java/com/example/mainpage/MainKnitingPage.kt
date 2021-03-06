package com.example.mainpage


import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.knitpack_components.KnitNavRoutes

@Composable
fun MainKnitingPage(
    navController: NavHostController,
    viewModel: MainPageViewModel
) {
    NavHost(
        navController = navController,
        startDestination = KnitNavRoutes.PatternsRoutes.PatternGraphRoot.route,
        route = "ROOT OF ROOTS",
        modifier = Modifier.padding(12.dp)
    ) {
        patternNavGraph(navController)
        tutorialNavGraph(navController)
        socialNavGraph(navController)
        personalNavGraph(navController)
    }
}
