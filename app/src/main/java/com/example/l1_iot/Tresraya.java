package com.example.l1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tresraya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tresraya);

        Button button1 = findViewById(R.id.ter1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = evaluar();
                TextView textView1 = findViewById(R.id.ter1);
                if(valor == 0){
                    textView1.setText(String.valueOf("X"));
                }else{
                    textView1.setText(String.valueOf("O"));
                }
                actualizar();
            }
        });
        Button button2 = findViewById(R.id.ter2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = evaluar();
                TextView textView1 = findViewById(R.id.ter2);
                if(valor == 0){
                    textView1.setText(String.valueOf("X"));
                }else{
                    textView1.setText(String.valueOf("O"));
                }
                actualizar();
            }
        });
        Button button3 = findViewById(R.id.ter3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = evaluar();
                TextView textView1 = findViewById(R.id.ter3);
                if(valor == 0){
                    textView1.setText(String.valueOf("X"));
                }else{
                    textView1.setText(String.valueOf("O"));
                }
                actualizar();
            }
        });
        Button button4 = findViewById(R.id.ter4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = evaluar();
                TextView textView1 = findViewById(R.id.ter4);
                if(valor == 0){
                    textView1.setText(String.valueOf("X"));
                }else{
                    textView1.setText(String.valueOf("O"));
                }
                actualizar();
            }
        });
        Button button5 = findViewById(R.id.ter5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = evaluar();
                TextView textView1 = findViewById(R.id.ter5);
                if(valor == 0){
                    textView1.setText(String.valueOf("X"));
                }else{
                    textView1.setText(String.valueOf("O"));
                }
                actualizar();
            }
        });
        Button button6 = findViewById(R.id.ter6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = evaluar();
                TextView textView1 = findViewById(R.id.ter6);
                if(valor == 0){
                    textView1.setText(String.valueOf("X"));
                }else{
                    textView1.setText(String.valueOf("O"));
                }
                actualizar();
            }
        });
        Button button7 = findViewById(R.id.ter7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = evaluar();
                TextView textView1 = findViewById(R.id.ter7);
                if(valor == 0){
                    textView1.setText(String.valueOf("X"));
                }else{
                    textView1.setText(String.valueOf("O"));
                }
                actualizar();
            }
        });
        Button button8 = findViewById(R.id.ter8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = evaluar();
                TextView textView1 = findViewById(R.id.ter8);
                if(valor == 0){
                    textView1.setText(String.valueOf("X"));
                }else{
                    textView1.setText(String.valueOf("O"));
                }
                actualizar();
            }
        });
        Button button9 = findViewById(R.id.ter9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = evaluar();
                TextView textView1 = findViewById(R.id.ter9);
                if(valor == 0){
                    textView1.setText(String.valueOf("X"));
                }else{
                    textView1.setText(String.valueOf("O"));
                }
                actualizar();
            }
        });

        Button btnNuevo = findViewById(R.id.btnNuevo);
        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restaurar();
            }
        });
    }

    public int evaluar(){
        TextView textView1 = findViewById(R.id.ter1);
        String text1 = textView1.getText().toString();
        TextView textView2 = findViewById(R.id.ter2);
        String text2 = textView2.getText().toString();
        TextView textView3 = findViewById(R.id.ter3);
        String text3 = textView3.getText().toString();
        TextView textView4 = findViewById(R.id.ter4);
        String text4 = textView4.getText().toString();
        TextView textView5 = findViewById(R.id.ter5);
        String text5 = textView5.getText().toString();
        TextView textView6 = findViewById(R.id.ter6);
        String text6 = textView6.getText().toString();
        TextView textView7 = findViewById(R.id.ter7);
        String text7 = textView7.getText().toString();
        TextView textView8 = findViewById(R.id.ter8);
        String text8 = textView8.getText().toString();
        TextView textView9 = findViewById(R.id.ter9);
        String text9 = textView9.getText().toString();

        return contar(text1)+contar(text2)+contar(text3)+contar(text4)+contar(text5)+contar(text6)+contar(text7)+contar(text8)+contar(text9);
    }

    public int contar(String text){
        if(text.equals("-")){
            return 0;
        }else if(text.equals("X")){
            return 1;
        }else{
            return -1;
        }
    }

    public void actualizar(){
        int centinela = 0;
        String valor = "";
        TextView textView1 = findViewById(R.id.ter1);
        String text1 = textView1.getText().toString();
        TextView textView2 = findViewById(R.id.ter2);
        String text2 = textView2.getText().toString();
        TextView textView3 = findViewById(R.id.ter3);
        String text3 = textView3.getText().toString();
        TextView textView4 = findViewById(R.id.ter4);
        String text4 = textView4.getText().toString();
        TextView textView5 = findViewById(R.id.ter5);
        String text5 = textView5.getText().toString();
        TextView textView6 = findViewById(R.id.ter6);
        String text6 = textView6.getText().toString();
        TextView textView7 = findViewById(R.id.ter7);
        String text7 = textView7.getText().toString();
        TextView textView8 = findViewById(R.id.ter8);
        String text8 = textView8.getText().toString();
        TextView textView9 = findViewById(R.id.ter9);
        String text9 = textView9.getText().toString();

        if(text1.equals(text2) && text1.equals(text3) && !(text1.equals("-"))){
            centinela = 1;
            valor = textView1.getText().toString();
        }
        if(text4.equals(text5) && text4.equals(text6) && !(text4.equals("-"))){
            centinela = 1;
            valor = textView4.getText().toString();
        }
        if(text7.equals(text8) && text7.equals(text9) && !(text7.equals("-"))){
            centinela = 1;
            valor = textView7.getText().toString();
        }
        if(text1.equals(text4) && text1.equals(text7) && !(text1.equals("-"))){
            centinela = 1;
            valor = textView1.getText().toString();
        }
        if(text2.equals(text5) && text2.equals(text8) && !(text2.equals("-"))){
            centinela = 1;
            valor = textView2.getText().toString();
        }
        if(text3.equals(text6) && text3.equals(text9) && !(text3.equals("-"))){
            centinela = 1;
            valor = textView3.getText().toString();
        }
        if(text1.equals(text5) && text1.equals(text9) && !(text1.equals("-"))){
            centinela = 1;
            valor = textView1.getText().toString();
        }
        if(text3.equals(text5) && text3.equals(text7) && !(text3.equals("-"))){
            centinela = 1;
            valor = textView3.getText().toString();
        }
        if(!(text1.equals("-"))&&!(text2.equals("-"))&&!(text3.equals("-"))&&!(text4.equals("-"))&&!(text5.equals("-"))&&!(text6.equals("-"))&&!(text7.equals("-"))&&!(text8.equals("-"))&&!(text9.equals("-"))){
            centinela = -1;
            valor = textView1.getText().toString();
        }

        if(centinela == 1){
            TextView textView = findViewById(R.id.textResultado);
            textView.setText(String.valueOf("Ganó " + valor));
            inhabilitar();
        }
        if(centinela == -1){
            TextView textView = findViewById(R.id.textResultado);
            textView.setText(String.valueOf("Empate"));
            inhabilitar();
        }
    }

    public void restaurar(){
        habilitar();
        TextView textView1 = findViewById(R.id.ter1);
        textView1.setText(String.valueOf("-"));
        TextView textView2 = findViewById(R.id.ter2);
        textView2.setText(String.valueOf("-"));
        TextView textView3 = findViewById(R.id.ter3);
        textView3.setText(String.valueOf("-"));
        TextView textView4 = findViewById(R.id.ter4);
        textView4.setText(String.valueOf("-"));
        TextView textView5 = findViewById(R.id.ter5);
        textView5.setText(String.valueOf("-"));
        TextView textView6 = findViewById(R.id.ter6);
        textView6.setText(String.valueOf("-"));
        TextView textView7 = findViewById(R.id.ter7);
        textView7.setText(String.valueOf("-"));
        TextView textView8 = findViewById(R.id.ter8);
        textView8.setText(String.valueOf("-"));
        TextView textView9 = findViewById(R.id.ter9);
        textView9.setText(String.valueOf("-"));
        TextView textView = findViewById(R.id.textResultado);
        textView.setText(String.valueOf(""));
    }

    public void inhabilitar(){
        Button button1 = findViewById(R.id.ter1);
        button1.setEnabled(false);
        Button button2 = findViewById(R.id.ter2);
        button2.setEnabled(false);
        Button button3 = findViewById(R.id.ter3);
        button3.setEnabled(false);
        Button button4 = findViewById(R.id.ter4);
        button4.setEnabled(false);
        Button button5 = findViewById(R.id.ter5);
        button5.setEnabled(false);
        Button button6 = findViewById(R.id.ter6);
        button6.setEnabled(false);
        Button button7 = findViewById(R.id.ter7);
        button7.setEnabled(false);
        Button button8 = findViewById(R.id.ter8);
        button8.setEnabled(false);
        Button button9 = findViewById(R.id.ter9);
        button9.setEnabled(false);
    }

    public void habilitar(){
        Button button1 = findViewById(R.id.ter1);
        button1.setEnabled(true);
        Button button2 = findViewById(R.id.ter2);
        button2.setEnabled(true);
        Button button3 = findViewById(R.id.ter3);
        button3.setEnabled(true);
        Button button4 = findViewById(R.id.ter4);
        button4.setEnabled(true);
        Button button5 = findViewById(R.id.ter5);
        button5.setEnabled(true);
        Button button6 = findViewById(R.id.ter6);
        button6.setEnabled(true);
        Button button7 = findViewById(R.id.ter7);
        button7.setEnabled(true);
        Button button8 = findViewById(R.id.ter8);
        button8.setEnabled(true);
        Button button9 = findViewById(R.id.ter9);
        button9.setEnabled(true);
    }
}