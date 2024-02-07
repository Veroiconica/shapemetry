package com.cas.shapemetry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a new instance of the BlankFragment
        val blankFragment = SplashScreenFragment()

        // Begin the transaction
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        // Add the BlankFragment on top of the MainActivity
        fragmentTransaction.add(android.R.id.content, blankFragment)
        fragmentTransaction.addToBackStack(null) // Add to back stack, so it can be removed later

        // Commit the transaction
        fragmentTransaction.commit()
    }
}