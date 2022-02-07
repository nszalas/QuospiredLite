package com.nszalas.quospiredlite.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.nszalas.quospiredlite.R


class WelcomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome_screen, container, false)

        view.findViewById<Button>(R.id.WelcomeScreenDrawQuoteButton).setOnClickListener {
            view.findNavController().navigate(R.id.action_welcomeScreen_to_quoteLayout)
        }

        return view
    }


}