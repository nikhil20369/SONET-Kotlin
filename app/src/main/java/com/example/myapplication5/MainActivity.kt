package com.example.myapplication5

import android.R.attr.button
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<EditText>(R.id.et_1)
        val num2 = findViewById<EditText>(R.id.et_2)
        val spn = findViewById<Spinner>(R.id.spinner4)
        val btn = findViewById<Button>(R.id.btn_1)
        val res = findViewById<TextView>(R.id.tv_1);
        btn.setOnClickListener(View.OnClickListener {
            val a:Float=num1.text.toString().toFloat()
            val b:Float=num2.text.toString().toFloat()
            val s=spn.selectedItem.toString()
            when(s){
                "+" -> res.text = ("result: " + add(a,b))
                "-" -> res.text = ("result: " + sub(a,b))
                "*" -> res.text = ("result: " + mul(a,b))
                "/" -> res.text = ("result: " + div(a,b))
                "%" -> res.text = ("result: " + mod(a,b))

            }

        })
    }
    fun add(a:Float,b:Float):Float=a+b
    fun sub(a:Float,b:Float):Float=a-b
    fun mul(a:Float,b:Float):Float=a*b
    fun div(a:Float,b:Float):Float=a/b
    fun mod(a:Float,b:Float):Float=a%b



}