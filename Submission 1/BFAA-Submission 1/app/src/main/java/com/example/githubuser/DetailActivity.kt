package com.example.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_respiratory.setOnClickListener(){
            Toast.makeText(applicationContext, "See Respiratory Activity",Toast.LENGTH_SHORT).show()
        }


    DetailUser()
    }
    private fun DetailUser(){
        val detail = intent.getParcelableExtra<User>("githubUser")
        for_name.text = detail?.name
        for_desc.text = detail?.description
        for_followers.text = detail?.followers
        for_following.text = detail?.following
        for_company.text = detail?.address
        detail?.let{
            for_photo.setImageResource(it.photo)
            for_logo.setImageResource(it.logo)
        }

    }
}