package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.lang.ref.Reference;

public class registrasi1 extends AppCompatActivity {


    TextView login;
    Button daftar;

    TextInputEditText username, email, password, no_telp, hobby;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrasi1);


        login = findViewById(R.id.login);
        daftar = findViewById(R.id.daftar);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        no_telp = findViewById(R.id.no_telp);
        hobby = findViewById(R.id.hobby);

         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent gotologin = new Intent(registrasi1.this,login.class);
                 startActivity(gotologin);
             }
         });



         daftar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 //berpindah activity
                 Intent gotosuksesregistrasi = new Intent(registrasi1.this,sukses_registrasi.class);
                 startActivity(gotosuksesregistrasi);
                 finish();
             }
         });
    }
}