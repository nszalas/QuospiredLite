package com.nszalas.quospiredlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.nszalas.quospiredlite.ViewModel.QuoteViewModel


class MainActivity : AppCompatActivity() {

    lateinit var viewModel: QuoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this).get(QuoteViewModel::class.java)
        setContentView(R.layout.activity_main)

        viewModel.all.observe(this, {findViewById<TextView>(R.id.textViewNow).text=it[4].toString()})

        viewModel.postAll()
    }
}