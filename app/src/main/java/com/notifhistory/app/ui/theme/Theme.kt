package com.notifhistory.app.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = Purple600,
    onPrimary = White,
    primaryContainer = Purple50,
    onPrimaryContainer = Purple900,
    secondary = Gray600,
    onSecondary = White,
    secondaryContainer = Gray50,
    onSecondaryContainer = Gray900,
    surface = LightSurface,
    onSurface = Gray900,
    surfaceVariant = LightSurfaceVariant,
    onSurfaceVariant = Gray600,
    background = LightBackground,
    onBackground = Gray900,
    outline = Gray200,
    outlineVariant = Gray100
)

private val DarkColorScheme = darkColorScheme(
    primary = Purple100,
    onPrimary = Purple900,
    primaryContainer = PurpleDark40,
    onPrimaryContainer = Purple50,
    secondary = Gray100,
    onSecondary = Gray900,
    secondaryContainer = Gray800,
    onSecondaryContainer = Gray50,
    surface = DarkSurface,
    onSurface = Gray50,
    surfaceVariant = DarkSurfaceVariant,
    onSurfaceVariant = Gray200,
    background = DarkBackground,
    onBackground = Gray50,
    outline = Gray400,
    outlineVariant = Gray600
)

@Composable
fun NotificationHistoryTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context)
            else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
