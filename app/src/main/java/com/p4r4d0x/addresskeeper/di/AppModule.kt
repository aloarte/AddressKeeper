package com.p4r4d0x.addresskeeper.di

import com.p4r4d0x.addresskeeper.presenter.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vmModule = module {
    viewModel { MainViewModel() }
}