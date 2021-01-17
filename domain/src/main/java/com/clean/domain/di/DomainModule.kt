package com.clean.domain.di

import com.clean.domain.repository.MenuRepository
import com.clean.domain.usecase.MenuUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class DomainModule {
    @Binds
    abstract fun bindMenuUseCase(
        menuRepository: MenuRepository
    ): MenuUseCase
}