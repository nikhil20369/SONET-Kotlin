package com.example.kotlindemo

import android.R.attr.button
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input_result = findViewById<EditText>(R.id.input_radius)
        var btn = findViewById<Button>(R.id.btn)
        var txtview = findViewById<TextView>(R.id.txtview);

        btn.setOnClickListener(View.OnClickListener {
            // Code here executes on main thread after user presses button
            var radius :Double=input_result.text.toString().toDouble()
            val pi:Double=3.134
            var area = pi*radius*radius
            txtview.setText("Result : $area")

        })

    }
}
