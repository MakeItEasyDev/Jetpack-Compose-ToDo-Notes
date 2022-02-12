package com.jetpack.todonotes.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jetpack.todonotes.utils.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
