package com.example.classwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        val forgotPasswordBtn: Button = findViewById(R.id.forgottenPassword)
        forgotPasswordBtn.setOnClickListener {
            val i = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(i)
        }

        val loginBtn: Button = findViewById(R.id.loginButton)
        val userNameEntered: EditText = findViewById(R.id.username)
        val passwordEntered: EditText = findViewById(R.id.password)

        loginBtn.setOnClickListener {
            val username = userNameEntered.text.toString().trim()
            val password = passwordEntered.text.toString().trim()
            if (username.isNotEmpty() && password.isNotEmpty()) {
                    val intent=Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        this,
                            "enter a valid username or password",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                }

            }
        }

