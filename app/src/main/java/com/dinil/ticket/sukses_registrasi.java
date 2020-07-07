package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sukses_registrasi extends AppCompatActivity {

    Button gohome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sukses_registrasi);

        gohome=findViewById(R.id.gohome);

        gohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(sukses_registrasi.this,home.class);
                startActivity(gotohome);
                finish();
            }
        });

    }
}