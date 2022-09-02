package com.example.l1_iot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
        }
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