package com.example.runningfitapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.runningfitapp.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class StatisticsViewModel @Inject constructor(
    val repository: MainRepository
) : ViewModel() {
}