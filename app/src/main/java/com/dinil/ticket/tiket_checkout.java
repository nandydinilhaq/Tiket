package com.dinil.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class tiket_checkout extends AppCompatActivity {

    Button back, bayar_tiket, btnmines, btnplus;
    TextView jumlah_tiket, total_saldo, total_harga;

    ImageView notice_saldo;

    Integer valuejumlahtiket = 1;
    Integer saldo = 1000000;
    Integer valuetotalharga = 0;
    Integer valuehargatiket = 300000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tiket_checkout);

        back=findViewById(R.id.back);
        bayar_tiket=findViewById(R.id.bayar_tiket);
        btnmines = findViewById(R.id.btnmines);
        btnplus = findViewById(R.id.btnplus);
        jumlah_tiket = findViewById(R.id.jumlah_tiket);
        total_saldo = findViewById(R.id.total_saldo);
        total_harga = findViewById(R.id.total_harga);
        notice_saldo = findViewById(R.id.notice_saldo);

        //setting value baru untuk beberapa komponen
        jumlah_tiket.setText(valuejumlahtiket.toString());
        total_saldo.setText("Rp " + saldo+"");
        valuetotalharga = valuehargatiket*valuejumlahtiket;
        total_harga.setText("Rp " + valuetotalharga+"");
        notice_saldo.setVisibility(View.GONE);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        bayar_tiket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suksesbelitiket = new Intent(tiket_checkout.this, sukses_beli.class);
                startActivity(suksesbelitiket);
                finish();
            }
        });

        btnmines.animate().alpha(0).setDuration(300).start();
        btnmines.setEnabled(false);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuejumlahtiket+=1;
                jumlah_tiket.setText(valuejumlahtiket.toString());
                if (valuejumlahtiket > 1) {
                    btnmines.animate().alpha(1).setDuration(300).start();
                    btnmines.setEnabled(true);
                }
                valuetotalharga = valuehargatiket*valuejumlahtiket;
                total_harga.setText("Rp " + valuetotalharga+"");
                if(valuetotalharga > saldo) {
                    bayar_tiket.animate().alpha(0).setDuration(300).start();
                    bayar_tiket.setEnabled(false);
                    total_saldo.setTextColor(Color.RED);
                    notice_saldo.setVisibility(View.VISIBLE);
                }

            }
        });

        btnmines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuejumlahtiket-= 1;
                jumlah_tiket.setText(valuejumlahtiket.toString());
                if (valuejumlahtiket < 2) {
                    btnmines.animate().alpha(0).setDuration(300).start();
                    btnmines.setEnabled(false);
                }
                valuetotalharga = valuehargatiket*valuejumlahtiket;
                total_harga.setText("Rp " + valuetotalharga+"");
                if(valuetotalharga < saldo){
                    bayar_tiket.animate().alpha(1).setDuration(300).start();
                    bayar_tiket.setEnabled(true);
                    total_saldo.setTextColor(Color.GREEN);
                    notice_saldo.setVisibility(View.GONE);

                }

            }
        });

    }
}