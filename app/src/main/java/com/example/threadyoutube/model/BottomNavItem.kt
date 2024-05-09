package com.example.threadyoutube.model

import android.icu.text.CaseMap.Title
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val title: String,
    val route: String,
    val icon: ImageVector
)
