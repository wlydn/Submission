package com.example.submissionwali.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submissionwali.Activity.DetailActivity
import com.example.submissionwali.Model.Hape
import com.example.submissionwali.R

class ListHapeAdapter(private val listHape: ArrayList<Hape>) : RecyclerView.Adapter<ListHapeAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_hp, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hape = listHape[position]
        Glide.with(holder.itemView.context)
            .load(hape.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = hape.name
        holder.tvDetail.text = hape.detail

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listHape[holder.adapterPosition])

            val moveToDetailActivity = Intent(it.context, DetailActivity::class.java)
            moveToDetailActivity.putExtra(DetailActivity.EXTRA_IMAGE, hape.photo)
            moveToDetailActivity.putExtra(DetailActivity.EXTRA_NAME, hape.name)
            moveToDetailActivity.putExtra(DetailActivity.EXTRA_DETAIL, hape.detail)
            it.context.startActivity(moveToDetailActivity)
        }
    }

    override fun getItemCount(): Int {
        return listHape.size
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallBack(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Hape)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}