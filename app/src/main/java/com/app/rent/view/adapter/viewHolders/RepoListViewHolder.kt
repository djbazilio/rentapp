package com.app.rent.view.adapter.viewHolders

import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.recyclerview.widget.RecyclerView
import com.app.rent.model.Film
import com.app.rent.view.ui.repolist.RepoListViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_repo_list_item.view.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class RepoListViewHolder constructor(private val dataBinding: ViewDataBinding, private val repoListViewModel: RepoListViewModel)
    : RecyclerView.ViewHolder(dataBinding.root) {

    val posterImage = itemView.item_avatar
    fun setup(itemData: Film) {
        dataBinding.setVariable(BR.itemData, itemData)
        dataBinding.executePendingBindings()
        Picasso.get().load("https://image.tmdb.org/t/p/w370_and_h556_bestv2/"+itemData.poster_path).into(posterImage);

        itemView.onClick {
//            val bundle = bundleOf("url" to itemData.html_url)
//            itemView.findNavController().navigate(R.id.action_repoListFragment_to_repoDetailFragment, bundle)
        }
    }
}