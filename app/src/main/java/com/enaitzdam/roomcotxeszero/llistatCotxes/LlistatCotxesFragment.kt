package com.enaitzdam.roomcotxeszero.llistatCotxes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.enaitzdam.roomcotxeszero.R
import com.enaitzdam.roomcotxeszero.afegirCotxe.afegirCotxeViewModel
import com.enaitzdam.roomcotxeszero.data.Cotxe
import com.enaitzdam.roomcotxeszero.databinding.FragmentLlistatCotxesBinding


class LlistatCotxesFragment : Fragment() {

    private lateinit var binding: FragmentLlistatCotxesBinding

    private lateinit var llistarViewModel: llistarCotxesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_llistat_cotxes, container, false
        )

        llistarViewModel = ViewModelProvider(this).get(llistarCotxesViewModel::class.java)
        llistarViewModel.llistar_cotxes(requireContext())
        binding.recyclerViewCotxes.layoutManager = LinearLayoutManager(requireContext())

        llistarViewModel.llistat_cotxes?.observe(viewLifecycleOwner, Observer { cotxesLlistat ->
            binding.recyclerViewCotxes.adapter = CotxesAdapter(cotxesLlistat)
        })


        binding.buttonTornar.setOnClickListener {
            findNavController().navigate(R.id.action_llistatCotxesFragment_to_afegirCotxeFragment)
        }
        return binding.root
    }
}