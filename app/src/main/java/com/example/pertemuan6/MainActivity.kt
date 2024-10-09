package com.example.pertemuan6

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.DatePicker.OnDateChangedListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pertemuan6.databinding.ActivityMainBinding
import android.widget.TimePicker
import java.util.Calendar


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
//            Get Array
            val calendar = Calendar.getInstance()
            val hour = calendar.get(android.icu.util.Calendar.HOUR)
            val minute = calendar.get(android.icu.util.Calendar.MINUTE)

            }

//            Initiate




        var selectedTime ="${timePicker.hour}:${timePicker.minute}"
            val _tempCalendar : Calendar = Calendar.getInstance()
            _tempCalendar.timeInMillis = System.currentTimeMillis()
        val monthList = resources.getStringArray(R.array.month)
        var selectedDate = "${_tempCalendar.get(Calendar.DAY_OF_MONTH)} ${monthList[_tempCalendar.get(Calendar.MONTH)]} ${_tempCalendar.get(Calendar.YEAR)}"


//            Kehadiran Dropdown=======================================
        val kehadiranList = listOf(
            "Hadir tepat waktu",
            "terlambat",
            "Izin"
        )
        val kehadiranSpinner = resources.getStringArray(R.array.month);
        val adapterKehadiran = ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item, kehadiranList)
        kehadiranSpinner.adapter = adapterKehadiran
//            Selected Kehadiran
            kehadiranSpinner.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {

                    }
                }



        }
    }
}