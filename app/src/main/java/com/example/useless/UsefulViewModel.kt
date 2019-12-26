package com.example.useless

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UsefulViewModel (application: Application)
    : AndroidViewModel(application){
    //Maintain a reference to the Repository
    private val usefulRepository: UsefulRepository

    //Maintain a copy of the useful record
    val allUseful : LiveData<List<Usefull>>

    init{
        val usefullDao = UsefulDatabase
            .getDataBase(application)
            .usefulDao()

        usefulRepository = UsefulRepository(usefullDao)
        allUseful = usefulRepository.allUseful
    }

    //Create a coroutine function to insert data in
    //background thread
    fun insertUseful(usefull: Usefull) = viewModelScope.launch {

    }
}