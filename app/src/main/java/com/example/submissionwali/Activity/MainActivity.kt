package com.example.submissionwali.Activity


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.submissionwali.Adapter.CardViewHapeAdapter
import com.example.submissionwali.Adapter.GridHapeAdapter
import com.example.submissionwali.Adapter.ListHapeAdapter
import com.example.submissionwali.Model.Hape
import com.example.submissionwali.Model.HapeData
import com.example.submissionwali.R

class MainActivity : AppCompatActivity() {

    private lateinit var rvHape: RecyclerView
    private var list: ArrayList<Hape> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Daftar Hape"
        }

    //********* TAMPILKAN DATA LIST VIEW *******//

        rvHape = findViewById(R.id.rv_hape)
        rvHape.setHasFixedSize(true)

        list.addAll(HapeData.listData)
        showRecyclerList()
    }

    //***** TOAST LIST VIEW ******//
    private fun showSelectedHape(data: Hape) {
        Toast.makeText(this, data.name, Toast.LENGTH_SHORT).show()
    }

    //******** SHOW LIST,GRID,CARD *********//
    private fun showRecyclerList() {
        rvHape.layoutManager = LinearLayoutManager(this)
        val listHapeAdapter = ListHapeAdapter(list)
        rvHape.adapter = listHapeAdapter
    //****** DETAIL VIEW & BACK ACTIONBAR ******//
        listHapeAdapter.setOnItemClickCallBack (object : ListHapeAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Hape){
                showSelectedHape(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvHape.layoutManager = GridLayoutManager(this, 2)
        val gridHapeAdapter = GridHapeAdapter(list)
        rvHape.adapter = gridHapeAdapter
    //****** DETAIL VIEW & BACK ******//
        gridHapeAdapter.setOnItemClickCallBack (object : GridHapeAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Hape) {
                showSelectedHape(data)
            }
        })
    }
    private fun showRecyclerCardView() {
        rvHape.layoutManager = LinearLayoutManager(this)
        val cardViewHapeAdapter = CardViewHapeAdapter(list)
        rvHape.adapter = cardViewHapeAdapter
    }

    //******* TAMPILAN MENU *********//

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.list -> {
                showRecyclerList()
            }
            R.id.grid -> {
                showRecyclerGrid()
            }
            R.id.CardView -> {
                showRecyclerCardView()
            }
            R.id.about -> {
                intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}