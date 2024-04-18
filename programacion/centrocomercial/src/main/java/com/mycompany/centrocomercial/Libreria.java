/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocomercial;

/**
 *
 * @author Nocturno
 */
public class Libreria extends Centro{
    //atributos
    private String tipo;
    private int numhojas;
    
    //constructor
    public Libreria(String _ciudad, String _horario, String _tipo, int _numhojas){
        super(_ciudad, _horario);
        tipo = _tipo;
        numhojas = _numhojas;
    }
    
            
    //metodos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumhojas() {
        return numhojas;
    }

    public void setNumhojas(int numhojas) {
        this.numhojas = numhojas;
    }
    
    public String toString(){
        return super.toString() + ", en la libreria se venden libros de tipo " + tipo + "con un numero de hojas de " + numhojas;
    }
      
}
