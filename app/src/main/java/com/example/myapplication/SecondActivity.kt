package com.example.myapplication

import android.app.Activity
import android.content.ClipDescription
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText

class SecondActivity:MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val call = findViewById<Button>(R.id.button2)
        val send = findViewById<Button>(R.id.button3)
        val camera = findViewById<Button>(R.id.button4)

        call.setOnClickListener {
            val tel=Intent(Intent.ACTION_DIAL)
            tel.data = Uri.parse("tel:$telephone")
            startActivity(tel)
        }
        send.setOnClickListener {
            val m=Intent(Intent.ACTION_SEND)
            m.type = ClipDescription.MIMETYPE_TEXT_PLAIN
            m.data= Uri.parse("mailto:$mail")
            m.putExtra(Intent.EXTRA_SUBJECT,"$firstname $lastname")
            m.putExtra(Intent.EXTRA_TEXT,"Hello!")
            startActivity(Intent.createChooser(m,""))
        }
        camera.setOnClickListener {
            val cam=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cam)
        }
    }
}