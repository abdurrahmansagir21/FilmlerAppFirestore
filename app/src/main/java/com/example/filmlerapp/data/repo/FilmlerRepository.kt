package com.example.filmlerapp.data.repo

import androidx.lifecycle.MutableLiveData
import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.data.entity.Filmler

class FilmlerRepository(var fds: FilmlerDataSource) {

    fun filmleriyukle(): MutableLiveData<List<Filmler>> = fds.filmleriyukle()
}