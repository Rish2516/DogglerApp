package com.example.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.vertical.setOnClickListener{(vertical())}
        binding.horizontal.setOnClickListener{(horizontal())}
        binding.grid.setOnClickListener { (grid()) }
    }

    private fun grid() {
        listIntent = Intent(this, GridList::class.java)
        startActivity(listIntent)
    }

    private fun horizontal() {
        listIntent= Intent(this, HorizontalList::class.java)
        startActivity(listIntent)
    }

    private fun vertical() {
        listIntent=Intent(this, VerticalList::class.java)
        startActivity(listIntent)
    }
}