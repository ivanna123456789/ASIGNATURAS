/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocomercial;

/**
 *
 * @author Nocturno
 */
public class Libros extends Libreria{
    //atributos
    private boolean tapa;
    
    //constructores
    public Libros(String _ciudad, String _horario, String _tipo, int _numhojas, boolean _tapa){
        super(_ciudad, _horario, _tipo, _numhojas);
        tapa = _tapa;
    }
    
    //metodo
    public boolean getTapa() {
        return tapa;
    }

    public void setTapa(boolean tapa) {
        this.tapa = tapa;
    }
    
    public String toString(){
        if(tapa){
            return super.toString() + ", los libros tienen una tapa blanda" ;
        }else{
            return super.toString() + ", los libros tienen una tapa dura" ;
        }
    }
}
