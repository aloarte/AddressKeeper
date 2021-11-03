package com.p4r4d0x.addresskeeper.domain

class AddressBO(
    val id: String,
    val alerts: List<AlertBO>,
    val servicesAttached: ServiceBO
) {
}