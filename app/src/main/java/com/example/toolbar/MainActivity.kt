package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            android.R.id.home -> finish()
            R.id.save ->{
                Toast.makeText(this, "SAVE", Toast.LENGTH_SHORT).show()
            }
            R.id.delete ->{
                Toast.makeText(this, "DELETE", Toast.LENGTH_SHORT).show()
            }
            R.id.search ->{
                Toast.makeText(this, "SEARCH", Toast.LENGTH_SHORT).show()
            }
            R.id.sync ->{
                Toast.makeText(this, "SYNC", Toast.LENGTH_SHORT).show()
            }
        }

        return true
    }
}