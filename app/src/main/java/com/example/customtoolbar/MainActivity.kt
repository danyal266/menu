package com.example.customtoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        supportActionBar?.hide()
//       setActionBar(toolbar_activity as Toolbar?)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.new_group-> Toast.makeText(this, "Cliked the New Group.", Toast.LENGTH_SHORT).show()
                R.id.news-> Toast.makeText(this, "Whatsweb was Cliked", Toast.LENGTH_SHORT).show()
        }

        return true
    }
}