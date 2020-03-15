package com.example.fishgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivitiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activitiy);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(5000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashActivitiy.this,MainActivity.class);
                    startActivity(intent);


                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
