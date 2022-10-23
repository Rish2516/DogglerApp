package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.constant.Layout
import com.example.dogglers.databinding.ActivityVerticalListBinding

class VerticalList : AppCompatActivity() {
    private lateinit var binding: ActivityVerticalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter= DogCardAdapter(
            applicationContext,
            Layout.VERTICAL
        )
        binding.verticalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}