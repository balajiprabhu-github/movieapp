package com.balajiprabhu.nestedrecylerview.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.balajiprabhu.nestedrecylerview.model.MovieCategory
import com.balajiprabhu.nestedrecylerview.model.MovieDataProvider

class MainViewModel constructor(
    private val movieDataProvider: MovieDataProvider,
): ViewModel(),DefaultLifecycleObserver {

    val movieCategoryList = ObservableField<List<MovieCategory>>()

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        movieCategoryList.set(movieDataProvider.getMovieList())
    }
}