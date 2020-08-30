package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CliqueLongo extends AppCompatActivity {

    Button buttonClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clique_longo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonClick = findViewById(R.id.buttonCLick);
        buttonClick.setOnLongClickListener(new View.OnLongClickListener(){


            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(CliqueLongo.this, "Pressionou o tempo suficiente",2000).show();
                return true;
            }
        });

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CliqueLongo.this, "Não pressionou o suficiente, tente novamente", 1000).show();
            }
        });


    }
}