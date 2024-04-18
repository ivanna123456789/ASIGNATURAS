/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Nocturno
 */
public class Alumno extends Persona{
    //atributos
    private int NIA;
    
    //constructor
    public Alumno(String _DNI, String _nombre, String _apellido1, String _apellido2, int _NIA){
        super ( _DNI, _nombre, _apellido1, _apellido2);
        NIA = _NIA;
    }
    
    //METODOS
    public int getNIA(){
        return NIA;
    }

    public void setNIA(int NIA) {
        this.NIA = NIA;
    }

    public String toString() {
        return super.toString() + " es un alumno con NIA " + NIA;
    }
}
