/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocomercial;

/**
 *
 * @author Nocturno
 */
public class Revistas extends Libreria{
    //atributos
    private String tema;
    private int edicion;
    
    //cosntructores
    public Revistas(String _ciudad, String _horario, String _tipo, int _numhojas, String _tema, int _edicion){
        super(_ciudad, _horario, _tipo, _numhojas);
        tema = _tema;
        edicion = _edicion;
    }
    
    //metodos
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    
    public String toString(){
        return super.toString() + ", las revistas son de tema " + tema + " y son de la edicion numero " + edicion;
    }
}
