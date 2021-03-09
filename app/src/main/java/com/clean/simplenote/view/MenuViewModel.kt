package com.clean.simplenote.view

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.clean.simplenote.domain.usecase.MenuUseCase
import com.clean.simplenote.mapper.CategoryUiMapper
import com.clean.simplenote.model.CategoryUiModel

class MenuViewModel @ViewModelInject constructor(
        private val menuUseCase: MenuUseCase,
        @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _categories: MutableLiveData<List<CategoryUiModel>> = MutableLiveData()
    val categories: LiveData<List<CategoryUiModel>> = _categories

    private val categoryUiMapper = CategoryUiMapper()

    fun fetchCategory() {
        _categories.value =
                categoryUiMapper.toUiModel(
                        menuUseCase.fetchCategory()
                )
    }
}