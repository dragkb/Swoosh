package com.alex.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.alex.swoosh.Utilities.EXTRA_LEAGUE
import com.alex.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

// Extends BaseActivity class wich has Log.d()
class LeagueActivity : BaseActivity() {

    // Creating a var for holding toggle button state
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    // Toggle button check if selected or not
    fun onMensLeagueBtnClicked(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "mens"
    }

    // Toggle button check if selected or not
    fun onWomensLeagueBtnClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague ="womens"
    }

    // Toggle button check if selected or not
    fun onCoedLeagueBtnClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        selectedLeague = "co-ed"
    }


    // By clicking on nextBtn intent sent to the Skill Activity. Implemented Toast. putExtra() implemented.
    fun leagueNextBtnClicked(view: View){
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}
