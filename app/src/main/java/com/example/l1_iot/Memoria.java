package com.example.l1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Memoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria);
        String[] abecedario = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
        List<String> lista = Arrays.asList(abecedario);
        int longitud_lista = lista.size();
        ArrayList list = getRandomNonRepeatingIntegers(8,0,lista.size());


        for (int i = 0; i < list.size(); i++) {
            Log.d("msg","" + list.get(i));
            TextView textView = obtenerBoton(i);
        }



    }

    public TextView obtenerBoton(int num){
        TextView textView;
        switch (num){
            case 1:
                textView=findViewById(R.id.btn1);
            case 2:
                textView=findViewById(R.id.btn2);
            case 3:
                textView=findViewById(R.id.btn3);
            case 4:
                textView=findViewById(R.id.btn4);
            case 5:
                textView=findViewById(R.id.btn5);
            case 6:
                textView=findViewById(R.id.btn6);
            case 7:
                textView=findViewById(R.id.btn7);
            case 8:
                textView=findViewById(R.id.btn8);
            case 9:
                textView=findViewById(R.id.btn9);
            case 10:
                textView=findViewById(R.id.btn10);
            case 11:
                textView=findViewById(R.id.btn11);
            case 12:
                textView=findViewById(R.id.btn12);
            case 13:
                textView=findViewById(R.id.btn13);
            case 14:
                textView=findViewById(R.id.btn14);
            case 15:
                textView=findViewById(R.id.btn15);
            default:
                textView=findViewById(R.id.btn16);
        }

        return textView;
    }

    public static ArrayList getRandomNonRepeatingIntegers(int size, int min, int max) {
        ArrayList numbers = new ArrayList();
        Random random = new Random();
        while (numbers.size() < size) {
            //Get Random numbers between range
            int randomNumber = random.nextInt((max - min) + 1) + min;
            //Check for duplicate values
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }
}