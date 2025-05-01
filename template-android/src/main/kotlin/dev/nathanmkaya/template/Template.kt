/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package dev.nathanmkaya.template

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import dev.nathanmkaya.template.shared.di.KoinModules

class Template : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@Template)
            androidLogger()
            modules(KoinModules.allModules)
        }
    }
}
