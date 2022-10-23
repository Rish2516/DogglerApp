package com.example.dogglers
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglers.adapter.DogCardAdapter
import com.example.dogglers.constant.Layout
import com.example.dogglers.databinding.ActivityGridListBinding

class GridList : AppCompatActivity() {
    private lateinit var binding: ActivityGridListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )
        binding.gridRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}