package com.ufc.teste.atividade2.controllers;

import com.ufc.teste.atividade2.data.DataCar;
import com.ufc.teste.atividade2.model.Car;

import java.util.ArrayList;

public class CarController {

    private DataCar listCar;

    public CarController(){
        listCar = DataCar.getInstance();
    }


    public void addCar(String modelo, String marca, float preco){
        listCar.addCar(new Car(modelo,marca,preco));
    }

    public void removeCar(int id){
        listCar.removeBook(id);
    }

    public void updateCar(int id, String modelo, String marca, Float preco){
        listCar.updateBook(id,modelo,marca,preco);
    }

    public int getIdByPosition(int position){
        return listCar.getIdByPosition(position);
    }

    public Car getCar(int id){
        return listCar.getCar(id);
    }

    public ArrayList<Car> getListCars(){
        return listCar.getCars();
    }
}
