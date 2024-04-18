/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploanimal;

/**
 *
 * @author Nocturno
 */
public class Animal {
    //atributos
    private String nombre;
    private String tipo_alimentacion;
    private int edad;
    
    //constructores
    public Animal(){
    }
    
    public Animal(String _nombre, String _tipo_alimentacion, int _edad){
        nombre = _nombre;
        tipo_alimentacion = _tipo_alimentacion;
        edad = _edad;
    }
    
    //metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        return "Este animal con nombre " + nombre + ", tipo de alimentacion " + tipo_alimentacion + " y edad " + edad;
    }
    
}
