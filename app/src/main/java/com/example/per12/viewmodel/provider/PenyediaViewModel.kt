package com.example.per12.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.per12.repositori.AplikasiDataSiswa
import com.example.per12.viewmodel.DetailViewModel
import com.example.per12.viewmodel.EditViewModel
import com.example.per12.viewmodel.EntryViewModel
import com.example.per12.viewmodel.HomeViewModel


fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa
        )
object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiDataSiswa().containerApp.repositoryDataSiswa)
        }
        initializer {
            EntryViewModel(aplikasiDataSiswa().containerApp.repositoryDataSiswa)
        }
        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                aplikasiDataSiswa().containerApp.repositoryDataSiswa
            )
        }
        initializer {
            EditViewModel(
                this.createSavedStateHandle(),
                aplikasiDataSiswa().containerApp.repositoryDataSiswa
            )
        }
    }
}