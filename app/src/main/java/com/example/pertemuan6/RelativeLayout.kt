package com.example.pertemuan6

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan6.databinding.ActivityRelativeLayoutBinding

class RelativeLayout : AppCompatActivity() {
    private lateinit var binding: ActivityRelativeLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding.tombolSubmit.setOnClickListener {
            showConfirmationDialog()
        }
        binding.tombolCancel.setOnClickListener {
            Confirmationinput()
        }

        binding =ActivityRelativeLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }






    }

    private fun showConfirmationDialog() {
        if (isSubmitValid()) {
            val resultIntent = Intent(this@RelativeLayout, ProfilePengguna::class.java).apply {
                putExtra("Name", binding.textName.text.toString())
            }
            startActivity(resultIntent)
            finish()
        } else {
            // Show a message to the user about invalid time
            AlertDialog.Builder(this)
                .setMessage("Enter your name first.")
                .setPositiveButton("OK", null)
                .show()
        }
    }

    private fun isSubmitValid(): Boolean {

    }
}