package com.example.myapplication

fun MainActivity.emailisvalid(mail:String):Boolean
{
    if(mail.isEmpty()) {
        return false
    }
    return android.util.Patterns.EMAIL_ADDRESS.matcher(mail).matches()
}