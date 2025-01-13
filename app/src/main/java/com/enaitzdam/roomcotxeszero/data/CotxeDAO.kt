package com.enaitzdam.roomcotxeszero.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CotxeDAO {

    //Consultes

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun afegirCotxe(cotxe: Cotxe)


    //select all
    @Query("SELECT * FROM Car ORDER BY year DESC")
    suspend fun obtenirCotxes(): LiveData<List<Cotxe>>


}