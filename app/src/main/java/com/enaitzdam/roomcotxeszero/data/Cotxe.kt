package com.enaitzdam.roomcotxeszero.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Car")
data class Cotxe(
    @ColumnInfo(name = "year")
    var any: Int,
    @ColumnInfo(name = "fuel")
    var combustible: String,
    @ColumnInfo(name = "brand")
    var marca: String,
    @ColumnInfo(name = "hp")
    var cavalls: Int
){
    @PrimaryKey(autoGenerate = true)
    var Id: Int? = null
}
