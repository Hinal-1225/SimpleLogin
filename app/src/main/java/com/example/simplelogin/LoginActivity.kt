package com.example.simplelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var userName: TextInputEditText =findViewById(R.id.edtUsername)
        var password: TextInputEditText =findViewById(R.id.edtPassword)
        var button: Button =findViewById(R.id.btnLogin)
        button.setOnClickListener {
            var user=userName.text.toString()
            var pass=password.text.toString()
            if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
            {
                Toast.makeText(applicationContext,
                    "Please Enter Username/Password",
                    Toast.LENGTH_LONG).show()
            }
            else
            {
                    var intent= Intent(applicationContext,WelcomeActivity::class.java)
                    startActivity(intent)
                    finish()
            }
        }
    }
}