package com.gulsah.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.gulsah.odev4.databinding.FragmentYBinding

class YFragment : Fragment() {

    private lateinit var binding: FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_y, container, false)
        binding.buttonHomePage.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.y_to_homepage)
        }
        return binding.root
    }
}