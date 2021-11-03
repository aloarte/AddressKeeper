package com.p4r4d0x.addresskeeper.data.repository

import com.p4r4d0x.addresskeeper.domain.AddressBO

interface AddressManagementRepository {

    suspend fun createNewAddress():Boolean

    suspend fun removeAddress(address:AddressBO):Boolean

    suspend fun updateAddress(address: AddressBO):AddressBO

    suspend fun getCurrentAddress():AddressBO
}