package com.example.submissionwali.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submissionwali.Activity.DetailActivity
import com.example.submissionwali.Model.Hape
import com.example.submissionwali.R

class GridHapeAdapter (val listHape: ArrayList<Hape>): RecyclerView.Adapter<GridHapeAdapter.GridViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.grid_item, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val hape = listHape[position]
        Glide.with(holder.itemView.context)
            .load(listHape[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

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

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}