package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class monas_detail extends AppCompatActivity {

    Button back, pesan_tiket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monas_detail);

        back = findViewById(R.id.back);
        pesan_tiket = findViewById(R.id.pesan_tiket);

        pesan_tiket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotocheckoutticket = new Intent(monas_detail.this, tiket_checkout.class);
                startActivity(gotocheckoutticket);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



    }
}