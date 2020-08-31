package com.ufc.teste.atividade2.data;


import com.ufc.teste.atividade2.model.Car;

import java.util.ArrayList;

public class DataCar {

    private static DataCar INSTANCE;
    private static ArrayList<Car> cars;

    private DataCar(){
        cars = new ArrayList<Car>();
    }

    public static DataCar getInstance(){
        if(INSTANCE == null)
            INSTANCE = new DataCar();
            return  INSTANCE;
    }

    public  static  ArrayList<Car> getCars(){
        return cars;
    }

    public int getIdByPosition(int position){
        return cars.get(position).getId();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeBook(int id){
        for(Car car: cars){
            if(car.getId() == id){
                cars.remove(car);
                return;
            }
        }
    }

    public Car getCar(int id){
        for (Car car: cars){
            if(car.getId()==id){
                return car;
            }
        }
        return null;
        //teste
    }

    public void updateBook(int id, String modelo, String marca, Float preco ){
        for(Car car: cars){
            if(car.getId()== id){
                car.setModelo(modelo);
                car.setMarca(marca);
                car.setPreco(preco);
            }
        }
    }
}
