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
        int centinela = 2;
        for (int i = 0; i < 9; i++) {
            if(i==0){
                Button button1 = findViewById(R.id.ter1);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView textView1 = findViewById(R.id.ter1);
                        String texto1 =  textView1.getText().toString();
                        if(texto1.equals("-")){
                            textView1.setText(String.valueOf("X"));
                            actualizar();
                        }
                    }
                });
                Button button2 = findViewById(R.id.ter2);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView textView1 = findViewById(R.id.ter2);
                        String texto1 =  textView1.getText().toString();
                        if(texto1.equals("-")){
                            textView1.setText(String.valueOf("X"));
                            actualizar();
                        }
                    }
                });
                Log.d("msg","" + centinela);
                centinela = 1;
                Log.d("msg","fffffff");
                Log.d("msg","" + centinela);
            }else{
                if(centinela==0){
                    Button button1 = findViewById(R.id.ter1);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            TextView textView1 = findViewById(R.id.ter1);
                            String texto1 =  textView1.getText().toString();
                            if(texto1.equals("-")){
                                textView1.setText(String.valueOf("X"));
                                actualizar();
                            }
                        }
                    });
                    Button button2 = findViewById(R.id.ter2);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            TextView textView1 = findViewById(R.id.ter2);
                            String texto1 =  textView1.getText().toString();
                            if(texto1.equals("-")){
                                textView1.setText(String.valueOf("X"));
                                actualizar();
                            }
                        }
                    });
                    Log.d("msg","" + centinela);
                    centinela = 1;
                    Log.d("msg","fffffff");
                    Log.d("msg","" + centinela);
                }else{
                    Button button1 = findViewById(R.id.ter1);
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            TextView textView1 = findViewById(R.id.ter1);
                            String texto1 =  textView1.getText().toString();
                            if(texto1.equals("-")){
                                textView1.setText(String.valueOf("O"));
                                actualizar();

                            }
                        }
                    });
                    Button button2 = findViewById(R.id.ter2);
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            TextView textView1 = findViewById(R.id.ter2);
                            String texto1 =  textView1.getText().toString();
                            if(texto1.equals("-")){
                                textView1.setText(String.valueOf("O"));
                                actualizar();
                            }
                        }
                    });
                    Log.d("msg","" + centinela);
                    centinela = 0;
                    Log.d("msg","fffffff");
                    Log.d("msg","" + centinela);
                }


            }
        }
    }

    public void actualizar(){
        int centinela = 0;
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
        }
        if(text4.equals(text5) && text4.equals(text6) && !(text4.equals("-"))){
            centinela = 1;
        }
        if(text7.equals(text8) && text7.equals(text9) && !(text7.equals("-"))){
            centinela = 1;
        }
        if(text1.equals(text4) && text1.equals(text7) && !(text1.equals("-"))){
            centinela = 1;
        }
        if(text2.equals(text5) && text1.equals(text8) && !(text2.equals("-"))){
            centinela = 1;
        }
        if(text3.equals(text6) && text1.equals(text9) && !(text3.equals("-"))){
            centinela = 1;
        }
        if(text1.equals(text5) && text1.equals(text9) && !(text1.equals("-"))){
            centinela = 1;
        }
        if(text3.equals(text5) && text1.equals(text7) && !(text3.equals("-"))){
            centinela = 1;
        }

        if(centinela == 1){
            TextView textView = findViewById(R.id.textResultado);
            textView.setText(String.valueOf("Se acabo"));
        }
    }

}