package com.example.labgessy

import android.os.Bundle
import android.view.View
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.ViewCompat
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val questionView = findViewById<View>(R.id.question)
        val reponseView = findViewById<View>(R.id.reponse)

        questionView.setOnClickListener {
            questionView.visibility = View.INVISIBLE
            reponseView.visibility = View.VISIBLE
        }

        reponseView.setOnClickListener{
            reponseView.visibility = View.INVISIBLE
            questionView.visibility = View.VISIBLE
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}