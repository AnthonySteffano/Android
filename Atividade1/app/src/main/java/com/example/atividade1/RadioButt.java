package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButt extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_butt);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.text_view_selected);
        Button buttonEnviar = findViewById(R.id.button_enviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);
                textView.setText("Você escolheu : "+ radioButton.getText());

            }
        });

    }
            public void checkButton(View v){
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                Toast.makeText(this,"Selectione qual vídeo game você tem:"+ radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
}