package com.estevao.appaposentadoria

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.estevao.appaposentadoria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Dados do Spinner:
        val genero = listOf("Masculino", "Feminino")

        //Config do Adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genero)

        //Associa o adapter no spinner
        binding.escolha.adapter = adapter
    }
}