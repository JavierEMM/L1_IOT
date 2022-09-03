package com.example.l1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Memoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria);
        String[] abecedario = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
        List<String> listaAbc = Arrays.asList(abecedario);
        ArrayList listPosicionesAbc = getRandomNonRepeatingIntegers(8,0,listaAbc.size());
        Integer[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        List<Integer> listaNumBtn = Arrays.asList(numeros);
        Collections.shuffle(listaNumBtn,new Random());

        int contador = 0;
        for(int i=0;i<(listPosicionesAbc.size());i++){
            //Log.d("msg","Los valores de i son "+i);
           // Log.d("msg","Los valores de contador son "+contador);
            //Log.d("msg","Los valores de contador +1 son "+(contador+1));
            //TextView btn1 = obtenerBoton(listaNumBtn.get(contador));
            //TextView btn2 = obtenerBoton(listaNumBtn.get(contador+1));
            String str = listaAbc.get((Integer)listPosicionesAbc.get(i));
            Log.d("msg","La letra es "+str);
            Log.d("msg","El orden es:"+listaNumBtn.get(contador));
            Log.d("msg","El orden es:"+listaNumBtn.get(contador+1));
            modificarBoton(listaNumBtn.get(contador),str);
            modificarBoton(listaNumBtn.get(contador+1),str);
            //btn1.setText(listaAbc.get((Integer)listPosicionesAbc.get(i)));
            //btn2.setText(listaAbc.get((Integer)listPosicionesAbc.get(i)).toString());
            contador+=2;


            //Log.d("msg","El valor obtenido del boton es: "+btn1.getText().toString());
            //Log.d("msg","El valor obtenido del boton es: "+btn2.getText().toString());

        }



    }

    public void modificarBoton(Integer num,String str){
        int n = num;
        TextView textView;
        switch (n){
            case 1:
                textView=findViewById(R.id.btn1);
                break;
            case 2:
                textView=findViewById(R.id.btn2);
                break;
            case 3:
                textView=findViewById(R.id.btn3);
                break;
            case 4:
                textView=findViewById(R.id.btn4);
                break;
            case 5:
                textView=findViewById(R.id.btn5);
                break;
            case 6:
                textView=findViewById(R.id.btn6);
                break;
            case 7:
                textView=findViewById(R.id.btn7);
                break;
            case 8:
                textView=findViewById(R.id.btn8);
                break;
            case 9:
                textView=findViewById(R.id.btn9);
                break;
            case 10:
                textView=findViewById(R.id.btn10);
                break;
            case 11:
                textView=findViewById(R.id.btn11);
                break;
            case 12:
                textView=findViewById(R.id.btn12);
                break;
            case 13:
                textView=findViewById(R.id.btn13);
                break;
            case 14:
                textView=findViewById(R.id.btn14);
                break;
            case 15:
                textView=findViewById(R.id.btn15);
                break;
            default:
                textView=findViewById(R.id.btn16);
                break;
        }

        textView.setText(str);
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