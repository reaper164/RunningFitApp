package com.example.runningfitapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runningfitapp.R
import com.example.runningfitapp.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.run_layout) {

    private val mainViewModel : MainViewModel by viewModels()

}