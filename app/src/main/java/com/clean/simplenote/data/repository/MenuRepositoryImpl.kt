package com.clean.simplenote.data.repository

import com.clean.simplenote.domain.model.Category
import com.clean.simplenote.domain.repository.MenuRepository

class MenuRepositoryImpl internal constructor(
) : MenuRepository {
    override fun fetchCategory() =
        listOf(
                Category(0, "", "중요메모"),
                Category(1, "", "사진메모"),
                Category(2, "", "담은링크"),
                Category(3, "", "알람메모")
        )
}