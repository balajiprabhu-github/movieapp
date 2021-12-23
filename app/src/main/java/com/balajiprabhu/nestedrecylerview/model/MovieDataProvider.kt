package com.balajiprabhu.nestedrecylerview.model

import com.balajiprabhu.nestedrecylerview.R
import java.util.ArrayList

class MovieDataProvider {

    fun getMovieList():List<MovieCategory> {

        val movieItemList: MutableList<Movie> = ArrayList<Movie>()
        movieItemList.add(Movie(1, R.drawable.englishmovie1))
        movieItemList.add(Movie(1, R.drawable.englishmovie2))
        movieItemList.add(Movie(1, R.drawable.englishmovie3))
        movieItemList.add(Movie(1, R.drawable.englishmovie4))
        movieItemList.add(Movie(1, R.drawable.englishmovie5))
        movieItemList.add(Movie(1, R.drawable.englishmovie6))

        val movieItemList2: MutableList<Movie> = ArrayList<Movie>()
        movieItemList2.add(Movie(1, R.drawable.tamilmovie1))
        movieItemList2.add(Movie(1, R.drawable.tamilmovie2))
        movieItemList2.add(Movie(1, R.drawable.tamilmovie3))
        movieItemList2.add(Movie(1, R.drawable.tamilmovie4))
        movieItemList2.add(Movie(1, R.drawable.tamilmovie5))
        movieItemList2.add(Movie(1, R.drawable.tamilmovie6))

        val movieItemList3: MutableList<Movie> = ArrayList<Movie>()
        movieItemList3.add(Movie(1, R.drawable.hindimovie1))
        movieItemList3.add(Movie(1, R.drawable.hindimovie2))
        movieItemList3.add(Movie(1, R.drawable.hindimovie3))
        movieItemList3.add(Movie(1, R.drawable.hindimovie4))
        movieItemList3.add(Movie(1, R.drawable.hindimovie5))

        val movieItemList4: MutableList<Movie> = ArrayList<Movie>()
        movieItemList4.add(Movie(1, R.drawable.telugumovie1))
        movieItemList4.add(Movie(1, R.drawable.telugumovie2))
        movieItemList4.add(Movie(1, R.drawable.telugumovie3))
        movieItemList4.add(Movie(1, R.drawable.telugumovie4))
        movieItemList4.add(Movie(1, R.drawable.telugumovie5))

        val movieItemList5: MutableList<Movie> = ArrayList<Movie>()
        movieItemList5.add(Movie(1, R.drawable.malayalammovie1))
        movieItemList5.add(Movie(1, R.drawable.malayalammovie2))
        movieItemList5.add(Movie(1, R.drawable.malayalammovie3))
        movieItemList5.add(Movie(1, R.drawable.malayalammovie4))
        movieItemList5.add(Movie(1, R.drawable.malayalammovie5))

        val allCategoryList: MutableList<MovieCategory> = ArrayList<MovieCategory>()

        allCategoryList.add(MovieCategory("English", movieItemList))
        allCategoryList.add(MovieCategory("Tamil", movieItemList2))
        allCategoryList.add(MovieCategory("Hindi", movieItemList3))
        allCategoryList.add(MovieCategory("Telugu", movieItemList4))
        allCategoryList.add(MovieCategory("Malayalam", movieItemList5))

        return allCategoryList
    }
}