package com.example.l1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById((R.id.btnMemoria))).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Memoria.class);
            startActivity(intent);
        });
        ((Button) findViewById((R.id.btnTresEnRaya))).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Tresraya.class);
            startActivity(intent);
        });
    }
}