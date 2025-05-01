/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package dev.nathanmkaya.template.shared

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import org.koin.compose.koinInject
import dev.nathanmkaya.template.core.data.utils.NetworkMonitor
import dev.nathanmkaya.template.core.data.utils.TimeZoneMonitor
import dev.nathanmkaya.template.core.designsystem.theme.TemplateTheme
import dev.nathanmkaya.template.shared.navigation.TemplateNavGraph.MAIN_GRAPH
import dev.nathanmkaya.template.shared.navigation.RootNavGraph

@Composable
fun TemplateSharedApp(
    networkMonitor: NetworkMonitor = koinInject(),
    timeZoneMonitor: TimeZoneMonitor = koinInject(),
    modifier: Modifier = Modifier,
) {
    SharedApp(
        networkMonitor = networkMonitor,
        timeZoneMonitor = timeZoneMonitor,
        modifier = modifier,
    )
}

@Composable
private fun SharedApp(
    networkMonitor: NetworkMonitor,
    timeZoneMonitor: TimeZoneMonitor,
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()

    TemplateTheme {
        RootNavGraph(
            networkMonitor = networkMonitor,
            timeZoneMonitor = timeZoneMonitor,
            navHostController = navController,
            startDestination = MAIN_GRAPH,
            modifier = modifier,
        )
    }
}
