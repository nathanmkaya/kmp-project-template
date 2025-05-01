/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package dev.nathanmkaya.template.shared.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import dev.nathanmkaya.template.feature.home.HOME_ROUTE
import dev.nathanmkaya.template.feature.home.homeScreen
import dev.nathanmkaya.template.feature.profile.profileScreen
import dev.nathanmkaya.template.feature.settings.notificationScreen
import dev.nathanmkaya.template.feature.settings.settingsScreen
import dev.nathanmkaya.template.shared.ui.TemplateState

@Composable
internal fun TemplateNavHost(
    appState: TemplateState,
    modifier: Modifier = Modifier,
) {
    val navController = appState.navController

    NavHost(
        route = TemplateNavGraph.MAIN_GRAPH,
        startDestination = HOME_ROUTE,
        navController = navController,
        modifier = modifier,
    ) {
        homeScreen()

        profileScreen()

        settingsScreen(
            onBackClick = navController::popBackStack,
        )

        notificationScreen(
            onBackClick = navController::popBackStack,
        )
    }
}
