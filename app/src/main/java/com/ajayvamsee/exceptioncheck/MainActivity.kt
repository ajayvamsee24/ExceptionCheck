package com.ajayvamsee.exceptioncheck

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            //setContentView(R.layout.activity_main2)

        /*val button10: Button = findViewById(R.id.button_10)
        val button0: Button = findViewById(R.id.button_0)

        button10.setOnClickListener(object : View.OnClickListener() {
            override fun onClick(view: View?) {
                callMethodWithParameter(10)
            }
        })

        button0.setOnClickListener(object : View.OnClickListener() {
            override fun onClick(view: View?) {
                callMethodWithParameter(0)
            }
        })*/

    }

    private fun callMethodWithParameter(param: Int?){
        try {
            val result = 100/ param!!

        } catch (e:ArithmeticException){
            Toast.makeText(this,"Cannot divide by zero",Toast.LENGTH_LONG).show()
        }
    }


}
