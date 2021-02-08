package com.example.homecontrol_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_view)

        val addNewTag : FloatingActionButton = findViewById(R.id.addTag)
        addNewTag.setOnClickListener {
            val intent = Intent(this, Add_new_Tag::class.java)
            startActivity(intent)
        }
    }
}