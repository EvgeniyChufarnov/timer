package com.gb.stopwatch.ui.stopwatch

import androidx.lifecycle.ViewModel
import com.gb.stopwatch.model.Stopwatch
import kotlinx.coroutines.flow.StateFlow

class StopwatchViewModel(
    private val stopwatch: Stopwatch
) : ViewModel() {

    val ticker: StateFlow<String> = stopwatch.ticker

    fun onStartClicked() {
        stopwatch.start()
    }

    fun onPauseClicked() {
        stopwatch.pause()
    }

    fun onStopClicked() {
        stopwatch.stop()
    }
}