package com.test.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.test.test.databinding.ActivityMainBinding
import com.test.test.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        binding.viewModel = viewModel

        viewModel.firstDigit.observe(this) {
            viewModel.addDigits()
        }

        viewModel.secondDigit.observe(this){
            viewModel.addDigits()
        }
    }

}