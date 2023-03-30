package com.example.calculadora20;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText PrimeiroValor;
    EditText SegundoValor;
    Button buttonSoma;

    Button buttonIgual;
    Button buttonSubtracao;

    Button buttonMulti;

    Button buttonDivisao;

    double dResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrimeiroValor = findViewById(R.id.PrimeiroValor);
        SegundoValor = findViewById(R.id.SegundoValor);
        buttonSoma = findViewById(R.id.buttonSoma);
        buttonSubtracao = findViewById(R.id.buttonSubtracao);
        buttonMulti = findViewById(R.id.buttonMulti);
        buttonDivisao = findViewById(R.id.buttonDivisao);
        buttonIgual = findViewById(R.id.buttonIgual);

        buttonSoma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(PrimeiroValor.getText().toString());
                double valor2 = Double.parseDouble(SegundoValor.getText().toString());
                double resultado = valor1 +valor2;
                dResultado=resultado;
            }
        });
        buttonSubtracao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(PrimeiroValor.getText().toString());
                double valor2 = Double.parseDouble(SegundoValor.getText().toString());
                double resultado = valor1 - valor2;
                dResultado=resultado;
            }
        });//teste
        buttonMulti.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(PrimeiroValor.getText().toString());
                double valor2 = Double.parseDouble(SegundoValor.getText().toString());
                double resultado = valor1 * valor2;
                dResultado=resultado;
            }
        });
        buttonDivisao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(PrimeiroValor.getText().toString());
                double valor2 = Double.parseDouble(SegundoValor.getText().toString());
                double resultado = valor1 / valor2;
                dResultado=resultado;
            }
        });

        buttonIgual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
        Intent in = new Intent(MainActivity.this, ResultadoCalculadora.class);
        in.putExtra("PrimeiroValor", PrimeiroValor.getText().toString());
        in.putExtra("SegundoValor", SegundoValor.getText().toString());
        in.putExtra("resultado", String.valueOf(dResultado));
        startActivity(in);
            }
        });
    }
}