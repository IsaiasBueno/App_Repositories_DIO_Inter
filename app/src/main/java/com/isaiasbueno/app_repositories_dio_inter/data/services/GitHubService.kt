package com.isaiasbueno.app_repositories_dio_inter.data.services

import com.isaiasbueno.app_repositories_dio_inter.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String) : List<Repo>
}