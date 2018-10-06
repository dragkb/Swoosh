package com.alex.swoosh.Controller

import android.os.Bundle
import com.alex.swoosh.Model.Player
import com.alex.swoosh.R
import com.alex.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueTxt.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
