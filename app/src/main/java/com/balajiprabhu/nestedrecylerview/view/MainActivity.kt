package com.balajiprabhu.nestedrecylerview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import com.balajiprabhu.nestedrecylerview.viewmodel.MainViewModelProviderFactory
import com.balajiprabhu.nestedrecylerview.model.MovieDataProvider
import com.balajiprabhu.nestedrecylerview.R
import com.balajiprabhu.nestedrecylerview.databinding.ActivityMainBinding
import com.balajiprabhu.nestedrecylerview.viewmodel.MainViewModel

class MainActivity : AppCompatActivity(),LifecycleOwner {

    lateinit var viewModel : MainViewModel

    private val movieDataProvider = MovieDataProvider()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
        val viewModelFactory = MainViewModelProviderFactory(movieDataProvider)
        viewModel = ViewModelProvider(this,viewModelFactory)[MainViewModel::class.java]
        binding.viewModel = viewModel
        lifecycle.addObserver(viewModel)
    }
}