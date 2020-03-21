package com.example.recipebook

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.recipebook.databinding.NetworkFragmentBinding
import com.example.recipebook.viewmodel.NetworkViewModel


class NetworkFragment : Fragment() {


    private lateinit var viewModel: NetworkViewModel
    private lateinit var binding: NetworkFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.network_fragment, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter = context?.let { GridAdapter(it, getImage(), getTitle()) }
        binding.gridview.adapter = adapter
        viewModel = ViewModelProvider(this).get(NetworkViewModel::class.java)

    }

    fun getImage(): Array<Int> {
        val imagedra =  arrayOf<Int>(R.drawable.avi, R.drawable.avi1, R.drawable.avi2, R.drawable.avi3)
        return imagedra
    }

    fun getTitle(): Array<String> {
        val imagetitle =  arrayOf<String>("Pepper Soup Group", "Pastry and baking ", "Africa dishes and home made delicacies", "Continental and foreign dishes ")
        return imagetitle
    }

}
