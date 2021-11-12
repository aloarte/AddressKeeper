package com.p4r4d0x.addresskeeper.presenter.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.p4r4d0x.addresskeeper.domain.AddressBO
import com.p4r4d0x.addresskeeper.domain.ServiceBO

@Preview
@Composable
public fun AddressCard(
    @PreviewParameter(AddressProvider::class) address: AddressBO,
//        onClick: () -> Unit
) {
    Card(elevation = 4.dp) {
        Column(
            Modifier
//                    .clickable(onClick = onClick)
                .padding(10.dp)
                .fillMaxWidth()
        ) {

            Text("Address", fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text(address.name, fontSize = 14.sp)
            Divider(modifier = Modifier.height(1.dp), color = Color.Black)
            address.servicesAttached.forEach { service ->
                Row(verticalAlignment = CenterVertically) {
                    Checkbox(checked = true, onCheckedChange = {})
                    Text(service.name, fontSize = 12.sp, fontWeight = FontWeight.Light)
                }
            }
        }
    }
}

class AddressProvider : PreviewParameterProvider<AddressBO> {
    override val values: Sequence<AddressBO>
        get() = listOf(
            AddressBO(
                id = "1234",
                "C/",
                emptyList(),
                listOf(
                    ServiceBO("Santander"),
                    ServiceBO("UNICEF"),
                    ServiceBO("Openbank")
                )
            )
        ).asSequence()
}

