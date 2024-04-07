package com.example.fragment

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.Fragment_Container) as NavHostFragment
        navController = navHostFragment.navController



        binding.bottomNavigationView.setOnItemSelectedListener {



            if (it.itemId == R.id.nav_profile) {
                navController.navigate(R.id.action_fragmentFirst_to_fragmentTimer)
            } else if (it.itemId == R.id.nav_home) {
                navController.navigate(R.id.fragmentFirst)
            } else if (it.itemId == R.id.nav_search) {
                "Search"
            } else {
                "Settings"
            }


            return@setOnItemSelectedListener true
        }







    }
}