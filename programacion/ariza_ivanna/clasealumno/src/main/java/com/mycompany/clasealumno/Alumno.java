/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasealumno;

/**
 *
 * @author Nocturno
 */
public class Alumno {
    //atributo
    private String nombre;
    
    //constructor 
    public Alumno (String _alumno){
        this.nombre = _alumno;
    }

    public String getAlumno() {
        return nombre;
    }

    public void setAlumno(String alumno) {
        this.nombre = alumno;
    }
    
}
