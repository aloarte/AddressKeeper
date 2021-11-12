package com.p4r4d0x.addresskeeper.presenter.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.p4r4d0x.addresskeeper.domain.AddressBO

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
//       val viewModel: MainViewModel by inject()
        Column() {
            AddressCard(AddressBO(
                id = "1234",
                "C/Viloria de la Rioja 20",
                emptyList(),
                emptyList()
            ))
            AddressCard(AddressBO(
                id = "1234",
                "C/Viloria de la Rioja 20",
                emptyList(),
                emptyList()
            ))
        }

    }



}