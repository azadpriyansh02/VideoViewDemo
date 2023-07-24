package com.example.videoviewdemo

import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import java.net.URI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoview=findViewById<VideoView>(R.id.videoView)
        val mediaController=MediaController(this)
        mediaController.setAnchorView(videoview)
        val uri: Uri =parse("android.resource://"+packageName+"/"+R.raw.video)
        videoview.setMediaController(mediaController)
        videoview.setVideoURI(uri)
        videoview.requestFocus()
        videoview.start()
    }
}