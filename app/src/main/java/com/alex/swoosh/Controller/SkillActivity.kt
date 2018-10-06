package com.alex.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.alex.swoosh.Model.Player
import com.alex.swoosh.R
import com.alex.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    // Creating a lateinit var with type of our Parcelable class "Player"
    lateinit var player : Player

    // Save the instance of Parcelable class Player in order to pass it to another activity
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    // onCreate() saves all UI element's IDs and use it for creating
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        // Getting intent message from LeagueActivity
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    // Pass savedInstanceState to the activity in Portrait or Landscape mode depends on the orientation
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onBeginnerSkillBtnClicked(view: View){
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerSkillBtnClicked(view: View){
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    // By clicking on finishBtn intent sent to the finish activity. Implemented Toast. putExtra() implemented.
    fun onFinishSkillBtnClicked(view: View){
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }
}
