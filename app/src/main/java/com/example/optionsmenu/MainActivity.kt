package com.example.optionsmenu

import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.Menu
import android.view.MenuItem
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


    }

        override fun onCreateOptionsMenu(menu: Menu): Boolean {
// Inflate the menu to use in the action bar
            val inflater = menuInflater
            inflater.inflate(R.menu.my_first_menu, menu)
            return super.onCreateOptionsMenu(menu)
        }
        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.item1 -> Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
                R.id.item2 -> Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show()
                R.id.subitem1 -> Toast.makeText(this, "Sub-item 1 selected", Toast.LENGTH_SHORT)
                    .show()
            }
            return true;
        }



    }

