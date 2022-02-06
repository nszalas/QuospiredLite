package com.nszalas.quospiredlite.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.nszalas.quospiredlite.R
import com.nszalas.quospiredlite.ViewModel.QuoteViewModel
import kotlinx.android.synthetic.main.fragment_quote_layout.view.*
import kotlin.random.Random

class QuoteLayout : Fragment() {

    private lateinit var viewModel: QuoteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_quote_layout,container,false)
        // Inflate the layout for this fragment


        viewModel = ViewModelProvider(this).get(QuoteViewModel::class.java)


        var n = Random.nextInt(0, 1600)

        viewModel.all.observe(viewLifecycleOwner,{quote -> view.findViewById<TextView>(R.id.QuoteLayoutTextViewQuote).setText(quote[n].text.toString())})
        viewModel.all.observe(viewLifecycleOwner,{quote -> view.findViewById<TextView>(R.id.QuoteLayoutTextViewAuthor).setText(quote[n].author.toString())})

        viewModel.postAll()



        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.QuoteLayoutNextButton).setOnClickListener {
            var z = Random.nextInt(0, 1600)

            viewModel.all.observe(viewLifecycleOwner,{quote -> view.findViewById<TextView>(R.id.QuoteLayoutTextViewQuote).setText(quote[z].text.toString())})
            viewModel.all.observe(viewLifecycleOwner,{quote -> view.findViewById<TextView>(R.id.QuoteLayoutTextViewAuthor).setText(quote[z].author.toString())})


        }

    }



}