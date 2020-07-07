package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class getstarted extends AppCompatActivity {

    Button login, registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getstarted);

        login = findViewById(R.id.login);
        registration = findViewById(R.id.registration);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotologin = new Intent(getstarted.this,login.class);
                startActivity(gotologin);

            }
        });

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregistrasi = new Intent(getstarted.this,registrasi1.class);
                startActivity(gotoregistrasi);
            }
        });
    }
}