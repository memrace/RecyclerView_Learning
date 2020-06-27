package com.android.example.recyclerview_learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

	lateinit var listsRecyclerView: RecyclerView


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

// RecyclerView
		listsRecyclerView = findViewById(R.id.recyclerView)
		listsRecyclerView.layoutManager = LinearLayoutManager(this)
		listsRecyclerView.adapter = ListSelectionRecyclerViewAdapter()
		listsRecyclerView.setHasFixedSize(true)
	}
}