package com.example.filmlerapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.data.repo.FilmlerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor (var frepo: FilmlerRepository) : ViewModel() {

    var filmlerlistesi = MutableLiveData<List<Filmler>>()

    init {
        filmleriyukle()
    }

    fun filmleriyukle() {
        viewModelScope.launch {
            filmlerlistesi.value = frepo.filmleriyukle()
        }
    }
}
