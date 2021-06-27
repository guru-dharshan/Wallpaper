 package com.devgd.wallpaper

import android.app.WallpaperManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

     fun setWallpaper(view: View) {
         var bitmap:Bitmap=BitmapFactory.decodeResource(getResources(),R.drawable.walpaper)
         var wallpaper:WallpaperManager=WallpaperManager.getInstance(getApplicationContext())
         wallpaper.setBitmap(bitmap)
     }
 }