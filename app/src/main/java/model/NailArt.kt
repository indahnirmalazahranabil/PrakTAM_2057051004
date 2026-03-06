package com.example.praktam_2057051004.model
import androidx.annotation.DrawableRes

data class NailArt(
    val nama: String,
    val deskripsi: String,
    val harga: Int,
    @DrawableRes val imageRes: Int
)