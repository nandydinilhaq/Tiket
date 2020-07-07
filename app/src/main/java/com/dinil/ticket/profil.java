package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class profil extends AppCompatActivity {

    Button back;

    LinearLayout edit_password, edit_profil, pembelian_tiket1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);

        back = findViewById(R.id.back);
        edit_password = findViewById(R.id.edit_password);
        edit_profil = findViewById(R.id.edit_profil);
        pembelian_tiket1 = findViewById(R.id.pembelian_tiket1);

        edit_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoeditpassword = new Intent(profil.this, ganti_password.class);
                startActivity(gotoeditpassword);
            }
        });

        edit_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoeditprofil = new Intent(profil.this, com.dinil.ticket.edit_profil.class);
                startActivity(gotoeditprofil);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(profil.this, home.class);
                startActivity(gotohome);
                finish();
            }
        });

        pembelian_tiket1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotopembeliantiket1 = new Intent(profil.this, tiket_detail.class);
                startActivity(gotopembeliantiket1);
            }
        });

    }
}