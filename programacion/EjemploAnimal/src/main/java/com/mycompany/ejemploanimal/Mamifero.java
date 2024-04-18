/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploanimal;

/**
 *
 * @author Nocturno
 */
public class Mamifero extends Animal{
    //atributos
    private int gestacion;
    
    
    //constructores
    public Mamifero(){
    }
    
    public Mamifero(String _nombre, String _tipo_alimentacion, int _edad, int _gestacion){
        super(_nombre, _tipo_alimentacion, _edad);
        gestacion = _gestacion;
    }
    
    //metodos
    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }
    
    public String toString(){
        return super.toString() + " con una gestacion de " + gestacion ;
    }
    
}
