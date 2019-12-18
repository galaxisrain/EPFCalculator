package com.example.epfcalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import java.util.*


class MainActivity : AppCompatActivity() {

    val c : Calendar = Calendar.getInstance();
    val mYear=c.get(Calendar.YEAR);
    val mMonth=c.get(Calendar.MONTH);
    val mDay=c.get(Calendar.DAY_OF_MONTH);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDate.setOnClickListener()
        {
            val dateTimePickerDialog=DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    textView6.setText(dayOfMonth.toString() + "-" + (monthOfYear + 1) + "-" + year)
                },mYear,mMonth,mDay
            )
            dateTimePickerDialog.show()
        }
        btnCalculate.setOnClickListener(){

            //val current=LocalDate.now()

        }
    }
    fun calculateAge(){

    }
  /*  private Period calcDiff(Date startDate,Date endDate)
    {
        DateTime START_DT = (startDate==null)?null:new DateTime(startDate);
        DateTime END_DT = (endDate==null)?null:new DateTime(endDate);

        Period period = new Period(START_DT, END_DT);

        return period;

    }*/
}
