package com.jetpack.todonotes.navigation

import androidx.navigation.NavHostController
import com.jetpack.todonotes.utils.Action
import com.jetpack.todonotes.utils.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}