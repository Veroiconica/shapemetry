package com.cas.shapemetry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cas.shapemetry.databinding.FragmentFirstGeometricFigureBinding


class FirstGeometricFigureFragment : Fragment() {

    private var _binding: FragmentFirstGeometricFigureBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstGeometricFigureBinding.inflate(inflater, container, false)

        return binding.root
    }

}