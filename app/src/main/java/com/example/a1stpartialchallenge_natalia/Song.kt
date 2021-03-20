package com.example.a1stpartialchallenge_natalia

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Song(val picture: Int,
                val title: String,
                val artist: String,
                val album: String,
                val mood: String,
                val secret: String) : Parcelable
