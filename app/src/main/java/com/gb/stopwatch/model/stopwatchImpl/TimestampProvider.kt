package com.gb.stopwatch.model.stopwatchImpl

interface TimestampProvider {
    fun getMilliseconds(): Long
}