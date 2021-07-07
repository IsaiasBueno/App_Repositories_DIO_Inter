package com.isaiasbueno.app_repositories_dio_inter

import android.app.Application
import com.isaiasbueno.app_repositories_dio_inter.data.di.DataModule
import com.isaiasbueno.app_repositories_dio_inter.domain.di.DomainModule
import com.isaiasbueno.app_repositories_dio_inter.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}