package com.jetpack.todonotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jetpack.todonotes.navigation.ToDoNotesNavigation
import com.jetpack.todonotes.ui.theme.ToDoNotesTheme
import com.jetpack.todonotes.viewmodel.ToDoNotesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    private val toDoNotesViewModel: ToDoNotesViewModel by viewModels()

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoNotesTheme {
                Surface(color = MaterialTheme.colors.background) {
                    navController = rememberNavController()
                    ToDoNotesNavigation(
                        navHostController = navController,
                        toDoNotesViewModel = toDoNotesViewModel
                    )
                }
            }
        }
    }
}









