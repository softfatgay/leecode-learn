package com.hongxin.junit.testpro

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.HandlerThread
import android.os.Looper
import android.util.Log
import android.util.Printer
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import kotlin.collections.HashSet
import java.util.Hashtable as Hashtable1

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val TAG = "MainActivity"


    var thread1 = HandlerThread("thread1")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG, "onCreate")
        setContentView(R.layout.activity_main)
        Thread {
            tv.setText("我在子线程***********")
            tv.visibility = View.VISIBLE
        }.start()

        ll.setOnClickListener(this)


        thread1.start()


        Log.e("-------------","${thread1.id}")
        Log.e("=============","${mainLooper.thread.id}")



        Looper.getMainLooper().quit()


        val hashSet = HashSet<String>()

    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onStart")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop")
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("RestrictedApi", "ResourceType")
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.ll -> {
                startActivity(Intent(this, AActivity::class.java))
            }
        }
    }


    inner class MyP : Printer {
        override fun println(x: String?) {
            Log.e("------", "${System.currentTimeMillis()}")

        }
    }
}