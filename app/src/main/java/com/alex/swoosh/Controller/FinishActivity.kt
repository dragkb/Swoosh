package com.alex.swoosh.Controller

import android.os.Bundle
import com.alex.swoosh.R
import com.alex.swoosh.Utilities.EXTRA_LEAGUE
import com.alex.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var skill = intent.getStringExtra(EXTRA_SKILL)
        var league = intent.getStringExtra(EXTRA_LEAGUE)

        searchLeagueTxt.text = "Looking for a $league $skill league near you..."
    }
}
