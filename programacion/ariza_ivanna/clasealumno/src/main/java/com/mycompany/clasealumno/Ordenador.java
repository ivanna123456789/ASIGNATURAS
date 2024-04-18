/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasealumno;

/**
 *
 * @author Nocturno
 */
public class Ordenador {
    //atributos
    private teclado teclado;
    private String nombre;
    
    //constructor
    public Ordenador(teclado _teclado){
        this.teclado = _teclado;
    }
    
    //

    public teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(teclado teclado) {
        this.teclado = teclado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
