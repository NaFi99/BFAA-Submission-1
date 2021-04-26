package com.example.githubuser

import android.content.Intent
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper.prepare
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: UserAdapter
    private lateinit var dataName: Array<String>
    private lateinit var dataDescription: Array<String>
    private lateinit var dataPhoto: TypedArray
    private var users = arrayListOf<User>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "GitHub User"


        recyclerV()
    }

    fun recyclerV() {
        rv_list.apply {
            val thisAdapter = UserAdapter(DataUser.listData)

            adapter = thisAdapter

            thisAdapter.setOnItemClickCallback(object : UserAdapter.OnItemClickCallback {

                override fun onItemClicked(data: User) {
                    val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    intent.putExtra("githubUser", data)

                    startActivity(intent)
                }

            })
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }
    }



}



