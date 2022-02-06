package com.nszalas.quospiredlite.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.nszalas.quospiredlite.R
import com.nszalas.quospiredlite.ViewModel.QuoteViewModel
import kotlinx.android.synthetic.main.fragment_quote_layout.view.*

class QuoteLayout : Fragment() {

    private lateinit var viewModel: QuoteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_quote_layout,container,false)
        // Inflate the layout for this fragment


        viewModel = ViewModelProvider(this).get(QuoteViewModel::class.java)

        viewModel.all.observe(viewLifecycleOwner,{quote -> view.findViewById<TextView>(R.id.QuoteLayoutTextViewQuote).setText("ja")})

        viewModel.postAll()

        //binding.button.setOnClickListener { viewModel.getWeather(view.findViewById<SearchView>(R.id.searchView).getQuery().toString())


        return view
    }



}