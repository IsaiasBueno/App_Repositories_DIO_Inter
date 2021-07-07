package com.isaiasbueno.app_repositories_dio_inter.domain

import com.isaiasbueno.app_repositories_dio_inter.core.UseCase
import com.isaiasbueno.app_repositories_dio_inter.data.model.Repo
import com.isaiasbueno.app_repositories_dio_inter.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}