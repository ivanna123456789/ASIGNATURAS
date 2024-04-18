/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Nocturno
 */
public class Persona {
    //atributos
    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    
    //constructores
    public Persona(){
    }
    
    public Persona(String _DNI, String _nombre, String _apellido1, String _apellido2){
        DNI = _DNI;
        nombre = _nombre;
        apellido1 = _apellido1;
        apellido2 = _apellido2;
    }
    
    //metodos
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    public String toString(){
        return nombre + " con apellidos " + apellido1 + " " + apellido2 + " con dni " + DNI;
    }
}
