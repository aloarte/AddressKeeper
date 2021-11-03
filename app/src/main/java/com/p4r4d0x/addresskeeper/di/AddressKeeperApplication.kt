package com.p4r4d0x.addresskeeper.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class AddressKeeperApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@AddressKeeperApplication)
            modules(vmModule)
        }
    }
}