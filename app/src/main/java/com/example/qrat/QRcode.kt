package com.example.qrat

import android.animation.Animator
import android.animation.AnimatorInflater
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_q_rcode.*
import kotlinx.android.synthetic.main.activity_q_rcode.view.*

class QRcode : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q_rcode)

        val set: Animator = AnimatorInflater.loadAnimator(this,  R.animator.lenxuong)
            .apply {
                setTarget(this@QRcode.a5)
                start()
            }
    }
}