package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doAfterTextChanged

var firstname="";
var lastname=""
var telephone=""
var mail=""

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fname=findViewById<EditText>(R.id.editTextTextPersonName)
        val lname=findViewById<EditText>(R.id.editTextTextPersonName2)
        val phone=findViewById<EditText>(R.id.editTextPhone)
        val email=findViewById<EditText>(R.id.editTextTextEmailAddress)
        val signin=findViewById<Button>(R.id.button)
        signin.setOnClickListener {
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        fname.doAfterTextChanged {
            if(fname.text.isNotEmpty()&&lname.text.isNotEmpty()&&phone.text.isNotEmpty()&&emailisvalid(email.text.toString()))
                signin.isEnabled=true
            else if(fname.text.isEmpty())
                fname.error = "Enter name"
            firstname=fname.text.toString()
        }
        lname.doAfterTextChanged {
            if(fname.text.isNotEmpty()&&lname.text.isNotEmpty()&&phone.text.isNotEmpty()&&emailisvalid(email.text.toString()))
                signin.isEnabled=true
            else if(lname.text.isEmpty())
                lname.error="Enter last name"
            lastname=lname.text.toString()
        }
        phone.doAfterTextChanged {
            if(fname.text.isNotEmpty()&&lname.text.isNotEmpty()&&phone.text.isNotEmpty()&&emailisvalid(email.text.toString()))
                signin.isEnabled=true
            else if(phone.text.isEmpty())
                phone.error="Enter phone"
            telephone=phone.text.toString()
        }
        email.doAfterTextChanged {
            if(fname.text.isNotEmpty()&&lname.text.isNotEmpty()&&phone.text.isNotEmpty()&&emailisvalid(email.text.toString()))
                signin.isEnabled=true
            else if(email.text.isEmpty())
                email.error = "Enter email address"
            else email.error="Invalid email address!"
            mail=email.text.toString()
        }
    }
}