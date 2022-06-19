package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import java.time.temporal.TemporalAdjusters.next

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Admin"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
            R.id.delete -> {Toast.makeText(this, "DELETE", Toast.LENGTH_SHORT).show() }
            R.id.next -> {Toast.makeText(this, "NEXT", Toast.LENGTH_SHORT).show()}
            R.id.save -> {Toast.makeText(this, "SAVE", Toast.LENGTH_SHORT).show()}
            R.id.sync -> {Toast.makeText(this, "SYNC", Toast.LENGTH_SHORT).show()}
        }
        return true
    }
}