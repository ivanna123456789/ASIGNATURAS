/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Nocturno
 */
public class Trabajador extends Persona{
    //atributos
    private int nrp;
    
    //constructor
    public Trabajador (String _DNI, String _nombre, String _apellido1, String _apellido2, int _nrp){
        super( _DNI, _nombre, _apellido1, _apellido2);
        nrp = _nrp;
    }
    
    //metodos
    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }
    
    public String toString(){
        return super.toString() + ", es trabajador/a con nrp ";
    }
}
