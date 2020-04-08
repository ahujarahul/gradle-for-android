package com.rahulahuja.gradleexplained.paid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rahulahuja.gradleexplained.R
import com.rahulahuja.kotlinjokes.Joker
import kotlinx.android.synthetic.paid.activity_paid.*

class PaidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paid)
    }

    override fun onResume() {
        super.onResume()

        tv_joke.text = Joker().tellJoke()
    }
}
