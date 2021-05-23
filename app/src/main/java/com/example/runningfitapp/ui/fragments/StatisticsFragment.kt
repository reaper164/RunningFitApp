package com.example.runningfitapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runningfitapp.R
import com.example.runningfitapp.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.statistics_layout) {
    private val statisticsViewModel : StatisticsViewModel by viewModels()
}