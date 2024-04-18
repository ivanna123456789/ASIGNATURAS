/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rect;

/**
 *
 * @author Nocturno
 */
public class Rectangulo {
    //atributos
    private int ancho;
    private int alto;
    
    //constructor
    public Rectangulo(int _ancho, int _alto){
        ancho = _ancho;
        alto = _alto;
    }
    
    //metodos
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public int getArea(){
        return ancho * alto;
    }
    
}
