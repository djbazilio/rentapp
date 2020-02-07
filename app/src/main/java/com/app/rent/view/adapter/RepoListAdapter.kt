package com.app.rent.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.rent.databinding.ViewRepoListItemBinding
import com.app.rent.model.Film
import com.app.rent.view.adapter.viewHolders.RepoListViewHolder
import com.app.rent.view.ui.repolist.RepoListViewModel

class RepoListAdapter(private val repoListViewModel: RepoListViewModel) : RecyclerView.Adapter<RepoListViewHolder>() {
    var repoList: List<Film> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val dataBinding = ViewRepoListItemBinding.inflate(inflater, parent, false)
        return RepoListViewHolder(dataBinding, repoListViewModel)
    }

    override fun getItemCount() = repoList.size

    override fun onBindViewHolder(holder: RepoListViewHolder, position: Int) {
        holder.setup(repoList[position])
    }

    fun updateRepoList(repoList: List<Film>) {
        this.repoList = repoList
        notifyDataSetChanged()
    }
}