package com.example.animalsapp
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable
@Parcelize
data class AnimalsInfo(

    val name: String,
    var moreinfo: String,
    val image: Int,
    var act1descr: String
) : Parcelable
