package com.clean.domain.repository

import com.clean.domain.model.Category

interface MenuRepository {
    fun fetchCategory() : List<Category>
}