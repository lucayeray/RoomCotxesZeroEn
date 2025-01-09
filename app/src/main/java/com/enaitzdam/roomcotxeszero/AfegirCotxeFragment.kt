package com.enaitzdam.roomcotxeszero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.enaitzdam.roomcotxeszero.databinding.FragmentAfegirCotxeBinding
import com.enaitzdam.roomcotxeszero.databinding.FragmentLlistatCotxesBinding


class AfegirCotxeFragment : Fragment() {
    private lateinit var binding: FragmentAfegirCotxeBinding

    //private lateinit var afegirViewModel: MotorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_afegir_cotxe, container, false
        )

        binding.buttonGoToLlistar.setOnClickListener{
            findNavController().navigate(R.id.action_afegirCotxeFragment_to_llistatCotxesFragment)
        }
        return binding.root
    }

}