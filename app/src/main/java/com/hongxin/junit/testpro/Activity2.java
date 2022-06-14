package com.hongxin.junit.testpro;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        AtomicStampedReference A = new AtomicStampedReference<Integer>(100,1);


        Log.e("Activity2", "onCreate");
    }


    ArrayList<? super Person> list = new ArrayList<>();
    ArrayList<? extends Lily> list1 = new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Activity2", "onStart");


        list.add(new Jack());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity2", "onResume");
    }
}
