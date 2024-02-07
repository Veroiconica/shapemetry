package com.cas.shapemetry

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RegisterFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Obtener la referencia al TextView
        val tvPregunta = view.findViewById<TextView>(R.id.tvPregunta)

        // Obtener el texto del TextView
        val textoCompleto = tvPregunta.text.toString()

        // Dividir el texto en palabras
        val palabras = textoCompleto.split(" ")

        // Crear un SpannableString para el texto completo
        val spannableString = SpannableString(textoCompleto)

        // Definir colores para cada palabra
        val colores = listOf(Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW)

        // Aplicar un color diferente a cada palabra
        for (i in palabras.indices) {
            val colorIndex = i % colores.size
            val color = colores[colorIndex]
            val start = textoCompleto.indexOf(palabras[i])
            val end = start + palabras[i].length
            spannableString.setSpan(ForegroundColorSpan(color), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        // Establecer el SpannableString con colores en el TextView
        tvPregunta.text = spannableString
    }

}