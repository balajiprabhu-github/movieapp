package com.balajiprabhu.nestedrecylerview.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.balajiprabhu.nestedrecylerview.model.MovieDataProvider

class MainViewModelProviderFactory constructor(
    private val movieDataProvider: MovieDataProvider
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(movieDataProvider) as T
    }
}