package com.example.calculadora20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoCalculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_calculadora);
        Intent it = getIntent();

        String PrimeiroValor = it.getStringExtra("PrimeiroValor");
        String SegundoValor = it.getStringExtra("SegundoValor");
        String resultado = it.getStringExtra("resultado");

        TextView tvResultado = findViewById(R.id.tvResultado);
        tvResultado.setText(resultado);
    }
}