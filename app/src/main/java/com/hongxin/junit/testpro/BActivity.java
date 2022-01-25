package com.hongxin.junit.testpro;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String aaa = getIntent().getStringExtra("aaa");

        setContentView(R.layout.b_layout);

        TextView tv = findViewById(R.id.tv);
        tv.setText(aaa);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("==b_activity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("==b_activity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("==b_activity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("==b_activity","onStop");
    }
}
