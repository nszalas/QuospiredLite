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

        val view = inflater.inflate(R.layout.fragment_welcome_screen, container, false)
        return view
    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.WelcomeScreenDrawQuote).setOnClickListener {
            view.findNavController().navigate(activity, R.id.action_welcomeScreen_to_blankFragment)
        }
    }*/


}