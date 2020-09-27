package com.trining.customcalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    var calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dayNameMonthddate = findViewById<TextView>(R.id.day_name_month_date_tv)
        val year = findViewById<TextView>(R.id.year_tv)

        dayNameMonthddate.setText(getDayNameMonthDate())
        year.setText(getYear())

    }

    private fun getDayNameMonthDate():String
    {
        val sdf = SimpleDateFormat("MMMM dd")
        val monthDate = sdf.format(Date())

        val date = calendar.getTime()
        val dayFormat = SimpleDateFormat("EEEE", Locale.US)
        val dayName = dayFormat.format(date)
        return dayName+", "+monthDate
    }

    private fun getYear():String{
        val sdf = SimpleDateFormat("yyyy")
        val year = sdf.format(Date())
        return year
    }
}