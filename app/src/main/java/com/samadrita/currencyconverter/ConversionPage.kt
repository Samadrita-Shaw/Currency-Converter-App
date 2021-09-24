package com.samadrita.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.samadrita.currencyconverter.databinding.ActivityConversionPageBinding
import com.samadrita.currencyconverter.databinding.ActivityMainBinding

class ConversionPage : AppCompatActivity() {
    lateinit var binding : ActivityConversionPageBinding

    lateinit var currencyFrom : EditText
    lateinit var currencyTo : TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityConversionPageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion_page)
        setContentView(binding.root)

        lateinit var currencyFrom : EditText
        lateinit var currencyTo : TextView

        binding.usd.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*73.87
            currencyTo.setText(amount.toString())
        }

        binding.eur.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*86.65
            currencyTo.setText(amount.toString())
        }

        binding.cny.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*11.44
            currencyTo.setText(amount.toString())
        }

        binding.aed.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*20.11
            currencyTo.setText(amount.toString())
        }

        binding.gbp.setOnClickListener{
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*101.35
            currencyTo.setText(amount.toString())
        }

        binding.bdt.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*0.86
            currencyTo.setText(amount.toString())
        }

        binding.cad.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*58.35
            currencyTo.setText(amount.toString())
        }

        binding.thai.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*2.21
            currencyTo.setText(amount.toString())
        }

        binding.sgd.setOnClickListener{
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*54.72
            currencyTo.setText(amount.toString())
        }

        binding.jpy.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*0.67
            currencyTo.setText(amount.toString())
        }
    }
}