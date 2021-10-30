package com.example.mainpage

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.knitpack_components.KnitNavRoutes

fun NavGraphBuilder.patternNavGraph(navController: NavController) {
    navigation(
        startDestination = KnitNavRoutes.PatternsRoutes.PatternFirst.route,
        route = KnitNavRoutes.PatternsRoutes.PatternGraphRoot.route
    ) {
        composable(KnitNavRoutes.PatternsRoutes.PatternFirst.route) {

            // gets from the root graph
//            val parentEntry = remember{
//                navController.getBackStackEntry(KnitNavRoutes.PatternsRoutes.PatternGraphRoot.route)
//            }
//            val vm = hiltViewModel<MainPageViewModel>(parentEntry)
//            val vm = viewModel<MainPageViewModel>()
//            Log.d("ViewModel test", "${vm}")
            DummyNavView(routeToGoTo = KnitNavRoutes.PatternsRoutes.PatternSecond.route) {
//                navController.navigate(it)
            }

        }
        composable(KnitNavRoutes.PatternsRoutes.PatternSecond.route) {
            val parentEntry = remember{
                navController.getBackStackEntry(KnitNavRoutes.PatternsRoutes.PatternGraphRoot.route)
            }
            val vm = hiltViewModel<MainPageViewModel>(parentEntry)
//            val vm = hiltViewModel<MainPageViewModel>()
//            val vm = viewModel<MainPageViewModel>()
            Log.d("ViewModel test", "${vm}")
            DummyNavView(routeToGoTo = KnitNavRoutes.PatternsRoutes.PatternFirst.route) {
//                navController.popBackStack(it, false, false)
            }
        }
    }
}

fun NavGraphBuilder.tutorialNavGraph(navController: NavController) {
    navigation(
        startDestination = KnitNavRoutes.TutorialsRoutes.TutorialFirst.route,
        route = KnitNavRoutes.TutorialsRoutes.TutorialGraphRoot.route
    ) {
        composable(KnitNavRoutes.TutorialsRoutes.TutorialFirst.route) {

        }
        composable(KnitNavRoutes.TutorialsRoutes.TutorialSecond.route) {

        }
    }
}


fun NavGraphBuilder.personalNavGraph(navController: NavController) {
    navigation(
        startDestination = KnitNavRoutes.PersonalsRoutes.PersonalFirst.route,
        route = KnitNavRoutes.PersonalsRoutes.PersonalGraphRoot.route
    ) {
        composable(KnitNavRoutes.PersonalsRoutes.PersonalFirst.route) {

        }
        composable(KnitNavRoutes.PersonalsRoutes.PersonalSecond.route) {

        }
    }
}

fun NavGraphBuilder.socialNavGraph(navController: NavController) {
    navigation(
        startDestination = KnitNavRoutes.SocialsRoutes.SocialFirst.route,
        route = KnitNavRoutes.SocialsRoutes.SocialGraphRoot.route
    ) {
        composable(KnitNavRoutes.SocialsRoutes.SocialFirst.route) {

        }
        composable(KnitNavRoutes.SocialsRoutes.SocialSecond.route) {

        }
    }
}
