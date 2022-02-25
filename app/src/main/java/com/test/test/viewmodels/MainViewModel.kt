package com.test.test.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var firstDigit = MutableLiveData(0)

    var secondDigit = MutableLiveData(0)

    var result = MutableLiveData(0)

    fun addDigits() {
            result.value = (firstDigit.value ?: 0) + (secondDigit.value ?: 0)
    }
}