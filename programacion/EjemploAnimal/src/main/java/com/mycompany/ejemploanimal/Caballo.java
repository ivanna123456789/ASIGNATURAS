/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploanimal;

/**
 *
 * @author Nocturno
 */
public class Caballo extends Mamifero{
    //atributos
    private String comida;
    private int ejercicio;
    
    //metodos
    public Caballo(){
    }
    
    public Caballo(String _nombre, String _tipo_alimentacion, int _edad, int _gestacion, String _comida, int _ejercicio){
        super( _nombre, _tipo_alimentacion, _edad, _gestacion);
        comida = _comida;
        ejercicio = _ejercicio;
    }
    
    //constructores
    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }
    
    public String toString(){
        return super.toString() + ", su comida es " + comida + " y el ejercicio que hace es " + ejercicio;
    }
}
