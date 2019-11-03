package com.example.submissionwali.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submissionwali.Model.Hape
import com.example.submissionwali.R

class CardViewHapeAdapter (private val listHape: ArrayList<Hape>): RecyclerView.Adapter<CardViewHapeAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardview_item, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val hape = listHape[position]
        Glide.with(holder.itemView.context)
            .load(hape.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = hape.name
        holder.tvDetail.text = hape.detail
        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listHape[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listHape[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listHape[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listHape.size
    }

//    private lateinit var onItemClickCallback: OnItemClickCallback
//
//    fun setOnItemClickCallBack(onItemClickCallback: OnItemClickCallback) {
//        this.onItemClickCallback = onItemClickCallback
//    }
//    interface OnItemClickCallback {
//        fun onItemClicked(data: Hape)
//    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_cardview)
        var tvName: TextView = itemView.findViewById(R.id.tv_cardview)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_cardview_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_fav)
        var btnShare: Button = itemView.findViewById(R.id.btn_share)
    }
}