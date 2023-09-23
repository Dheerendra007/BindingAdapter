package com.dk.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageFromURL")
fun ImageView.imageFromUrl(url:String){
    Glide.with(this.context).load(url).into(this)
}