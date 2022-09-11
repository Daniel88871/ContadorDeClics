package com.example.contadordeclics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contador11, contador12, contador13, contador14, contadorfull;
    TextView contadorDeClics1, contadorDeClics2, contadorDeClics3, contadorDeClics4, contadorGeneral;
    Button augmentarElContador, resetearElContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorGeneral = findViewById(R.id.contadorgeneral);
        contadorDeClics1 = findViewById(R.id.contador1);
        contadorDeClics2 = findViewById(R.id.contador2);
        contadorDeClics3 = findViewById(R.id.contador3);
        contadorDeClics4 = findViewById(R.id.contador4);

        //contador general
        resetearElContador = findViewById(R.id.resetall);
        resetearElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador11 = 0;
                contador12 = 0;
                contador13 = 0;
                contador14 = 0;
                contadorfull = 0;
                contadorDeClics1.setText("0");
                contadorDeClics2.setText("0");
                contadorDeClics3.setText("0");
                contadorDeClics4.setText("0");
                contadorGeneral.setText("0");
            }
        });

        //1er contador
        augmentarElContador = findViewById(R.id.boton1);
        augmentarElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador11++;
                contadorfull++;
                contadorDeClics1.setText(contador11 + "");
                contadorGeneral.setText(contadorfull + "");
            }
        });

        resetearElContador = findViewById(R.id.reset1);
        resetearElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorfull = contadorfull - contador11;
                contadorGeneral.setText(contadorfull + "");
                contador11 = 0;
                contadorDeClics1.setText("0");
            }
        });

        //2do contador
        augmentarElContador = findViewById(R.id.boton2);
        augmentarElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador12++;
                contadorfull++;
                contadorDeClics2.setText(contador12 + "");
                contadorGeneral.setText(contadorfull + "");
            }
        });

        resetearElContador = findViewById(R.id.reset2);
        resetearElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorfull = contadorfull - contador12;
                contadorGeneral.setText(contadorfull + "");
                contador12 = 0;
                contadorDeClics2.setText("0");
            }
        });

        //3er contador
        augmentarElContador = findViewById(R.id.boton3);
        augmentarElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador13++;
                contadorfull++;
                contadorDeClics3.setText(contador13 + "");
                contadorGeneral.setText(contadorfull + "");
            }
        });

        resetearElContador = findViewById(R.id.reset3);
        resetearElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorfull = contadorfull - contador13;
                contadorGeneral.setText(contadorfull + "");
                contador13 = 0;
                contadorDeClics3.setText("0");
            }
        });

        //4to contador
        augmentarElContador = findViewById(R.id.boton4);
        augmentarElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador14++;
                contadorfull++;
                contadorDeClics4.setText(contador14 + "");
                contadorGeneral.setText(contadorfull + "");
            }
        });

        resetearElContador = findViewById(R.id.reset4);
        resetearElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorfull = contadorfull - contador14;
                contadorGeneral.setText(contadorfull + "");
                contador14 = 0;
                contadorDeClics4.setText("0");
            }
        });
    }
}