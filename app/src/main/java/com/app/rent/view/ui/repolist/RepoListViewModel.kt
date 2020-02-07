package com.app.rent.view.ui.repolist

import androidx.lifecycle.MutableLiveData
import com.app.rent.model.Film
import com.app.rent.model.RepoRepository
import com.app.rent.view.base.BaseViewModel

class RepoListViewModel : BaseViewModel() {
    val repoListLive = MutableLiveData<List<Film>>()

    fun fetchRepoList() {
        dataLoading.value = true
        RepoRepository.getInstance().getRepoList { isSuccess, response ->
            dataLoading.value = false
            if (isSuccess) {
                repoListLive.value = response?.results
                empty.value = false
            } else {
                empty.value = true
            }
        }
    }
}