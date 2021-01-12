package com.clean.domain.usecase

import com.clean.domain.R
import com.clean.domain.model.Category
import com.clean.domain.repository.MenuRepository

class MenuUseCase {
    //TODO: 레포지토리 객체 주입받는 것으로 수정해야함
    fun fetchCategory() = listOf(
        Category(0, "", "a메모"),
        Category(1, "", "b메모"),
        Category(2, "", "c메모")
    )
}