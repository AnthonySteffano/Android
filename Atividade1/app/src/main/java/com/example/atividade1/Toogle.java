package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Toogle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toogle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void onDefaultToogleClick(View view) {
        Toast.makeText(this, "test1", Toast.LENGTH_SHORT).show();
    }

    public void onDefault(View view) {
        Toast.makeText(this, "teste2", Toast.LENGTH_SHORT).show();
    }
}