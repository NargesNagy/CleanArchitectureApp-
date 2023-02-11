package com.example.data.repositpry

import com.example.data.remote.ApiService
import com.example.domain.models.CategoryResponse
import com.example.domain.repo.HomeRemoteRepoInterface

class HomeMealsRemoteRepoImpl (private val apiService: ApiService) : HomeRemoteRepoInterface {
    override suspend fun getMealsFromRemote() = apiService.getMeals()


}