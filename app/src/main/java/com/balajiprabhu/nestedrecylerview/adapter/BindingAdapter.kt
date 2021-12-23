package com.balajiprabhu.nestedrecylerview.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.balajiprabhu.nestedrecylerview.model.Movie
import com.balajiprabhu.nestedrecylerview.model.MovieCategory

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("src")
    fun setImageView( imageView: ImageView,imageResId:Int){
        imageResId.let {
            imageView.setImageResource(it)
        }
    }

    @JvmStatic
    @BindingAdapter("setMovieDataList")
    fun setMovieDataList( recyclerView:RecyclerView,movieList: List<Movie>){
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = SubRecyclerViewAdapter().also {
            it.setMovieList(movieList)
        }
    }

    @JvmStatic
    @BindingAdapter("setMovieCategoryList")
    fun setMovieCategoryList( recyclerView:RecyclerView,movieList: List<MovieCategory>){
        recyclerView.adapter = MainRecyclerViewAdapter().also {
            it.setMovieCategoryList(movieList)
        }
    }
}