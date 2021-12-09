package com.gb.stopwatch.model

import kotlinx.coroutines.flow.StateFlow

interface Stopwatch {
    val ticker: StateFlow<String>
    fun start()
    fun pause()
    fun stop()
}