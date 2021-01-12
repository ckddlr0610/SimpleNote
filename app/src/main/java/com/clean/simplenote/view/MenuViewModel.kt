package com.clean.simplenote.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.clean.domain.usecase.MenuUseCase
import com.clean.simplenote.mapper.CategoryUiMapper
import com.clean.simplenote.model.CategoryUiModel

class MenuViewModel : ViewModel() {
    private val _categories: MutableLiveData<List<CategoryUiModel>> = MutableLiveData()
    val categories: LiveData<List<CategoryUiModel>> = _categories

    private val categoryUiMapper = CategoryUiMapper()

    fun fetchCategory() {
        _categories.value =
            categoryUiMapper.toUiModel(
                MenuUseCase().fetchCategory()
            )
    }
}