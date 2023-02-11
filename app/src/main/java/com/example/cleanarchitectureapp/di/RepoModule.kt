package com.example.cleanarchitectureapp.di

import com.example.data.remote.ApiService
import com.example.data.repositpry.HomeMealsRemoteRepoImpl
import com.example.domain.repo.HomeRemoteRepoInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService) : HomeRemoteRepoInterface{
        return HomeMealsRemoteRepoImpl(apiService)
    }
}