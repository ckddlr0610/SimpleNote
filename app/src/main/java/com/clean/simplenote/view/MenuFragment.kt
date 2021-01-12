package com.clean.simplenote.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.clean.simplenote.R
import com.clean.simplenote.adapter.MenuAdapter
import com.clean.simplenote.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    private lateinit var viewDataBinding: FragmentMenuBinding
    //TODO: fix to Inject Model
    private val viewModel: MenuViewModel = MenuViewModel()
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
        observeLiveData()
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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