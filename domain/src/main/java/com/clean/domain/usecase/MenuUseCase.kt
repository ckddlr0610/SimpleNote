package com.clean.domain.usecase

import com.clean.domain.repository.MenuRepository
import javax.inject.Inject

class MenuUseCase @Inject constructor(
    private val menuRepository: MenuRepository
) {
    fun fetchCategory() =
        menuRepository.fetchCategory()
}