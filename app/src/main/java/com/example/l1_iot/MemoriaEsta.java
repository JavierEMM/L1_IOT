package com.example.l1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MemoriaEsta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria_esta);
        Intent intent = this.getIntent();
        ArrayList<String> listajuegos = intent.getStringArrayListExtra("listajuegos");
        TextView view = findViewById(R.id.descripcionEsta);
        if(listajuegos.size()>0){
            int i = 1;
            String mensaje = "";
            for(String juego : listajuegos){
                mensaje+="Juego "+i+" "+ juego+"\n ";
                i++;
            }
            view.setText(mensaje);
        }else{
            view.setText("Aun no hay juegos disponibles");
        }

    }
}