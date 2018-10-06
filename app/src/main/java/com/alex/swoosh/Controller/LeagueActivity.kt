package com.alex.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.alex.swoosh.Model.Player
import com.alex.swoosh.R
import com.alex.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

// Extends BaseActivity class wich has Log.d()
class LeagueActivity : BaseActivity() {

    // Create an Instance of Parcelable Player class in order to send data from one activity to another
    // In our case this class will hold 'league' and 'skill' variables
    var player = Player("", "")

    // Save the instance of Parcelable class Player in order to pass it to another activity
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    // onCreate() saves all UI element's IDs and use it for creating
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    // Pass savedInstanceState to the activity in Portrait or Landscape mode depends on the orientation
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    // Toggle button check if selected or not
    fun onMensLeagueBtnClicked(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "mens"
    }

    // Toggle button check if selected or not
    fun onWomensLeagueBtnClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league ="womens"
    }

    // Toggle button check if selected or not
    fun onCoedLeagueBtnClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        player.league = "co-ed"
    }


    // By clicking on nextBtn intent sent to the Skill Activity. Implemented Toast. putExtra() implemented.
    fun leagueNextBtnClicked(view: View){
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}
