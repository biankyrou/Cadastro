package com.example.cadastro

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        val ufs = resources.getStringArray(R.array.uf_lista)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, ufs)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        amb.ufSpinner.adapter = adapter
    }
}