package com.andreyborey.learninglivedata

import androidx.lifecycle.MutableLiveData

class IntLiveData: MutableLiveData<Int>() {
    fun setLiveDataValue(int:Int){
        value = int
    }
}