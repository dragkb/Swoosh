package com.alex.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.alex.swoosh.Utilities.EXTRA_LEAGUE
import com.alex.swoosh.R
import com.alex.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    // creating a var for holding intent message
    var league = ""
    // creating a var for passing it to the intent
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        // Getting intent message from LeagueActivity
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerSkillBtnClicked(view: View){
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerSkillBtnClicked(view: View){
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }

    // By clicking on finishBtn intent sent to the finish activity. Implemented Toast. putExtra() implemented.
    fun onFinishSkillBtnClicked(view: View){
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }
}
