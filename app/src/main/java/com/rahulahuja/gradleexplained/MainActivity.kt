package com.rahulahuja.gradleexplained

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rahulahuja.samplelibrary.SupportActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        btn_next.setOnClickListener(this)
        btn_free_version.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            btn_next.id -> {
                if (BuildConfig.APPLICATION_ID.contains(resources.getString(R.string.paid))) {
                    startActivity(Intent("flavor.paid.PaidActivity"))
                } else {
                    Toast.makeText(this, resources.getString(R.string.upgrade_to_paid), Toast.LENGTH_LONG).show()
                }
            }

            btn_free_version.id -> SupportActivity.launch(this)
        }
    }
}
