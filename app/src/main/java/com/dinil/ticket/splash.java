package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    TextView tagline;
    ImageView app_logo;

    Animation app_splash, btt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        tagline = findViewById(R.id.tagline);
        app_logo = findViewById(R.id.app_logo);

        app_splash = AnimationUtils.loadAnimation(this,R.anim.app_splash);
        btt = AnimationUtils.loadAnimation(this,R.anim.btt);

        app_logo.startAnimation(app_splash);
        tagline.startAnimation(btt);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gotologin = new Intent(splash.this, getstarted.class);
                startActivity(gotologin);
                finish();
            }
        },1300);

    }
}