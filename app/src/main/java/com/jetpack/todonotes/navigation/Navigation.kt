package com.jetpack.todonotes.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.jetpack.todonotes.navigation.destinations.listComposable
import com.jetpack.todonotes.navigation.destinations.taskComposable
import com.jetpack.todonotes.utils.Constants.LIST_SCREEN
import com.jetpack.todonotes.viewmodel.ToDoNotesViewModel

@ExperimentalMaterialApi
@Composable
fun ToDoNotesNavigation(
    navHostController: NavHostController,
    toDoNotesViewModel: ToDoNotesViewModel
) {
    val screen = remember(navHostController) { Screens(navHostController) }

    NavHost(
        navController = navHostController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task,
            toDoNotesViewModel = toDoNotesViewModel
        )
        taskComposable(
            toDoNotesViewModel = toDoNotesViewModel,
            navigateToListScreen = screen.list
        )
    }
}


















