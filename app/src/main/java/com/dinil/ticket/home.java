package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class home extends AppCompatActivity {

    Button lihat_destinasi;
    LinearLayout monas;
    ImageView foto_profil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        lihat_destinasi = findViewById(R.id.lihat_destinasi);
        monas = findViewById(R.id.monas);
        foto_profil = findViewById(R.id.foto_profil);

        lihat_destinasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomenudestinasi = new Intent(home.this, menu_destinasi.class);
                startActivity(gotomenudestinasi);
            }
        });

        foto_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoprofil = new Intent(home.this, profil.class);
                startActivity(gotoprofil);
            }
        });

        monas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomonas = new Intent(home.this, monas_detail.class);
                startActivity(gotomonas);
            }
        });



    }
}