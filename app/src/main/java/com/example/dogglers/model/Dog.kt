package com.example.dogglers.model

import androidx.annotation.DrawableRes

class Dog(
    @DrawableRes val imageResourceId:Int,
    var Name: String,
    var Age: Int,
    var Hobbies: String
    )