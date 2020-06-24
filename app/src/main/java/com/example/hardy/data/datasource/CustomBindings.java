package com.example.hardy.data.datasource;


import androidx.databinding.BindingAdapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

import kotlin.jvm.JvmStatic;

public class CustomBindings {
    @JvmStatic
    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String url) {
        Glide.with(view).load(url).into(view);
    }
}
