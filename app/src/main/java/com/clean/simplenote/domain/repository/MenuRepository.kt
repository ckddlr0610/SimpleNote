package com.clean.simplenote.domain.repository

import com.clean.simplenote.domain.model.Category

interface MenuRepository {
    fun fetchCategory() : List<com.clean.simplenote.domain.model.Category>
}