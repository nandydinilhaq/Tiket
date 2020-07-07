package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    TextView daftar;
    Button masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        daftar = findViewById(R.id.daftar);
        masuk = findViewById(R.id.masuk);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregistrasi=new Intent(login.this,registrasi1.class);
                startActivity(gotoregistrasi);
            }
        });

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(login.this, home.class);
                startActivity(gotohome);
                finish();
            }
        });
    }
}