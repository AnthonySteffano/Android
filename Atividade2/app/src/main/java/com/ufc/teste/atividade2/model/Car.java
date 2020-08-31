package com.ufc.teste.atividade2.model;

import androidx.annotation.NonNull;

public class Car {

    private  static int id_dynamic = 0;
    private int id;
    private String modelo;
    private String marca;
    private Float preco;

    public Car(String modelo, String marca, float preco) {
        this.id = ++id_dynamic;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }


    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "id: "+id+ ",Modelo: "+ modelo + " Marca: "+ marca + "Preço: R$ "+preco;
    }
}
