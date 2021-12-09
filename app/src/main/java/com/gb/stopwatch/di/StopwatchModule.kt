package com.gb.stopwatch.di

import com.gb.stopwatch.model.Stopwatch
import com.gb.stopwatch.model.stopwatchImpl.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

class StopwatchModule {
    private val timestampProvider by lazy {
        object : TimestampProvider {
            override fun getMilliseconds(): Long {
                return System.currentTimeMillis()
            }
        }
    }

    fun getStopwatch(): Stopwatch = StopwatchListOrchestrator(
        StopwatchStateHolder(
            StopwatchStateCalculator(
                timestampProvider,
                ElapsedTimeCalculator(timestampProvider)
            ),
            ElapsedTimeCalculator(timestampProvider),
            TimestampMillisecondsFormatter()
        ),
        CoroutineScope(Dispatchers.Main + SupervisorJob())
    )

}