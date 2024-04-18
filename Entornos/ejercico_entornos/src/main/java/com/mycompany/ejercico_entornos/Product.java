/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercico_entornos;

/**
 *
 * @author Ivanna Ariza
 */
public class Product {
    //atributs
    public String nombre;
    public double price;
    
    //contructor
    public Product(String _nombre, double _price){
        nombre = _nombre;
        price = _price;
    }
    
    //metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
