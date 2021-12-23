package com.balajiprabhu.nestedrecylerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.balajiprabhu.nestedrecylerview.model.MovieCategory
import com.balajiprabhu.nestedrecylerview.databinding.ItemMainListViewBinding

class MainRecyclerViewAdapter : RecyclerView.Adapter<CommonViewHolder>() {

    private val movieCategoryList : MutableList<MovieCategory> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMainListViewBinding.inflate(inflater,parent,false)
        return CommonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CommonViewHolder, position: Int) {
        holder.bind(movieCategoryList[position])
    }

    override fun getItemCount(): Int = movieCategoryList.size

    fun setMovieCategoryList(movieCategoryList : List<MovieCategory>){
        this.movieCategoryList.clear()
        this.movieCategoryList.addAll(movieCategoryList)
        notifyDataSetChanged()
    }
}