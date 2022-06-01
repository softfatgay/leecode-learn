package com.hongxin.junit.testpro

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.view.Choreographer
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var loop: Looper


    companion object {
        lateinit var liveData: MutableLiveData<String>
    }


    var pub: TestObsever? = null

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv.setOnClickListener(this)

        "%.2f".format(123.447897)

        liveData = MutableLiveData()

        pub = TestObsever()
        lifecycle.addObserver(pub!!)
        liveData.postValue("aaaa")
        liveData.postValue("bbbb")
        liveData.postValue("ccccc")






        Looper.prepareMainLooper()


    }

    override fun onStart() {
        super.onStart()
        Log.e("---------------", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("---------------", "onResume")
    }

    @SuppressLint("RestrictedApi")
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tv -> {
                liveData.setValue("ddddd")
                liveData.observe(this) {
                    Log.e("---------------", it)
                }


//                finish()
//                startActivity(Intent(this, Activity2::class.java))

            }

        }
        list.add(com.hongxin.junit.testpro.Person())
        Choreographer.getInstance()
        testP(Jack(), Person())
        Looper.prepareMainLooper()
    }

    var list: ArrayList<in Person> = ArrayList()

    var list1: java.util.ArrayList<out Jack> = java.util.ArrayList()
//    var list = ArrayList< ? : super Person>()

    fun testP(vararg person: Person) {

    }


}