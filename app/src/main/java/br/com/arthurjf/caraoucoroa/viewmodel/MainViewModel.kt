package br.com.arthurjf.caraoucoroa.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {
    private val _isCoinFrontSided = MutableLiveData<Boolean>()
    val isCoinFrontSided: LiveData<Boolean>
        get() = _isCoinFrontSided

    fun playCoin(){
        _isCoinFrontSided.value = Random.nextBoolean()
    }
}