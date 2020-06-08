package com.example.zappycode.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Method 1 - preferred
        new CountDownTimer(10000, 1000) { //starts from 10th second, goes down every 1 second

            public void onTick(long millisecondsUntilDone) { //what to do every second
                Log.i("Seconds Left!", String.valueOf(millisecondsUntilDone / 1000));
            }

            public void onFinish() { //once the countdown ends
                Log.i("We're done!", "No more countdown");
            }
        }.start(); //this starts the countdown


//        Method 2 - combination of handler and runnable
        /*
        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Hey it's us","A second passed by");

                handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);
        */
    }
}
