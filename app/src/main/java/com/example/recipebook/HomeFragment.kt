package com.example.recipebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.recipebook.databinding.HomeFragmentBinding
import com.example.recipebook.viewmodel.HomeViewModel


class HomeFragment : Fragment() {

    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false)
        binding.chats.setOnClickListener {it.findNavController().navigate(R.id.action_homeFragment_to_chatFragment)}
        binding.networks.setOnClickListener {it.findNavController().navigate(R.id.action_homeFragment_to_networkFragment)}
        binding.friends.setOnClickListener {it.findNavController().navigate(R.id.action_homeFragment_to_friendsFragment)}
        binding.receipe.setOnClickListener{it.findNavController().navigate(R.id.action_homeFragment_to_favouriteFragment)}
        binding.favourites.setOnClickListener{it.findNavController().navigate(R.id.action_homeFragment_to_favouriteFragment)}
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

    }

}
