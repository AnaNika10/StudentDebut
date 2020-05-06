package com.example.studentdebut

import android.content.Context
import android.speech.RecognitionListener
import android.view.View
import android.view.animation.Animation
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

internal class ProgressButton(private val ct: Context, view: View) {

    private val cardView: CardView
    private val layout: ConstraintLayout
    private val progressBar: ProgressBar
    private val textView: TextView
    var fade_in: Animation? = null
    fun buttonActivated() {
        progressBar.visibility = View.VISIBLE
        textView.text = "Molimo sacekajte..."
    }

    fun buttonFinished() {
        //layout.setBackgroundColor(cardView.resources.getColor(R.color.colorPrimary))
        layout.setBackgroundColor(ContextCompat.getColor(ct, R.color.colorPrimary))
        progressBar.visibility = View.GONE
        //textView.text = "Gotovo"
        textView.text = "Primeni filtere"
    }

    init {
        cardView = view.findViewById(R.id.cardView)
        layout = view.findViewById(R.id.constraint_layout)
        progressBar = view.findViewById(R.id.progressBar)
        textView = view.findViewById(R.id.textView)
    }
}