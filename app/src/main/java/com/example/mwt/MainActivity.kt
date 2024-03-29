package com.example.mwt

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.mwt.fragments.bmi.BMIFragment
import com.example.mwt.fragments.drinkingstatistics.DrinkingStatisticsFragment
import com.example.mwt.fragments.goals.GoalsFragment
import com.example.mwt.fragments.information.InformationFragment
import com.example.mwt.fragments.settings.SettingsFragment
import com.example.mwt.fragments.trackerLog.TrackerMainPage
import com.example.mwt.util.ACTIVITY_SELECTION_NOTIFICATION
import com.example.mwt.util.ACTIVITY_SELECTION_NOTIFICATION_ACHIEVEMENT
import com.example.mwt.util.ACTIVITY_SELECTION_NOTIFICATION_BMI
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        val fragment = when (intent.getStringExtra(ACTIVITY_SELECTION_NOTIFICATION)) {
            ACTIVITY_SELECTION_NOTIFICATION_ACHIEVEMENT -> {
                toolbar.title = getString(R.string.goals)
                GoalsFragment()
            }
            ACTIVITY_SELECTION_NOTIFICATION_BMI -> {
                toolbar.title = getString(R.string.bmi)
                BMIFragment()
            }
            else -> {
                toolbar.title = getString(R.string.water_tracker)
                TrackerMainPage()
            }
        }
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_place_holder, fragment)
                .commit()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    private fun displayFragment(id: Int) {
        val fragment = when (id) {
            R.id.nav_tracker -> {
                toolbar.title = getString(R.string.water_tracker)
                TrackerMainPage()
            }
            R.id.nav_statistics -> {
                toolbar.title = getString(R.string.drinking_statistics)
                DrinkingStatisticsFragment()
            }
            R.id.nav_goals -> {
                toolbar.title = getString(R.string.goals)
                GoalsFragment()
            }
            R.id.nav_bmi -> {
                toolbar.title = getString(R.string.bmi)
                BMIFragment()
            }
            R.id.nav_settings -> {
                toolbar.title = getString(R.string.settings)
                SettingsFragment()
            }
            R.id.nav_information -> {
                toolbar.title = getString(R.string.info)
                InformationFragment()
            }
            else -> return
        }

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_place_holder, fragment)
                .commit()
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        displayFragment(item.itemId)
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}
