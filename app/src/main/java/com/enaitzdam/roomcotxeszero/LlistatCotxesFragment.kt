package com.enaitzdam.roomcotxeszero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.enaitzdam.roomcotxeszero.databinding.FragmentLlistatCotxesBinding


class LlistatCotxesFragment : Fragment() {

    private lateinit var binding: FragmentLlistatCotxesBinding

    //private lateinit var llistarViewModel: MotorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_llistat_cotxes, container, false
        )

        binding.buttonTornar.setOnClickListener {
            findNavController().navigate(R.id.action_llistatCotxesFragment_to_afegirCotxeFragment)
        }
        return binding.root
    }
}