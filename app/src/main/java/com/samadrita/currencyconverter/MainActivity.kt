package com.samadrita.currencyconverter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.samadrita.currencyconverter.databinding.ActivityMainBinding
import com.sawolabs.androidsdk.Sawo

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.loginId.setOnClickListener {
            Sawo(
                this,
                BuildConfig.API_KEY, // your api key
                BuildConfig.API_SECRET  // your api key secret
            ).login(
                "email", // can be one of 'email' or 'phone_number_sms'
                ConversionPage::class.java.name // Callback class name
            )
        }


    }
}