package com.app.rent.model

import com.app.rent.model.api.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepoRepository {

    // GET repo list
    fun getRepoList(page:Int, onResult: (isSuccess: Boolean, response: MovieResponse?) -> Unit) {

        ApiClient.instance.getMoviePopular(page=page).enqueue(object : Callback<MovieResponse> {
            override fun onResponse(call: Call<MovieResponse>?, response: Response<MovieResponse>?) {
                if (response != null && response.isSuccessful)
                    onResult(true,  response.body()!!)
                else
                    onResult(false, null)
            }

            override fun onFailure(call: Call<MovieResponse>?, t: Throwable?) {
                onResult(false, null)
            }

        })
    }

    companion object {
        private var INSTANCE: RepoRepository? = null
        fun getInstance() = INSTANCE
                ?: RepoRepository().also {
                    INSTANCE = it
                }
    }
}