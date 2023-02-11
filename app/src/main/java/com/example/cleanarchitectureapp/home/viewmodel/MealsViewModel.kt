package com.example.cleanarchitectureapp.home.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.models.CategoryResponse
import com.example.domain.usecase.GetMealsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val getMealsUseCase: GetMealsUseCase
) : ViewModel() {

    private val _categoryResponse: MutableStateFlow<CategoryResponse?> = MutableStateFlow(null)
    val categoryResponse: StateFlow<CategoryResponse?> = _categoryResponse

    fun getMealsFromRemote() {
        viewModelScope.launch {
            try {
                _categoryResponse.value = getMealsUseCase()
                Log.d("TAG ViewModel" , "${_categoryResponse.value}")
            } catch (e: Exception) {
                Log.e("TAG ViewModel On Error", e.message.toString())
            }

        }
    }
}