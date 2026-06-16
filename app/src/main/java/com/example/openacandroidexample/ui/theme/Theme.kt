package com.example.openacandroidexample.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val VerifierColorScheme = darkColorScheme(
    primary          = VerifierAccent,
    onPrimary        = VerifierBackground,
    primaryContainer = VerifierSurface,
    background       = VerifierBackground,
    onBackground     = VerifierPrimary,
    surface          = VerifierSurface,
    onSurface        = VerifierPrimary,
    surfaceVariant   = VerifierSurface,
    onSurfaceVariant = VerifierSecondary,
    outline          = VerifierDivider,
    secondary        = VerifierSecondary,
    onSecondary      = VerifierPrimary,
    error            = VerifierError,
    onError          = VerifierPrimary,
)

@Composable
fun OpenACAndroidExampleTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = VerifierColorScheme,
        typography  = Typography,
        content     = content,
    )
}
