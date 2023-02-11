package com.example.domain.usecase

import com.example.domain.models.CategoryResponse
import com.example.domain.repo.HomeRemoteRepoInterface

class GetMealsUseCase(private val mealsRepoInterface: HomeRemoteRepoInterface) {
    operator suspend fun invoke() = mealsRepoInterface.getMealsFromRemote()

}