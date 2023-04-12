package com.example.calculadora20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoCalculadora extends AppCompatActivity {
Button buttonVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_calculadora);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ResultadoCalculadora.this, MainActivity.class);
                startActivity(in);
            }
        });

        Intent it = getIntent();

        String PrimeiroValor = it.getStringExtra("PrimeiroValor");
        String SegundoValor = it.getStringExtra("SegundoValor");
        String resultado = it.getStringExtra("resultado");

        TextView tvResultado = findViewById(R.id.tvResultado);
        tvResultado.setText(resultado);
    }
}