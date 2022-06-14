package com.hongxin.junit.testpro;

import android.app.AlertDialog;
import android.app.Instrumentation;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.ThreadPoolExecutor;

public class AActivity extends AppCompatActivity {

    private Button tv_a, btn;

    private transient volatile int anInt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("==a_activity", "onCreate");
        setContentView(R.layout.a_layout);


        tv_a = findViewById(R.id.tv_a);
        btn = findViewById(R.id.btn);


        new Thread(new Runnable() {
            @Override
            public void run() {
                tv_a.setText("我是子线程中设置UI");
            }
        }).start();


        findViewById(R.id.btn).setOnClickListener(v -> {

            Intent intent = new Intent(AActivity.this, BActivity.class);
            String str = getStr();
            Log.e("--------", str.length() + "");
            intent.putExtra("aaa", str);

            startActivity(intent);
        });

        tv_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AActivity.this, AActivity.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_a.setText("我是加载过的额");
                startActivity(new Intent(AActivity.this, MainActivity.class));
            }
        });
    }

    private String getStr() {
        return "可是有时候出现该问题时竟然不报错我遇到的就没||" +
                "可是有时候出现该问题时竟然不报错我遇到的就没||";

    }


    private void showDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("弹出警告框");
        builder.show();
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e("==a_activity", "onNewIntent");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("==a_activity", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("==a_activity", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("==a_activity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("==a_activity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("==a_activity", "onStop");
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("==a_activity", "onRestoreInstanceState");
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e("==a_activity", "onConfigurationChanged");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("==a_activity", "onDestroy");
    }


    private Handler handler = new Handler();

    private void test() {


        StringBuffer sb = new StringBuffer();



    }
}
