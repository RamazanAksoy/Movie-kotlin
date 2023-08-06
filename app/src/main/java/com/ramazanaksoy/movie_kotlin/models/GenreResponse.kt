package com.ramazanaksoy.movie_kotlin.models

import com.google.gson.annotations.SerializedName

data class GenreResponse(

	@field:SerializedName("genres")
	val genres: List<Genres>? = null
)