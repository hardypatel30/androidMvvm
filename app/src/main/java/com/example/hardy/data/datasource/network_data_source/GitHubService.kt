package com.example.hardy.data.datasource.network_data_source

import com.example.hardy.data.models.repo_response.RepoResponse
import com.example.hardy.data.models.user_response.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface GitHubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String?): Call<List<RepoResponse?>?>?

    @GET("users/list")
    fun listUsers(): Call<List<UserResponse?>?>?
}