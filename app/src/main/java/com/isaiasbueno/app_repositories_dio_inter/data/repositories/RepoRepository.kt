package com.isaiasbueno.app_repositories_dio_inter.data.repositories

import com.isaiasbueno.app_repositories_dio_inter.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}