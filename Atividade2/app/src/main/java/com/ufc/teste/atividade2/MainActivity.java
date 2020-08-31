package com.ufc.teste.atividade2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.ufc.teste.atividade2.controllers.CarController;
import com.ufc.teste.atividade2.model.Car;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter adp;
    ListView ListViewCar;
    EditText digitar_text;

    private CarController carController;
    public static int REQUEST_ADD = 1;
    public static int REQUEST_EDIT = 2;
    private int select;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carController = new CarController();
        select= -1;
        digitar_text = findViewById(R.id.digitar_text);
        digitar_text.setText("");

        adp = new ArrayAdapter(this,android.R.layout.simple_list_item_1,carController.getListCars());

        ListViewCar = findViewById(R.id.lista);
        ListViewCar.setAdapter(adp);
        ListViewCar.setSelector(android.R.color.holo_blue_light);
        //teste

        ListViewCar.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                select = carController.getIdByPosition(i);
                String msg = "Selecionado id: "+ String.valueOf(select);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        }));
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if( resultCode == EditCarActivity.RESULT_CONFIRM && data.getExtras() != null){
            String modelo = (String) data.getExtras().get("modelo");
            String marca = (String) data.getExtras().get("marca");
            Float preco = (Float) data.getExtras().get("preço");

            if(requestCode == REQUEST_ADD){
                carController.addCar(modelo.trim(),marca.trim(),preco);
            }else if(requestCode == REQUEST_EDIT){
                carController.updateCar(select,modelo.trim(),marca.trim(),preco);
            }
            adp.notifyDataSetChanged();
        }   else if(resultCode == EditCarActivity.RESULT_CANCEL){
            Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show();
        }

        digitar_text.setText("");
        select=-1;
    }

    public void on_clickEditar(View view) {
        editar();
    }

    public void on_ClickAdd(View view) {

        adicionar();
    }

    private void adicionar(){
        Intent intent = new Intent(this, EditCarActivity.class);
        startActivityForResult(intent,REQUEST_ADD);
    }

    private void editar(){
        Intent intent2 = new Intent(this,EditCarActivity.class);

        String idString = digitar_text.getText().toString();

        if(idString != "" && !idString.trim().isEmpty() && idString.matches("[0-9]*$")){
            select = Integer.parseInt(idString);
        }

        if(select<0){
            Toast.makeText(this, "Selecione qual item deseja", Toast.LENGTH_SHORT).show();
            return;
        }
        Car car = carController.getCar(select);

        if(car == null){
            Toast.makeText(this, "Não foi encontrado! \n Digite outro identificador,", Toast.LENGTH_SHORT).show();
            return;
        }

        intent2.putExtra("modelo",car.getModelo());
        intent2.putExtra("marca",car.getMarca());
        intent2.putExtra("preço",car.getPreco());

        startActivityForResult(intent2,REQUEST_EDIT);

    }


}