package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class sukses_beli extends AppCompatActivity {

    Animation inout, btt, app_splash;

    ImageView icon_sukses_beli;

    TextView tagline_beli1, tagline_beli2;

    Button lihat_tiket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sukses_beli);

        lihat_tiket = findViewById(R.id.lihat_tiket);

        inout = AnimationUtils.loadAnimation(this, R.anim.inout);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);
        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);

        icon_sukses_beli = findViewById(R.id.icon_sukses_beli);
        tagline_beli1 = findViewById(R.id.tagline_beli1);
        tagline_beli2 = findViewById(R.id.tagline_beli2);
        lihat_tiket = findViewById(R.id.lihat_tiket);

        icon_sukses_beli.startAnimation(app_splash);
        tagline_beli1.startAnimation(btt);
        tagline_beli2.startAnimation(btt);
        lihat_tiket.startAnimation(inout);

        lihat_tiket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoprofil = new Intent(sukses_beli.this, profil.class);
                startActivity(gotoprofil);
                finish();
            }
        });


    }
}