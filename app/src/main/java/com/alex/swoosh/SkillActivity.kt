package com.alex.swoosh

import android.os.Bundle

class SkillActivity : BaseActivity() {

    // creating a var for holding intent message
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        // Getting intent message from LeagueActivity
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
}
