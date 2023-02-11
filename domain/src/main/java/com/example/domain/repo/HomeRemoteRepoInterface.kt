package com.example.domain.repo

import com.example.domain.models.CategoryResponse

interface HomeRemoteRepoInterface {
    suspend fun getMealsFromRemote() : CategoryResponse
}