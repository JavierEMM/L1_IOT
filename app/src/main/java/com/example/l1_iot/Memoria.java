package com.example.l1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Memoria extends AppCompatActivity {

    private ArrayList<String> letras;
    private ArrayList<String> letras_confirm = new ArrayList<>();
    private Button boton_anterior = null;
    private Integer contador = 0;
    private ArrayList<String> juegos = new ArrayList<>();
    private Integer numeroIntentos = 0;
    private Long instante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent2 = this.getIntent();
        if(intent2.getStringArrayListExtra("listajuegos") != null){
            juegos = intent2.getStringArrayListExtra("listajuegos");
        }
        setContentView(R.layout.activity_memoria);
        String[] abecedario = {"A","B","C","D","E","F","G","H"};
        seleccionarLetras(abecedario);
        ((Button) findViewById(R.id.btnNew)).setOnClickListener(view -> {
            if (contador != 8 && numeroIntentos != 0){
                juegos.add("Se canceló el juego");
                contador = 0;
            }
            TextView view2 = findViewById(R.id.mensajeFinal);
            view2.setText("");
            seleccionarLetras(abecedario);
        });
        ((Button) findViewById(R.id.btnEsta)).setOnClickListener(view -> {
            if (contador != 8 && numeroIntentos != 0){
                juegos.add("Se canceló el juego");
                contador = 0;
            }
            Intent intent = new Intent(Memoria.this,MemoriaEsta.class);
            intent.putExtra("listajuegos",juegos);
            startActivity(intent);
        });
    }
    public void abrirBoton(View view){
        Button button = (Button) view;
        switch (button.getId()){
            case R.id.btn1:
                comprobarMemoria(0,button);
                break;
            case R.id.btn2:
                comprobarMemoria(1,button);
                break;
            case R.id.btn3:
                comprobarMemoria(2,button);
                break;
            case R.id.btn4:
                comprobarMemoria(3,button);
                break;
            case R.id.btn5:
                comprobarMemoria(4,button);
                break;
            case R.id.btn6:
                comprobarMemoria(5,button);
                break;
            case R.id.btn7:
                comprobarMemoria(6,button);
                break;
            case R.id.btn8:
                comprobarMemoria(7,button);
                break;
            case R.id.btn9:
                comprobarMemoria(8,button);
                break;
            case R.id.btn10:
                comprobarMemoria(9,button);
                break;
            case R.id.btn11:
                comprobarMemoria(10,button);
                break;
            case R.id.btn12:
                comprobarMemoria(11,button);
                break;
            case R.id.btn13:
                comprobarMemoria(12,button);
                break;
            case R.id.btn14:
                comprobarMemoria(13,button);
                break;
            case R.id.btn15:
                comprobarMemoria(14,button);
                break;
            default:
                comprobarMemoria(15,button);
                break;
        }
    }
    public void comprobarMemoria(int numero, Button button){
        numeroIntentos++;
        if(letras_confirm.size()==0){
            letras_confirm.add(letras.get(numero));
            button.setText(letras.get(numero));
            boton_anterior = button;
        }else{
            if(letras_confirm.get(0).equals(letras.get(numero))){
                button.setText(letras.get(numero));
                contador++;
                if(contador == 8){
                    TextView view = findViewById(R.id.mensajeFinal);
                    Long final_tiempo = System.currentTimeMillis();
                    Long resta_tiempos= (final_tiempo - instante)/60000;
                    view.setText("GANASTE CON : " + resta_tiempos +" Minutos");
                    juegos.add("Se termino el juego en " +resta_tiempos + " minutos");
                    numeroIntentos = 0;
                    contador = 0;

                }
            }else{
                button.setText(letras.get(numero));
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        boton_anterior.setText("-");
                        button.setText("-");
                    }
                }, 1000);
            }
            letras_confirm = new ArrayList<>();
        }
    }

    public void cleanButtons (int size){
        for(int i=0;i<size;i++){
            modificarBoton(i,"-");
        }
    }

    public void modificarBoton(Integer num,String str){
        int n = num;
        TextView textView;
        switch (n){
            case 0:
                textView=findViewById(R.id.btn1);
                break;
            case 1:
                textView=findViewById(R.id.btn2);
                break;
            case 2:
                textView=findViewById(R.id.btn3);
                break;
            case 3:
                textView=findViewById(R.id.btn4);
                break;
            case 4:
                textView=findViewById(R.id.btn5);
                break;
            case 5:
                textView=findViewById(R.id.btn6);
                break;
            case 6:
                textView=findViewById(R.id.btn7);
                break;
            case 7:
                textView=findViewById(R.id.btn8);
                break;
            case 8:
                textView=findViewById(R.id.btn9);
                break;
            case 9:
                textView=findViewById(R.id.btn10);
                break;
            case 10:
                textView=findViewById(R.id.btn11);
                break;
            case 11:
                textView=findViewById(R.id.btn12);
                break;
            case 12:
                textView=findViewById(R.id.btn13);
                break;
            case 13:
                textView=findViewById(R.id.btn14);
                break;
            case 14:
                textView=findViewById(R.id.btn15);
                break;
            default:
                textView=findViewById(R.id.btn16);
                break;
        }
        textView.setText(str);
    }

    public void seleccionarLetras(String [] cadena){
        instante = System.currentTimeMillis();
        ArrayList<String> lista = new ArrayList<>();
        List<String> chocolatear = Arrays.asList(cadena);
        Collections.shuffle(chocolatear,new Random());
        for(int i = 0;i<8;i++){
            lista.add(chocolatear.get(i));
            lista.add(chocolatear.get(i));
        }
        Collections.shuffle(lista,new Random());
        letras = lista;
        for(int i = 0;i<lista.size();i++){
            modificarBoton(i,lista.get(i));
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                cleanButtons(lista.size());
            }
        }, 1000);
    }
}