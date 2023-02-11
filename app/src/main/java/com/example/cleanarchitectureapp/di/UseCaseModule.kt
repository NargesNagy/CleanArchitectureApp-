package com.example.cleanarchitectureapp.di

import com.example.domain.repo.HomeRemoteRepoInterface
import com.example.domain.usecase.GetMealsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideUseCase(homeRemoteRepoInterface: HomeRemoteRepoInterface) : GetMealsUseCase{
        return GetMealsUseCase(homeRemoteRepoInterface)
    }

}