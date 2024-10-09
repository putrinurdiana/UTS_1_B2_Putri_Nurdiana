package com.example.pertemuan6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan6.databinding.ActivityIntegrasiBinding

class IntegrasiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntegrasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding =ActivityIntegrasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}