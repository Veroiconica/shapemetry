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
import com.cas.shapemetry.databinding.FragmentRegisterBinding
import com.cas.shapemetry.databinding.FragmentSplashScreenBinding

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Obtener la referencia al TextView
        val tvPregunta = binding.tvPregunta

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