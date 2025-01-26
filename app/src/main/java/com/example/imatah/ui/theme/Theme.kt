package com.example.imatah.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = RescueBlue,
    secondary = AlertOrange,
    tertiary = AsphaltGray,
    background = LightSurface,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black,
    error = HazardRed,
    //warning = ConeOrange,
    //success = SafetyGreen
)

private val DarkColorScheme = darkColorScheme(
    primary = NightBlue,
    secondary = EmberOrange,
    tertiary = ConcreteGray,
    background = DarkSurface,
    surface = Color(0xFF37474F),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = HazardRed,
    //warning = ConeOrange,
    //success = SafetyGreen
)


@Composable
fun ImatahTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    // Choose color scheme based on theme mode
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}