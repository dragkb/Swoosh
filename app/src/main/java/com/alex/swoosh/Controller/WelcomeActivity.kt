package com.alex.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.alex.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    // First method created and created only once during its life cycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // After click on "get started" button new intent created
        getStartedBtn.setOnClickListener {
            val leagueActivity = Intent(this, LeagueActivity::class.java)
            startActivity(leagueActivity)
        }
    }
}
