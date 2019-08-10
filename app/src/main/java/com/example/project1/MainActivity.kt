package com.example.project1

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*
class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        title = "परिचय"
        pdfView.fromAsset("parichey.pdf").load()

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )

        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }






    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_page1 -> {
                title = "वृद्धावस्था और पोषण"
                pdfView.fromAsset("posan.pdf").load()
            }
            R.id.nav_page2 -> {
                title = "व्यायाम"
                pdfView.fromAsset("vyayaam1.pdf").load()
            }
            R.id.nav_page3 -> {
                title = "शैयाग्रस्त रोगियों को देखभाल"
                pdfView.fromAsset("bedsick.pdf").load()
            }
            R.id.nav_page4 -> {
                title = "दैनन्दिन क्रियाओं हेतु सुझाव"
                pdfView.fromAsset("advice.pdf").load()
            }
            R.id.nav_page5 -> {
                title = "देखभालकर्ता को समस्याएं"
                pdfView.fromAsset("dekhbhal krtaon ki samasyan.pdf").load()
            }
            R.id.nav_page6 -> {
                title = "स्वस्थ वृद्धावस्था"
                pdfView.fromAsset("svast bhrasdhastha.pdf").load()
            }
            R.id.nav_about->{
                title = "परिचय"
                pdfView.fromAsset("parichey.pdf").load()
            }
            R.id.nav_contact->{
                title = "संपर्क करें"
                pdfView.fromAsset("about us.pdf").load()
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

}
