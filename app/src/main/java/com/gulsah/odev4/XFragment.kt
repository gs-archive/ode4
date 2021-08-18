package com.gulsah.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.gulsah.odev4.databinding.FragmentXBinding

class XFragment : Fragment() {

    private lateinit var binding: FragmentXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_x, container, false)
        binding.buttonY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.x_to_y)

        }
        return binding.root
    }
}