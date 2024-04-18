/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebapoo2;

/**
 *
 * @author Nocturno
 */
public class Circulo {
    //atributos
    private double radio;
    private String color;
    
    //constructor
    public Circulo (double _radio, String _color){ //el nombre  del public tiene que ser igual a la clase que he creado
        radio = _radio;
        color = _color;
    }
    
    public Circulo (double _radio){
        radio = _radio;
    }
    
    //Metodo

    public double getRadio() {//funcion
        return radio;
    }

    public void setRadio(double radio) {//procedimiento
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}
