package com.example.githubuser

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    var name: String = "",
    var description: String = "",
    var followers: String = "",
    var following: String = "",
    var address: String = "",
    var logo: Int = 0,
    var photo: Int = 0
) :Parcelable