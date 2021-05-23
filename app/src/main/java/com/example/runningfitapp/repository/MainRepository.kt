package com.example.runningfitapp.repository

import com.example.runningfitapp.database.Run
import com.example.runningfitapp.database.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDAO: RunDAO
) {
    suspend fun insertRun(run : Run) = runDAO.insertRun(run)
    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunsSortedbyDate() = runDAO.getAllRunsByDate()
    fun getAllRunsSortedByDistance() = runDAO.getAllRunsByDistance()
    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunsByTimeInMillis()
    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsByAvgSpeed()
    fun getAllRunsSortedByCalories() = runDAO.getAllRunsByCalories()


    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()
    fun getTotalDistance() = runDAO.getTotalDistance()
    fun getTotalCalories() = runDAO.getTotalCalories()
    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()

}