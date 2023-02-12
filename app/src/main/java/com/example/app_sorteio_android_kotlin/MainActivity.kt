package com.example.app_sorteio_android_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    val random = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_jogar = findViewById<Button>(R.id.btn_jogar)
        val text_result = findViewById<TextView>(R.id.text_resultado)
    btn_jogar.setOnClickListener(){
        text_result.text = rand(10,0).toString()
    }
    }

    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(11)
    }
}