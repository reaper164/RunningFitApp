package com.example.runningfitapp.database

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run (
    var image : Bitmap? = null,
    var timestamp : Long = 0L,
    var averageSpeed : Float = 0f,
    var distanceMeters : Int = 0,
    var timeInMills : Long = 0L,
    var calories : Int = 0
        ){
    @PrimaryKey(autoGenerate = true)
    var id : Int? = null
}
