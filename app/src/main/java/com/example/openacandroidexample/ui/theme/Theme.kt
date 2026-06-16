package com.example.openacandroidexample.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val PttColorScheme = darkColorScheme(
    primary          = PttAccent,
    onPrimary        = PttBackground,
    primaryContainer = PttSurface,
    background       = PttBackground,
    onBackground     = PttPrimary,
    surface          = PttSurface,
    onSurface        = PttPrimary,
    surfaceVariant   = PttSurface,
    onSurfaceVariant = PttSecondary,
    outline          = PttDivider,
    secondary        = PttSecondary,
    onSecondary      = PttPrimary,
    error            = PttError,
    onError          = PttPrimary,
)

@Composable
fun OpenACAndroidExampleTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = PttColorScheme,
        typography  = Typography,
        content     = content,
    )
}
