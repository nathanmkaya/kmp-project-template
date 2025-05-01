/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package dev.nathanmkaya.template.feature.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import dev.nathanmkaya.template.core.designsystem.component.TemplateScaffold

@Composable
internal fun SettingsScreen(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    SettingsScreenContent(
        modifier = modifier.fillMaxSize(),
        onBackClick = onBackClick,
    )
}

@Composable
internal fun SettingsScreenContent(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    TemplateScaffold(
        topBarTitle = "Settings",
        backPress = onBackClick,
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            // SettingsScreenContent
            Text(text = "Settings Screen", fontWeight = FontWeight.SemiBold)
        }
    }
}
