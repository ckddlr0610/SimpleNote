package com.clean.data.repository

import com.clean.domain.model.Category
import com.clean.domain.repository.MenuRepository
import javax.inject.Inject

class MenuRepositoryImpl @Inject constructor() : MenuRepository {
    override fun fetchCategory() =
        listOf(
            Category(0, "", "중요메모"),
            Category(1, "", "사진메모"),
            Category(2, "", "담은링크"),
            Category(3, "", "알람메모")
        )
}