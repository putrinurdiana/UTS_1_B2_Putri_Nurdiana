package com.example.pertemuan6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan6.databinding.ActivityProfilePenggunaBinding

class ProfilePengguna : AppCompatActivity() {

    private lateinit var binding: ActivityProfilePenggunaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding =ActivityProfilePenggunaBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}