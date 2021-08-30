package com.samadrita.currencyconverter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var usd : Button
    lateinit var eur: Button
    lateinit var cny : Button
    lateinit var aed : Button
    lateinit var gbp : Button
    lateinit var bdt : Button
    lateinit var cad : Button
    lateinit var thai : Button
    lateinit var sgd : Button
    lateinit var jpy : Button

    lateinit var currencyFrom : EditText
    lateinit var currencyTo : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usd = findViewById(R.id.usd)
        eur = findViewById(R.id.eur)
        cny = findViewById(R.id.cny)
        aed = findViewById(R.id.aed)
        gbp = findViewById(R.id.gbp)
        bdt = findViewById(R.id.bdt)
        cad = findViewById(R.id.cad)
        thai = findViewById(R.id.thai)
        sgd = findViewById(R.id.sgd)
        jpy = findViewById(R.id.jpy)


        lateinit var currencyFrom : EditText
        lateinit var currencyTo : TextView

        usd.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*73.50
            currencyTo.setText(amount.toString())
        }

        eur.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*86.69
            currencyTo.setText(amount.toString())
        }

        cny.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*11.36
            currencyTo.setText(amount.toString())
        }

        aed.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*20.01
            currencyTo.setText(amount.toString())
        }

        gbp.setOnClickListener{
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*101.15
            currencyTo.setText(amount.toString())
        }

        bdt.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*0.86
            currencyTo.setText(amount.toString())
        }

        cad.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*58.23
            currencyTo.setText(amount.toString())
        }

        thai.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*2.26
            currencyTo.setText(amount.toString())
        }

        sgd.setOnClickListener{
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*54.60
            currencyTo.setText(amount.toString())
        }

        jpy.setOnClickListener {
            currencyFrom = findViewById(R.id.currencyFrom)
            currencyTo = findViewById(R.id.currencyTo)

            var amount = currencyFrom.text.toString().toDouble()*0.67
            currencyTo.setText(amount.toString())
        }
    }
}