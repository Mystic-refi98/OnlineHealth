package com.android.onlinehealth;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.Window;
import android.widget.Button;


import java.util.Timer;
import java.util.TimerTask;

public class activity_2 extends AppCompatActivity {
    private Button button;
    Timer timer;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); //ini juga
        setContentView(R.layout.activity_welcome2);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(activity_2.this,activity_3.class);
                startActivity(intent);
                finish();

            }
        },3000);

    }

}