package com.isaiasbueno.app_repositories_dio_inter.data.model

import com.google.gson.annotations.SerializedName
import com.isaiasbueno.app_repositories_dio_inter.data.model.Owner

data class Repo(
    val id: Long,
    val name: String,
    val owner: Owner,
    @SerializedName("stargazers_count")
    val stargazersCount: Long,
    val language: String,
    @SerializedName("html_url")
    val htmlURL: String,
    val description: String
)