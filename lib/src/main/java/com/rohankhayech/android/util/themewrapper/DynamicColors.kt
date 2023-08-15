package com.rohankhayech.android.util.themewrapper

import android.content.Context
import androidx.compose.material.Colors
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme

fun dynamicLightColors(context: Context): Colors {
    val dynamicColorScheme = dynamicLightColorScheme(context)
    return dynamicColors(dynamicColorScheme, true)
}

fun dynamicDarkColors(context: Context): Colors {
    val dynamicColorScheme = dynamicDarkColorScheme(context)
    return dynamicColors(dynamicColorScheme, false)
}

private fun dynamicColors(dynamicColorScheme: ColorScheme, isLight: Boolean): Colors {
    return Colors(
        primary = dynamicColorScheme.primary,
        primaryVariant = dynamicColorScheme.secondary,
        secondary = dynamicColorScheme.tertiary,
        secondaryVariant = dynamicColorScheme.tertiary,
        background = dynamicColorScheme.background,
        surface = dynamicColorScheme.surface,
        error = dynamicColorScheme.error,
        onPrimary = dynamicColorScheme.onPrimary,
        onSecondary = dynamicColorScheme.onTertiary,
        onBackground = dynamicColorScheme.onBackground,
        onSurface = dynamicColorScheme.onSurface,
        onError = dynamicColorScheme.onError,
        isLight = isLight
    )
}