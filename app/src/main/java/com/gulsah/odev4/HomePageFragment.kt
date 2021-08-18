package com.gulsah.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.gulsah.odev4.databinding.FragmentBBinding
import com.gulsah.odev4.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {

    private lateinit var binding: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_page, container, false)

        binding.buttonA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.homepage_to_a)
        }
        binding.buttonX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.homepage_to_x)
        }
        return binding.root
    }
}