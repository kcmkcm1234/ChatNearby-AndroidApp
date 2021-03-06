package com.example.chatnearby.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val uid: String,
    val name: String,
    var lon : Double,
    var lat : Double,
    val profileImageUrl: String?,
    var contacts : ArrayList<String>? = arrayListOf(uid)
) : Parcelable {
    constructor() : this("", "", 0.0,0.0,"", ArrayList<String>())
}