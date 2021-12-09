package com.gb.stopwatch.ui.stopwatch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gb.stopwatch.model.Stopwatch

class StopwatchViewModelFactory(
    private val stopwatchBuilder: () -> Stopwatch
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(Stopwatch::class.java).newInstance(stopwatchBuilder())
    }
}