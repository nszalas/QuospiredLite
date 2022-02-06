package com.nszalas.quospiredlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.nszalas.quospiredlite.ViewModel.QuoteViewModel


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lateinit var viewModel: QuoteViewModel

        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(QuoteViewModel::class.java)

        //viewModel.all.observe(this, {findViewById<TextView>(R.id.textViewNow).text=it[75].toString()})

        viewModel.postAll()

    }
}