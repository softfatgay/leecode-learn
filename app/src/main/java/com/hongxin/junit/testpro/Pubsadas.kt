package com.hongxin.junit.testpro

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import java.text.DecimalFormat
import kotlin.jvm.JvmStatic

object Pubsadas  : LifecycleObserver{
    @JvmStatic
    fun main(args: Array<String>) {
        val format = DecimalFormat("#.##")
        format.format(123.43232)
    }


}