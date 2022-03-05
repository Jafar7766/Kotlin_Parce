package com.example.kotlin_parce

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class UserID(
    val name:String,
    val email: String

) : Parcelable