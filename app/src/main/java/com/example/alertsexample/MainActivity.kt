package com.example.alertsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alertButton: Button = findViewById(R.id.buttonAlert)
        alertButton.setOnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this@MainActivity)
                .setTitle("Title")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("Do you really want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes") { _, _ ->
                    finish()
                }
                .setNegativeButton("No") { _, _ ->
                    Toast.makeText(this@MainActivity, "You pressed No", Toast.LENGTH_LONG).show()
                }
                .setNeutralButton("Cancel") { _, _ ->
                    Toast.makeText(this@MainActivity, "You pressed Cancel", Toast.LENGTH_LONG)
                        .show()
                }
            val alertDialog = alertDialogBuilder.create()
            alertDialog.show()
        }
    }
}