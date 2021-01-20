package com.clean.simplenote.domain.usecase

import javax.inject.Inject

class MenuUseCase @Inject constructor(
    private val menuRepository: com.clean.simplenote.domain.repository.MenuRepository
) {

    fun fetchCategory() =
        menuRepository.fetchCategory()
}