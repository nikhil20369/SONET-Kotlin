package com.example.loops

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

        val input = findViewById<EditText>(R.id.input_num)
        val btn = findViewById<Button>(R.id.btn)
        val result = findViewById<TextView>(R.id.txt_view);

        btn.setOnClickListener(View.OnClickListener {
                // Code here executes on main thread after user presses button
            val num:Int =  input.text.toString().toInt()
            var i:Int=1
            var s:String=""
            while (true){
                if (num==i){
                    break;
                }
                s+="@$i";
                ++i;
            }
            result.setText(s)


        })

    }
}