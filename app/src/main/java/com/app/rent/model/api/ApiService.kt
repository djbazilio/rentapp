package com.app.rent.model.api

import com.app.rent.model.MovieResponse
import com.app.rent.view.utils.Constants.Companion.API_KEY
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    fun getMoviePopular(
            @Query("api_key") search: String = API_KEY,
            @Query("language") language: String = "uk-UA",
            @Query("page") page: Int = 1
    ): Call<MovieResponse>
/*
    @GET("search/repositories")
    fun getRepo(@Query("q") search: String = "trending", @Query("sort") sort: String = "stars"): Call<GitResponse>*/
}