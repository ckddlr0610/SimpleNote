package com.clean.simplenote.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.clean.simplenote.R
import com.clean.simplenote.adapter.MenuAdapter
import com.clean.simplenote.databinding.FragmentMenuBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MenuFragment : Fragment() {
    private lateinit var viewDataBinding: FragmentMenuBinding
    private val viewModel: MenuViewModel by activityViewModels()
    private val adapter = MenuAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_menu,
            container,
            false
        )
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeLiveData()
        with(viewDataBinding) {
            rvMenuFragment.adapter = adapter
        }
        viewModel.fetchCategory()
    }

    private fun observeLiveData() {
        with(viewModel){
            categories.observe(viewLifecycleOwner, Observer { categories ->
                adapter.submitList(categories)
            })
        }
    }
}