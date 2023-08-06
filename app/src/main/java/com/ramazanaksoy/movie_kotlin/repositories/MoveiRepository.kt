package com.ramazanaksoy.movie_kotlin.repositories

import com.ramazanaksoy.movie_kotlin.BuildConfig
import com.ramazanaksoy.movie_kotlin.api.ApiConfig

class MoveiRepository {
    private val client = ApiConfig.getApiService()

    suspend fun getPopularMovie(page: Int) = client.getPopularMovie(BuildConfig.API_KEY, page)
    suspend fun searchMovie(query: String, page: Int) = client.searchMovie(BuildConfig.API_KEY, query, page)
    suspend fun getGenres() = client.getGenres(BuildConfig.API_KEY)
}