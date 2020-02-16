package com.app.rent.view.ui.repolist

import androidx.lifecycle.MutableLiveData
import com.app.rent.model.Film
import com.app.rent.model.RepoRepository
import com.app.rent.view.base.BaseViewModel
import java.util.ArrayList

class RepoListViewModel : BaseViewModel() {
    val repoListLive = MutableLiveData<ArrayList<Film>>()

    fun fetchRepoList(endScroll:Boolean) {
        if(!endScroll)return
        var page = 1
        if(!repoListLive.value.isNullOrEmpty()){
            page = (repoListLive.value!!.size/20)+1
        }else{
            repoListLive.value = ArrayList()
        }
        dataLoading.value = true
        RepoRepository.getInstance().getRepoList(page) { isSuccess, response ->
            if (isSuccess) {
                repoListLive.value!!.addAll(response?.results!!)
                empty.value = false
            } else {
                empty.value = true
            }
            dataLoading.value = false
        }
    }
}