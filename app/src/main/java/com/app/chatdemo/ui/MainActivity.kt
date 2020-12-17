package com.app.chatdemo.ui

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import com.app.chatdemo.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var icon:ImageView?=null
    var imageUri: Uri?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    fun init(){
        icon=findViewById(R.id.icon)
        icon!!.setOnClickListener(this@MainActivity);
    }

    override fun onClick(v: View?) {
        if(v==icon){
            val gallery=Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery,100)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode== Activity.RESULT_OK && requestCode==100){
            imageUri=data?.data
            icon!!.setImageURI(imageUri)
        }
    }
}