package com.example.recipebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.recipebook.databinding.ChatFragmentBinding
import com.example.recipebook.viewmodel.ChatViewModel


class ChatFragment : Fragment() {


    private lateinit var viewModel: ChatViewModel
    private lateinit var binding: ChatFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.chat_fragment, container, false)
        binding.ellipse.setOnClickListener { it.findNavController().navigate(R.id.action_chatFragment_to_openedChatFragment)}
        binding.ellipse1.setOnClickListener { it.findNavController().navigate(R.id.action_chatFragment_to_openedChatFragment)}
        binding.ellipse2.setOnClickListener { it.findNavController().navigate(R.id.action_chatFragment_to_openedChatFragment)}
        binding.ellipse3.setOnClickListener { it.findNavController().navigate(R.id.action_chatFragment_to_openedChatFragment)}
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChatViewModel::class.java)

    }


}
