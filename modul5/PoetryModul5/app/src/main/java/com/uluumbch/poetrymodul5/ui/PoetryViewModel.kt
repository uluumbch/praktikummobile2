package com.uluumbch.poetrymodul5.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uluumbch.poetrymodul5.network.Poetry
import com.uluumbch.poetrymodul5.network.PoetryApi
import kotlinx.coroutines.launch
import java.lang.Exception

enum class PoetryApiStatus { LOADING, ERROR, DONE }

class PoetryViewModel : ViewModel() {
    private val _status = MutableLiveData<PoetryApiStatus>()
    val status: LiveData<PoetryApiStatus> = _status

    private val _poetry = MutableLiveData<List<Poetry>>()
    val poetry: LiveData<List<Poetry>> = _poetry

    private val _poem = MutableLiveData<Poetry>()
    val poem: LiveData<Poetry> = _poem


    fun listToString(list: List<String>): String {
        return list.joinToString("\n")
    }

    fun getPoetryList() {
        viewModelScope.launch {
            _status.value = PoetryApiStatus.LOADING
            try {
                _poetry.value = PoetryApi.retrofitServiceApi.getData()
                _status.value = PoetryApiStatus.DONE
            } catch (e: Exception) {
                _poetry.value = listOf()
                _status.value = PoetryApiStatus.ERROR
            }
        }
    }

    fun onPoetryClicked(poetry: Poetry) {
        _poem.value = poetry
    }


}