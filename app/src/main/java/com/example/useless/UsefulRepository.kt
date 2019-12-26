package com.example.useless

import androidx.lifecycle.LiveData

class UsefulRepository (private val usefullDao: UsefullDao){
    //Maintain a copy of the LiveData
    val allUseful : LiveData<List<Usefull>> = usefullDao.getAllUsefull()

    //A function to insert useful record
    suspend fun insertUseful(usefull: Usefull){
        usefullDao.insertUseful((usefull))
    }
}