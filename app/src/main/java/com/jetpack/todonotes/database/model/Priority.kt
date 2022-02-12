package com.jetpack.todonotes.database.model

import androidx.compose.ui.graphics.Color
import com.jetpack.todonotes.ui.theme.HighPriorityColor
import com.jetpack.todonotes.ui.theme.LowPriorityColor
import com.jetpack.todonotes.ui.theme.MediumPriorityColor
import com.jetpack.todonotes.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}