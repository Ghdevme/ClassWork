package com.example.classwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CreateNewAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_account)

        val login: Button = findViewById(R.id.logIn)
        login.setOnClickListener {

            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }

        val signupBtn: Button = findViewById(R.id.signUpButton)
        val emailEntered: EditText = findViewById(R.id.emailEditText)
        val userName: EditText = findViewById(R.id.usernameEditText)
        val passwordEntered: EditText = findViewById(R.id.passwordEditText)


        signupBtn.setOnClickListener {
            val email = emailEntered.text.toString().trim()
            val name = userName.text.toString().toString().trim()
            val password = passwordEntered.text.toString().trim()
            if (email.isNotEmpty() && name.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(
                    this,
                    "enter a valid email, username or password",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }
        }
    }
}