package com.example.useless

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UsefullDao {
    @Insert
    suspend fun insertUseful(useful: Usefull)

    @Query("SELECT * FROM useful" )
     fun getAllUsefull(): LiveData<List<Usefull>>

    @Query("SELECT * FROM useful WHERE id = :useful_id")
     fun getAUseful(useful_id:Int): Usefull

    @Update
    suspend fun udpateUseful(useful: Usefull)

    @Delete
    suspend fun deleteUseful(useful: Usefull)
}