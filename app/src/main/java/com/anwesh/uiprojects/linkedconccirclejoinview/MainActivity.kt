package com.anwesh.uiprojects.linkedconccirclejoinview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.conccirclejoinview.ConcCircleJoinView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ConcCircleJoinView.create(this)
    }
}
