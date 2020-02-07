package com.app.rent.model

data class MovieResponse(
        val page: Int,
        val total_results: Int,
        val total_pages: Int,
        val results: List<Film>
)

data class Film(
        val id: Int,
        val popularity: Float,
        val vote_count: Int,
        val name: String,
        val video: Boolean,
        val poster_path: String,
        val adult: Boolean,
        val backdrop_path: String,
        val original_language: String,
        val original_title: Boolean,
        val title: String,
        val vote_average: Float,
        val overview: String,
        val release_date: String
)

data class Owner(
        val login: String,
        val id: Int,
        val node_id: String,
        val avatar_url: String,
        val gravatar_id: String,
        val url: String,
        val html_url: String,
        val followers_url: String,
        val following_url: String,
        val gists_url: String,
        val starred_url: String,
        val subscriptions_url: String,
        val organizations_url: String,
        val repos_url: String,
        val events_url: String,
        val received_events_url: String,
        val type: String,
        val site_admin: Boolean
)

data class License(
        val key: String,
        val name: String,
        val spdx_id: String,
        val url: String,
        val node_id: String
)