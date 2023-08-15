/*
 * Choona - Guitar Tuner
 * Copyright (C) 2023 Rohan Khayech
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.rohankhayech.android.util.themewrapper

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button as M3Button
import androidx.compose.material3.Card as M3Card
import androidx.compose.material3.Checkbox as M3Checkbox
import androidx.compose.material3.Divider as M3Divider
import androidx.compose.material3.FloatingActionButton as M3FloatingActionButton
import androidx.compose.material3.Icon as M3Icon
import androidx.compose.material3.IconButton as M3IconButton
import androidx.compose.material3.ListItem as M3ListItem
import androidx.compose.material3.MaterialTheme as M3Theme
import androidx.compose.material3.OutlinedButton as M3OutlinedButton
import androidx.compose.material3.OutlinedTextField as M3OutlinedTextField
import androidx.compose.material3.Scaffold as M3Scaffold
import androidx.compose.material3.Surface as M3Surface
import androidx.compose.material3.Switch as M3Switch
import androidx.compose.material3.Text as M3Text
import androidx.compose.material3.TextButton as M3TextButton
import androidx.compose.material3.TextField as M3TextField
import androidx.compose.material3.TopAppBar as M3TopAppBar

@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
internal fun M2Components() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("App") },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.MoreVert, contentDescription = null)
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(16.dp)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("H1", style = MaterialTheme.typography.h1)
            Text("Subtitle 1", style = MaterialTheme.typography.subtitle1)
            Text("Body 1")
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Button({}) {
                    Text(text = "Button")
                }
                OutlinedButton({}) {
                    Text(text = "Button")
                }
                TextButton({}) {
                    Text(text = "Button")
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Switch(checked = true, onCheckedChange = {})
                Switch(checked = false, onCheckedChange = {})
            }
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Checkbox(checked = true, onCheckedChange = {})
                Checkbox(checked = false, onCheckedChange = {})
            }
            Divider()
            ListItem(
                text = { Text("Text") },
                secondaryText = { Text("Secondary Text") },
                overlineText = { Text("Overline") },
                trailing = { Text("Trailing") },
            )
            Card(elevation = 4.dp) {
                ListItem(
                    text = { Text("Text") },
                    secondaryText = { Text("Secondary Text") },
                    overlineText = { Text("Overline") },
                    trailing = { Text("Trailing") },
                )
            }
            TextField(label = {Text("Label")}, value = "Text", onValueChange = {})
            OutlinedTextField(label = {Text("Label")}, value = "Text", isError = true, onValueChange = {})
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
internal fun M3Components() {
    M3Scaffold(
        topBar = {
            M3TopAppBar(
                title = { M3Text("App") },
                actions = {
                    M3IconButton(onClick = {}) {
                        M3Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
                    }
                }
            )
        },
        floatingActionButton = {
            M3FloatingActionButton(onClick = {}) {
                M3Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }
    ) {
        Column(
            Modifier
                .padding(it)
                .padding(16.dp)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            M3Text("H1", style = M3Theme.typography.displayLarge)
            M3Text("Subtitle 1", style = M3Theme.typography.titleMedium)
            M3Text("Body 1")
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                M3Button({}) {
                    M3Text(text = "Button")
                }
                M3OutlinedButton({}) {
                    M3Text(text = "Button")
                }
                M3TextButton({}) {
                    M3Text(text = "Button")
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                M3Switch(checked = true, onCheckedChange = {})
                M3Switch(checked = false, onCheckedChange = {})
            }
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                M3Checkbox(checked = true, onCheckedChange = {})
                M3Checkbox(checked = false, onCheckedChange = {})
            }
            M3Divider()
            M3ListItem(
                headlineContent = { M3Text("Text") },
                supportingContent = { M3Text("Secondary Text") },
                overlineContent = { M3Text("Overline") },
                trailingContent = { M3Text("Trailing") },
            )
            M3Card(elevation = CardDefaults.elevatedCardElevation()) {
                M3ListItem(
                    headlineContent = { M3Text("Text") },
                    supportingContent = { M3Text("Secondary Text") },
                    overlineContent = { M3Text("Overline") },
                    trailingContent = { M3Text("Trailing") },
                )
            }
            M3TextField(label = { M3Text("Label") }, value = "Text", onValueChange = {})
            M3OutlinedTextField(label = { M3Text("Label") }, value = "Text", isError = true, onValueChange = {})
        }
    }
}

@Preview
@Composable
internal fun M2Swatch() {
    Surface {
        Column(Modifier.padding(16.dp)) {
            Text("Colors", Modifier.padding(bottom = 8.dp), style = MaterialTheme.typography.subtitle2)
            Row(Modifier.fillMaxWidth()) {
                ColorSwatch(name = "Primary", color = MaterialTheme.colors.primary)
                ColorSwatch(name = "Primary Variant", color = MaterialTheme.colors.primaryVariant)
                ColorSwatch(name = "Secondary", color = MaterialTheme.colors.secondary)
                ColorSwatch(name = "Secondary Variant", color = MaterialTheme.colors.secondaryVariant)
            }
            Row(Modifier.fillMaxWidth()) {
                ColorSwatch(name = "Background", color = MaterialTheme.colors.background)
                ColorSwatch(name = "Surface", color = MaterialTheme.colors.surface)
                ColorSwatch(name = "Error", color = MaterialTheme.colors.error)
            }
            Text("Shapes", Modifier.padding(vertical = 8.dp), style = MaterialTheme.typography.subtitle2)
            CompositionLocalProvider(LocalContentColor provides MaterialTheme.colors.onSurface.copy(alpha = 0.12f)) {
                Row(Modifier.fillMaxWidth()) {
                    ShapeSwatch(MaterialTheme.shapes.small)
                    ShapeSwatch(MaterialTheme.shapes.medium)
                    ShapeSwatch(MaterialTheme.shapes.large)
                }
            }
        }
    }
}

@Preview
@Composable
internal fun M3Swatch() {
    M3Surface {
        Column(Modifier.padding(16.dp)) {
            M3Text("Colors", Modifier.padding(bottom = 8.dp), style = M3Theme.typography.labelLarge)
            Row(Modifier.fillMaxWidth()) {
                M3ColorSwatch(name = "Primary", color = M3Theme.colorScheme.primary)
                M3ColorSwatch(name = "Primary Container", color = M3Theme.colorScheme.primaryContainer)
                M3ColorSwatch(name = "Secondary", color = M3Theme.colorScheme.secondary)
                M3ColorSwatch(name = "Secondary Container", color = M3Theme.colorScheme.secondaryContainer)
            }
            Row(Modifier.fillMaxWidth()) {
                M3ColorSwatch(name = "Tertiary", color = M3Theme.colorScheme.tertiary)
                M3ColorSwatch(name = "Tertiary Container", color = M3Theme.colorScheme.tertiaryContainer)
                M3ColorSwatch(name = "Error", color = M3Theme.colorScheme.error)
                M3ColorSwatch(name = "Error Container", color = M3Theme.colorScheme.errorContainer)
            }
            Row(Modifier.fillMaxWidth()) {
                M3ColorSwatch(name = "Background", color = M3Theme.colorScheme.background)
                M3ColorSwatch(name = "Surface", color = M3Theme.colorScheme.surface)
                M3ColorSwatch(name = "Surface Variant", color = M3Theme.colorScheme.surfaceVariant)
                M3ColorSwatch(name = "Outline", color = M3Theme.colorScheme.outline)
            }
            M3Text("Shapes", Modifier.padding(vertical = 8.dp), style = M3Theme.typography.labelLarge)
            CompositionLocalProvider(LocalContentColor provides M3Theme.colorScheme.surfaceVariant) {
                Row(Modifier.fillMaxWidth()) {
                    ShapeSwatch(M3Theme.shapes.extraSmall)
                    ShapeSwatch(M3Theme.shapes.small)
                    ShapeSwatch(M3Theme.shapes.medium)
                    ShapeSwatch(M3Theme.shapes.large)
                    ShapeSwatch(M3Theme.shapes.extraLarge)
                }
            }
        }
    }
}

@Composable
private fun RowScope.ColorSwatch(
    name: String,
    color: Color,
) {
    Surface(
        Modifier
            .weight(1f)
            .height(80.dp),
        color = color
    ) {
        Text(text = name, Modifier.padding(8.dp), style = MaterialTheme.typography.subtitle2)
    }
}

@Composable
private fun RowScope.M3ColorSwatch(
    name: String,
    color: Color,
) {
    M3Surface(
        Modifier
            .weight(1f)
            .height(80.dp),
        color = color
    ) {
            M3Text(text = name, Modifier.padding(8.dp), style = M3Theme.typography.labelMedium)
    }
}


@Composable
private fun RowScope.ShapeSwatch(
    shape: Shape,
) {
    Surface(
        Modifier
            .weight(1f)
            .height(40.dp)
            .padding(horizontal = 8.dp),
        color = LocalContentColor.current,
        shape = shape
    ) {}
}

@Composable
internal fun M3AdaptiveTheme(content: @Composable () -> Unit) {
    M3Theme(
        colorScheme = if (isSystemInDarkTheme()) darkColorScheme() else lightColorScheme(),
        content = content
    )
}

@Composable
internal fun M2AdaptiveTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = if (isSystemInDarkTheme()) darkColors() else lightColors(),
        content = content
    )
}