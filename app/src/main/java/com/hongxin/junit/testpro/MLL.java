package com.hongxin.junit.testpro;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class MLL extends LinearLayout {


    public MLL(Context context) {
        super(context);
    }

    public MLL(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MLL(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("view","dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("view","onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("view","onTouchEvent");
        return super.onTouchEvent(event);
    }
}
