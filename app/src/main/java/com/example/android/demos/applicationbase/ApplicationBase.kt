package com.example.android.demos.applicationbase

import android.app.Application
import com.example.android.common.basedi.basedbmodules.baseDbModule
import com.example.android.common.basedi.networkmodules.networkModule
import com.example.android.demos.basedi.baseviewmodules.baseViewModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ApplicationBase : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ApplicationBase)
            modules(listOf(baseDbModule, baseViewModules, networkModule))
        }
    }
}