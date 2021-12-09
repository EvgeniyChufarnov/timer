package com.gb.stopwatch.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gb.stopwatch.R
import com.gb.stopwatch.ui.stopwatch.StopwatchFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.first_timer_container, StopwatchFragment())
            .commit()

        supportFragmentManager.beginTransaction()
            .add(R.id.second_timer_container, StopwatchFragment())
            .commit()
    }
}

