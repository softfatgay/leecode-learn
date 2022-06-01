package com.hongxin.junit.testpro;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import java.util.ArrayList;
import java.util.List;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        MainActivity.liveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.e("Activity2", s);
            }
        });


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
