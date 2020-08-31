package com.ufc.teste.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditCarActivity extends AppCompatActivity {

    public static int RESULT_CONFIRM = 1;
    public static int RESULT_CANCEL = 0;

    private EditText editModelo;
    private EditText editMarca;
    private EditText editPreco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_car);


        editModelo = findViewById(R.id.edit_modelo);
        editMarca = findViewById(R.id.edit_marca);
        editPreco = findViewById(R.id.edit_preco);

        if( getIntent().getExtras() != null){
            String modelo = (String) getIntent().getExtras().get("Modelo");
            String marca = (String) getIntent().getExtras().get("Marca");
            String preco = (String) getIntent().getExtras().get("Preço");

            editModelo.setText(modelo);
            editMarca.setText(marca);
            editPreco.setText(String.valueOf(preco));
        }

    }

    public void onClick_confirma(View view){
        Intent intent = new Intent();

        String modelo = editModelo.getText().toString();
        String marca = editMarca.getText().toString();
        String precoString = editPreco.getText().toString();

        if(validar(modelo) || validar(marca) || validar(precoString))

            Toast.makeText(this, "Está faltando:", Toast.LENGTH_SHORT).show();
            return;
    }


    public void  onClick_cancela(View view){
        setResult(RESULT_CANCEL);
        finish();
    }


    private boolean validar(String e){
        if(e == null || e.trim().isEmpty())
        return true;

        return false;
    }


}