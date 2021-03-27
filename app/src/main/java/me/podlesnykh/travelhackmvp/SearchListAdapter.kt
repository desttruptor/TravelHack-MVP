package me.podlesnykh.travelhackmvp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SearchListAdapter: RecyclerView.Adapter<SearchListAdapter.SearchListViewHolder>() {

    private var content = listOf("Item1", "Item2", "Item3", "Item4")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchListAdapter.SearchListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.search_list_item, parent, false)
        return SearchListViewHolder(view)
    }

    override fun onBindViewHolder(holder: SearchListAdapter.SearchListViewHolder, position: Int) {
        holder.bind(content[position])
    }

    override fun getItemCount(): Int = content.size

    inner class SearchListViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val titleView: TextView = view.findViewById(R.id.tv_search_item_title)
        private val subtitleView: TextView = view.findViewById(R.id.tv_search_item_subtitle)
        private val imageView: ImageView = view.findViewById(R.id.iv_search_item_image)

        fun bind(title: String) {
            titleView.text = title
            val subtitle = "Описание $title"
            subtitleView.text = subtitle
            imageView.setImageResource(R.mipmap.ic_launcher)
        }
    }
}