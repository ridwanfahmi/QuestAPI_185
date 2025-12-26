@file:OptIn(InternalSerializationApi::class)
package com.example.per12.viewmodel



import com.example.per12.modeldata.DataSiswa

import kotlinx.serialization.InternalSerializationApi


sealed interface StatusUIDetail {
    data class Success(val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}
