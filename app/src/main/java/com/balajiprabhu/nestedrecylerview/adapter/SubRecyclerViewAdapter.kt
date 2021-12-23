package com.balajiprabhu.nestedrecylerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.balajiprabhu.nestedrecylerview.model.Movie
import com.balajiprabhu.nestedrecylerview.databinding.ItemSubListViewBinding

class SubRecyclerViewAdapter : RecyclerView.Adapter<CommonViewHolder>() {

    private val movieList : MutableList<Movie> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemSubListViewBinding.inflate(inflater,parent,false)
        return CommonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount(): Int = movieList.size

    fun setMovieList(movieList : List<Movie>){
        this.movieList.clear()
        this.movieList.addAll(movieList)
        notifyDataSetChanged()
    }
}