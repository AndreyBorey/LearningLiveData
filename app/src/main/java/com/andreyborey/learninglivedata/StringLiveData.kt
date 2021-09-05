package com.andreyborey.learninglivedata

import androidx.lifecycle.LiveData

class StringLiveData: LiveData<String>() {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    fun setLiveDataValue(string:String){
        value = string
    }

    override fun onActive() {
        super.onActive()
        println("onActive")
    }

    override fun onInactive() {
        super.onInactive()
        println("onInactive")
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}