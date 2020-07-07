package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class menu_destinasi extends AppCompatActivity {

    Button back;

    LinearLayout monas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_destinasi);

        back = findViewById(R.id.back);
        monas = findViewById(R.id.monas);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        monas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomonas = new Intent(menu_destinasi.this, monas_detail.class);
                startActivity(gotomonas);
            }
        });
    }
}