package com.example.app_sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View v){
// aqui é a ação gerada com o clique do botão "Sortear"

        int x = new Random().nextInt(11); // randomização de números de 0 a 10;

        TextView texto = findViewById(R.id.textResult);
        texto.setText("O número sorteado foi:   "+x);

    }

}