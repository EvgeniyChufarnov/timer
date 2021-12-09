package com.gb.stopwatch.di

import android.app.Application
import androidx.fragment.app.Fragment
import com.gb.stopwatch.ui.stopwatch.StopwatchViewModelFactory

class App : Application() {
    private val stopwatchModule = StopwatchModule()

    val stopwatchViewModelFactory by lazy {
        StopwatchViewModelFactory { stopwatchModule.getStopwatch() }
    }
}

val Fragment.app: App
    get() = requireActivity().application as App