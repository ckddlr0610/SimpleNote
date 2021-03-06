package com.clean.simplenote.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.clean.simplenote.R
import com.clean.simplenote.databinding.FragmentEditBinding

class EditFragment : Fragment() {
    private lateinit var viewDataBinding: FragmentEditBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_edit,
            container,
            false
        )
        return viewDataBinding.root
    }
}