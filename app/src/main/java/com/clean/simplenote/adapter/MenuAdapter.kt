package com.clean.simplenote.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.clean.simplenote.R
import com.clean.simplenote.databinding.ItemCategoryBinding
import com.clean.simplenote.model.CategoryUiModel

//FIXME: 주입받지 않고 생성자에서 그대로 diffCallback을 정의할 수는 없을까
class MenuAdapter :
    ListAdapter<CategoryUiModel, RecyclerView.ViewHolder>(MenuDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MenuViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_category,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MenuViewHolder).bind(currentList[position])
    }

    class MenuViewHolder(val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: CategoryUiModel) {
            binding.item = item
        }
    }

    class MenuDiffUtil : DiffUtil.ItemCallback<CategoryUiModel>() {
        override fun areItemsTheSame(oldItem: CategoryUiModel, newItem: CategoryUiModel): Boolean =
            oldItem.tagId == newItem.tagId

        override fun areContentsTheSame(
            oldItem: CategoryUiModel,
            newItem: CategoryUiModel
        ): Boolean =
            oldItem.imageUrl == newItem.imageUrl &&
                    oldItem.title == newItem.title
    }
}