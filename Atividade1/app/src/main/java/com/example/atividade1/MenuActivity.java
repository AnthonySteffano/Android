package com.example.atividade1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"Item 1 selecionado", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, "Item 2 Selecionado", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        setContentView(R.layout.activity_menu);


        Button ButToogle = (Button) findViewById(R.id.buttonToogle);
        ButToogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1;
                intent1 = new Intent(MenuActivity.this,Toogle.class);
                startActivity(intent1);
            }
        });


        Button ButLogin = (Button) findViewById(R.id.btnArray);
        ButLogin.setOnClickListener(new View.OnClickListener(){

            public void onClick (View args0){
                Intent intent2;
                intent2 = new Intent(MenuActivity.this, ArrayLists.class);
                startActivity(intent2);
              //  MenuActivity.this.finish();
            }
        } );

        Button But2 = (Button) findViewById(R.id.buttonAut);
        But2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args1) {
                Intent intent3;
                intent3 = new Intent(MenuActivity.this,AutoComplete.class);
                startActivity(intent3);
                //MenuActivity.this.finish();
            }
        });

        Button But3 = (Button) findViewById(R.id.button_Spin);
        But3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args2) {
                Intent intent4;
                intent4 = new Intent(MenuActivity.this, SpinnerActivity.class);
                startActivity(intent4);
               // MenuActivity.this.finish();
            }
        });


        Button But4 = (Button) findViewById(R.id.button_radio);
        But4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args2) {
                Intent intent5;
                intent5 = new Intent(MenuActivity.this, RadioButt.class);
                startActivity(intent5);
                // MenuActivity.this.finish();
            }
        });

        Button But5 = (Button) findViewById(R.id.buttonMenuPop);
        But5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args2) {
                Intent intent6;
                intent6 = new Intent(MenuActivity.this, dropdown_popUp.class);
                startActivity(intent6);
                // MenuActivity.this.finish();
            }
        });

        Button But6 = (Button) findViewById(R.id.buttonLongPress);
        But6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args2) {
                Intent intent7;
                intent7 = new Intent(MenuActivity.this, CliqueLongo.class);
                startActivity(intent7);
                // MenuActivity.this.finish();
            }
        });

//        Button But7 = (Button) findViewById(R.id.buttonTab);
//        But7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View args2) {
//                Intent intent8;
//                intent8 = new Intent(MenuActivity.this, Tab.class);
//                startActivity(intent8);
//                // MenuActivity.this.finish();
//            }
//        });






    }
}