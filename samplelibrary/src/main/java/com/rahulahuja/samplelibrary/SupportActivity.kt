package com.rahulahuja.samplelibrary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity

class SupportActivity : AppCompatActivity() {

    companion object {
        fun launch(context: Context) {
            startActivity(context, Intent(context, SupportActivity::class.java), null)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support)
    }
}
