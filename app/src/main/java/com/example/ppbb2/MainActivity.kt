package com.example.ppbb2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ppbb2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {

            // Login
            val username = "user1"
            val password = "pass1"

            btnGetText.setOnClickListener {
                val userValue = edtUser.text.toString()
                val passValue = edtPass.text.toString()

                if (userValue == username && passValue == password) {
                    Toast.makeText(
                        this@MainActivity,
                        "Login sukses",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                else {
                    Toast.makeText(
                        this@MainActivity,
                        "Kredensial salah",
                        Toast.LENGTH_SHORT
                    ).show()
                }

            }
        }
    }
}