package com.jetpack.todonotes.navigation.destinations

import android.annotation.SuppressLint
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.jetpack.todonotes.utils.Constants.LIST_ARGUMENT_KEY
import com.jetpack.todonotes.utils.Constants.LIST_SCREEN
import com.jetpack.todonotes.utils.toAction
import com.jetpack.todonotes.view.ListScreen
import com.jetpack.todonotes.viewmodel.ToDoNotesViewModel

@SuppressLint("UnrememberedMutableState")
@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    toDoNotesViewModel: ToDoNotesViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = mutableStateListOf(
            navArgument(LIST_ARGUMENT_KEY) {
                type = NavType.StringType
            }
        )
    ) { navBackStackEntry ->
        val action = navBackStackEntry.arguments?.getString(LIST_ARGUMENT_KEY).toAction()
        LaunchedEffect(key1 = action) {
            toDoNotesViewModel.action.value = action
        }

        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            toDoNotesViewModel = toDoNotesViewModel
        )
    }
}















