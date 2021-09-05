package com.andreyborey.learninglivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import com.andreyborey.learninglivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var stringLiveData = StringLiveData()
    lateinit var observer: Observer<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        observer = Observer { binding.testText1.text = it }



        binding.btn1.setOnClickListener {
            stringLiveData.setLiveDataValue(binding.editText1.text.toString())
        }


    }

    override fun onStart() {
        super.onStart()
        stringLiveData.observe(this, observer)
    }

    override fun onStop() {
        super.onStop()
        stringLiveData.removeObserver(observer)
    }
}