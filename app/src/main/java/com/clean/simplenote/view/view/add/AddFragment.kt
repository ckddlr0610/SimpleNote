package com.clean.simplenote.view.view.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.clean.simplenote.R
import com.clean.simplenote.databinding.FragmentAddBinding
import com.clean.simplenote.view.model.Memo
import java.util.*

class AddFragment : Fragment() {
    private lateinit var viewDataBinding: FragmentAddBinding
    private var adapter: AddAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_add,
            container,
            false
        )
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (adapter == null) {
            adapter = AddAdapter(
                listOf(
                    Memo(
                        0,
                        "title",
                        "content",
                        Date()
                    )
                )
            )
        }

        viewDataBinding.rvMemo.adapter = adapter
    }
}