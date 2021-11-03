package com.p4r4d0x.addresskeeper.presenter.view

import android.os.Bundle
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.koin.java.KoinJavaComponent.inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScreen()
        }
    }

    @Preview
    @Composable
    private fun MyScreen() {
//        val viewModel:MainViewModel by inject<MainViewModel>()
        Text("Hello")

    }


}