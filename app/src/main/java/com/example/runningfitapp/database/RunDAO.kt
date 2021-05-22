package com.example.runningfitapp.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run : Run)

    @Delete
    suspend fun deleteRun(run : Run)

    @Query("SELECT * FROM running_table ORDER BY timestamp DESC")
    fun getAllRunsByDate() : LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY timeInMills DESC")
    fun getAllRunsByTimeInMillis() : LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY calories DESC")
    fun getAllRunsByCalories() : LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY averageSpeed DESC")
    fun getAllRunsByAvgSpeed() : LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distanceMeters DESC")
    fun getAllRunsByDistance() : LiveData<List<Run>>

    @Query("SELECT SUM(timeInMills) FROM running_table")
    fun getTotalTimeInMillis() : LiveData<Long>

    @Query("SELECT SUM(calories) FROM running_table")
    fun getTotalCalories() : LiveData<Int>

    @Query("SELECT SUM(distanceMeters) FROM running_table")
    fun getTotalDistance() : LiveData<Int>

    @Query("SELECT AVG(averageSpeed) FROM running_table")
    fun getTotalAvgSpeed() : LiveData<Float>
}