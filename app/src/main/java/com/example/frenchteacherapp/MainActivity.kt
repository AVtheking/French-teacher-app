package com.example.frenchteacherapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun Saythecolour(view: View)
    {
        val clickedbtn:Button=view as Button
        val mediaPlayer=MediaPlayer.create(this,resources.getIdentifier(clickedbtn.tag.toString()
        ,"raw",packageName))
        mediaPlayer.start()
    }
}