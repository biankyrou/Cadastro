package com.example.cadastro

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
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

        amb.limparBt.setOnClickListener {
            amb.inputNameEt.text.clear()
            amb.inputEmailEt.text.clear()
            amb.inputEmailEt.text.clear()
            amb.emailCb.isChecked = false
            amb.masculinoRb.isChecked = false
            amb.femininoRb.isChecked = false
            amb.cidadeEt.text.clear()
            amb.ufSpinner.setSelection(0)

        Toast.makeText(
            this@MainActivity, "Formulário limpo!",
            Toast.LENGTH_SHORT
        ).show()
        }

        amb.salvarBt.setOnClickListener{
            var response_form = Form(amb.inputNameEt.text.toString(), amb.inputTelEt.text.toString(), amb.inputEmailEt.text.toString(),
                amb.emailCb.isChecked, amb.sexoRadioGroup.toString(), amb.cidadeEt.text.toString(), amb.ufSpinner.toString())

            Toast.makeText(this@MainActivity, "Formulário salvo com sucesso! $response_form", Toast.LENGTH_SHORT).show()
        }
    }
}
