package com.example.submissionwali.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.submissionwali.R

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        var imgGambar : ImageView = findViewById(R.id.img_detail_activity)
        var tvJenishp : TextView  = findViewById(R.id.tv_name)
        var tvDetail  : TextView  = findViewById(R.id.tv_detail)

        val gambar = intent.getIntExtra(EXTRA_IMAGE,0)
        val namahp = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        Glide.with(this)
            .load(gambar)
            .into(imgGambar)
        tvJenishp.text = namahp
        tvDetail.text = detail

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = namahp
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
