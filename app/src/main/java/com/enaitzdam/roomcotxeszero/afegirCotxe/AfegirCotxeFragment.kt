package com.enaitzdam.roomcotxeszero.afegirCotxe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.enaitzdam.roomcotxeszero.R
import com.enaitzdam.roomcotxeszero.databinding.FragmentAfegirCotxeBinding


class AfegirCotxeFragment : Fragment() {
    private lateinit var binding: FragmentAfegirCotxeBinding

    private lateinit var afegirCotxeViewmodel:afegirCotxeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_afegir_cotxe, container, false
        )
        afegirCotxeViewmodel = ViewModelProvider(this).get(afegirCotxeViewModel::class.java)

        binding.buttonInsert.setOnClickListener{
            var marca=binding.editTextMarca.text.toString()
            var any = binding.editTextAny.text.toString().toIntOrNull()
            var combustible=binding.editTextCombustible.text.toString()
            var cavalls = binding.editTextCavalls.text.toString().toIntOrNull()
            if (any != null) {
                if (cavalls != null) {
                    afegirCotxeViewmodel.nouCotxe(requireContext(),any,combustible,marca,cavalls)
                }
            }
        }
        binding.buttonGoToLlistar.setOnClickListener{
            findNavController().navigate(R.id.action_afegirCotxeFragment_to_llistatCotxesFragment)
        }
        return binding.root
    }

}