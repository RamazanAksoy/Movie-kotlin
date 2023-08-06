package com.ramazanaksoy.movie_kotlin.listeners

import com.ramazanaksoy.movie_kotlin.models.Movies

interface OnMovieClickListener {
    fun onMoveClick(movies: Movies, genres: String)
}