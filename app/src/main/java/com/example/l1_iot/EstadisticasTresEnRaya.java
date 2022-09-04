package com.example.l1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EstadisticasTresEnRaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas_tres_en_raya);

        Intent intent = getIntent();
        ArrayList<String> listajuegos = intent.getStringArrayListExtra("listajuegos");
        mostrarJuegos(listajuegos);

        Button btnNuevoJuego = findViewById(R.id.btnNuevoJuego);
        btnNuevoJuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(EstadisticasTresEnRaya.this,Tresraya.class);
                intent2.putExtra("listajuegos",listajuegos);
                startActivity(intent2);
            }
        });
    }

    public void mostrarJuegos(ArrayList<String> listajuegos){
        TextView view = findViewById(R.id.textDatos);
        if(listajuegos.size()>0){
            int i = 1;
            String mensaje = "";
            for(String juego : listajuegos){
                mensaje+="Juego "+i+" : "+ juego+"\n ";
                i++;
            }
            view.setText(mensaje);
        }else{
            view.setText("Aun no hay juegos disponibles");
        }
    }
}