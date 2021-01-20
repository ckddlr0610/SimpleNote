package com.clean.simplenote.di

import com.clean.simplenote.data.repository.MenuRepositoryImpl
import com.clean.simplenote.domain.repository.MenuRepository
import com.clean.simplenote.domain.usecase.MenuUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DataModule {

    @Provides
    fun provideMenuRepository(): MenuRepository =
            MenuRepositoryImpl()
}

@Module
@InstallIn(ApplicationComponent::class)
object DomainModule {
    @Provides
    @Singleton
    fun provideMenuUseCase(
            menuRepository: MenuRepository
    ): MenuUseCase = MenuUseCase(menuRepository)
}