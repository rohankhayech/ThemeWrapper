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
import androidx.compose.material.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Scaffold as M3Scaffold
import androidx.compose.material3.Text as M3Text
import androidx.compose.material3.TopAppBar as M3TopAppBar
import androidx.compose.material3.Button as M3Button
import androidx.compose.material3.TextButton as M3TextButton
import androidx.compose.material3.OutlinedButton as M3OutlinedButton
import androidx.compose.material3.FloatingActionButton as M3FloatingActionButton
import androidx.compose.material3.Switch as M3Switch
import androidx.compose.material3.Checkbox as M3Checkbox
import androidx.compose.material3.ListItem as M3ListItem
import androidx.compose.material3.Card as M3Card
import androidx.compose.material3.Divider as M3Divider
import androidx.compose.material3.TextField as M3TextField
import androidx.compose.material3.OutlinedTextField as M3OutlinedTextField
import androidx.compose.material3.Icon as M3Icon
import androidx.compose.material3.MaterialTheme as M3Theme

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun M2Components() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("App") }
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
                .fillMaxWidth(),
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
@Composable
internal fun M3Components() {
    M3Scaffold(
        topBar = {
            M3TopAppBar(
                title = { M3Text("App") },
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
                .fillMaxWidth(),
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